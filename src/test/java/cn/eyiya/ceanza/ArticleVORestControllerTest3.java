package cn.eyiya.ceanza;

import cn.eyiya.ceanza.model.ArticleVO;
import cn.eyiya.ceanza.service.ArticleRestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @PackageName: cn.eyiya.ceanza
 * @ClassName: ArticleRestControllerTest
 * @Author: G-John
 * @Date: 2019/11/6 0006下午 8:27
 * @Content 1、@WebMvcTest 只对controller层做测试，@SpringBootTestt加载完整的应用程序并注入所有可能的bean，因此速度会很慢
 *          2、@MockBean 模拟service层，实际不执行service层
 *          3、打桩 when(articleRestService.saveArticle(article1)).thenReturn("ok");
 */
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@Slf4j
//@SpringBootTest //提供测试需要的上下文ApplicationContext，并没有创建servlet容器
@WebMvcTest //只测试controller层
public class ArticleVORestControllerTest3 {

    @MockBean //作用见下面打桩的注解
    private ArticleRestService articleRestService;

    @Resource
    private MockMvc mockMvc;

    /*@Before
    public void setController() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleRestController()).build();
    }*/

    @Test
    public void saveArticle() throws Exception {

        String article = "{\n" +
                "    \"id\": 1,\n" +
                "    \"author\": \"zimug\",\n" +
                "    \"title\": \"手摸手教你开发spring boot\",\n" +
                "    \"content\": \"c\",\n" +
                "    \"createTime\": \"2017-07-16 05:23:34\",\n" +
                "    \"reader\":[{\"name\":\"zimug\",\"age\":18},{\"name\":\"kobe\",\"age\":37}]\n" +
                "}";


        ObjectMapper obj = new ObjectMapper();
        ArticleVO articleVO1 = obj.readValue(article, ArticleVO.class);


        //打桩 如果articleRestService.saveArticle(article1)执行，就返回ok。模拟service执行，实际service并没有真正执行。
        //when(articleRestService.saveArticle(articleVO1)).thenReturn("ok");

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.request(HttpMethod.POST, "/rest/article")
                        .contentType("application/json").content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("zimug"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(18))
                .andDo(print())
                .andReturn();

        log.info(result.getResponse().getContentAsString());


        //模拟GET请求：
        //mockMvc.perform(MockMvcRequestBuilders.get("/user/{id}", userId));

        //模拟Post请求：
        //mockMvc.perform(MockMvcRequestBuilders.post("uri", parameters));

        //模拟文件上传：
        //mockMvc.perform(MockMvcRequestBuilders.multipart("uri").file("fileName", "file".getBytes("UTF-8")));


        //模拟session和cookie：
        //mockMvc.perform(MockMvcRequestBuilders.get("uri").sessionAttr("name", "value"));
        //mockMvc.perform(MockMvcRequestBuilders.get("uri").cookie(new Cookie("name", "value")));

        //设置HTTP Header：
        /*mockMvc.perform(MockMvcRequestBuilders
                .get("uri", parameters)
                .contentType("application/x-www-form-urlencoded")
                .accept("application/json")
                .header("", ""));*/

    }

}
