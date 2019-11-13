package cn.eyiya.ceanza.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document(collection = "article")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value={"content", "title"}) //改变json子属性的默认定义的顺序
public class Article implements Serializable {
    private static final long serialVersionUID = 5365119962377823582L;
    //@JsonIgnore //排除属性不做序列化与反序列化
    @Id
    private String id;
    //@JsonProperty //为属性换一个别名
    private String author;
    @Indexed //索引
    private String title;
    @Field("msgContent") //别名
    private String content;
    //@JsonInclude(JsonInclude.Include.NON_NULL)//排除为空的元素不做序列化反序列化
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") //指定属性格式
    @CreatedDate
    private Date createTime;
    private List<Reader> reader;


}
