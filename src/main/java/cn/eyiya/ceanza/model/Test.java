package cn.eyiya.ceanza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author G
 * @date 2019/11/6 14:46
 */

@Data //get、set方法
@AllArgsConstructor //所有参数的构造函数
@NoArgsConstructor //无参构造函数
@Builder //
public class Test {

    private Long id;
    private String testName;

}
