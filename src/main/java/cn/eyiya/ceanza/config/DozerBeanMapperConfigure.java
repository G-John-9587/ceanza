package cn.eyiya.ceanza.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author G
 * @date 2019/11/8 14:05
 */
@Configuration
public class DozerBeanMapperConfigure {
    @Bean
    public DozerBeanMapper mapper(){
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper;
    }
}
