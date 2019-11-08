package cn.eyiya.ceanza.util;


import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;


import javax.naming.event.ObjectChangeListener;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

/**
 * @author G
 * @date 2019/11/8 14:51
 */
public class DozerUtils {
    static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass){
        List destinationList = Lists.newLinkedList();
        for(Iterator i$ = sourceList.iterator(); i$.hasNext();){
            Object sourceObject = i$.next();
            Object destinationObject = dozerBeanMapper.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
}
