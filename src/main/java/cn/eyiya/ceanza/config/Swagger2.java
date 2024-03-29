package cn.eyiya.ceanza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author G
 * @date 2019/11/7 10:19
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.eyiya.ceanza"))
                .paths(PathSelectors.regex("/rest/.*"))
                .build();
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("eyiya_API")
                .description("springboot利用swagger2构建api文档")
                .termsOfServiceUrl("http://www.eyiya.cn")
                .version("1.0.0")
                .build();
    }
}
