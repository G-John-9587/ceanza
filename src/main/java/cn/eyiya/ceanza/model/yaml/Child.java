package cn.eyiya.ceanza.model.yaml;

import lombok.Data;

import java.util.List;

/**
 * @author G
 * @date 2019/11/7 15:42
 */
@Data
public class Child {
    private String name;
    private String age;
    private List<Friends> friendsList;
}
