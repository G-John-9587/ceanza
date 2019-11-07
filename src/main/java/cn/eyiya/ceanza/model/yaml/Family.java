package cn.eyiya.ceanza.model.yaml;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * @author G
 * @date 2019/11/7 15:39
 * @content                          @ConfigurationProperties  |  @Value
 *              功能                         批量注入                一个个指定
 *              松散语法绑定                  支持                      不支持
 *              SpEL                        不支持                     支持
 *              复杂数据类型（嵌套）           支持                      不支持
 *              JSR303数据校验               支持                      不支持
 *
 */
@Data
@Component //把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@Validated //数据校验
@ConfigurationProperties(prefix = "family") //整个对象注入
public class Family {

    //@Value("${family.family-name}") //单字段注入，有@Validated时，不能用
    @NotNull
    /*@Size(min=6, max=20, message="密码长度只能在6-20之间")
    @Email
    @Length(min=5, max=20, message="用户名长度必须在5-20之间")
    @Max(value=100, message="提示")
    @Min(value=10, message="提示")
    @AssertTrue(message="bln4 must is true")
    @AssertFalse(message="bln4 must is falase")
    @DecimalMax(value="100", message="decim最大值是100")
    @DecimalMin(value="40", message = "decim最小值40")
    @Pattern(regexp="正则", message="提示")*/
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
