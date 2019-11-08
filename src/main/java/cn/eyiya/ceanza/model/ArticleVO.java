package cn.eyiya.ceanza.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value={"content", "title"}) //改变json子属性的默认定义的顺序
public class ArticleVO {


    @JsonIgnore //排除属性不做序列化与反序列化
    private Long id;
    @JsonProperty //为属性换一个别名
    private String author;
    private String title;
    private String content;
    @JsonInclude(JsonInclude.Include.NON_NULL)//排除为空的元素不做序列化反序列化
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") //指定属性格式
    private Date createTime;
    private List<Reader> reader;


}
