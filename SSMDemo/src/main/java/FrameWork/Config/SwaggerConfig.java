package FrameWork.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by forget on 2019/10/12.
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket SwaggerDocket(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2);
        docket.select()
                .apis(RequestHandlerSelectors.basePackage("FrameWork.Controller"))
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title("SSM框架整合Swagger")
                        .description("整合测试使用").version("1.0")
                        .contact(new Contact("何康家","127.0.0.1","670378784@qq.com"))
                        .termsOfServiceUrl("127.0.0.1/team").build());
        return docket;
    }
//    @Bean
//    public RequestMappingInfoHandlerMapping requestMappingInfoHandlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
}
