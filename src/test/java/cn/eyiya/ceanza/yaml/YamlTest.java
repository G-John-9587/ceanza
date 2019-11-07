package cn.eyiya.ceanza.yaml;

import cn.eyiya.ceanza.controller.ArticleRestController;
import cn.eyiya.ceanza.model.yaml.Family;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @PackageName: cn.eyiya.ceanza
 * @ClassName: ArticleRestControllerTest
 * @Author: G-John
 * @Date: 2019/11/6 0006下午 8:27
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class YamlTest {
    @Autowired
    Family family;

    @Test
    public void myFamily(){
        System.out.println(family.toString());
    }

}
