package cn.eyiya.ceanza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class CeanzaApplicationTests {

    @Test
    void contextLoads() {

    }

    private static Map<Integer, Integer> map = new HashMap<>(2);


    private Integer x = 0;
    @Test
    public void test(){
        HashMap<String, Object> uuu = new HashMap<String, Object>(2);
        uuu.put("1", new Object[]{"1"});
        for (int i=0; i<10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    /*while (atomicInteger.get() < 1000){
                        map.put(atomicInteger.get(), atomicInteger.get());
                        atomicInteger.incrementAndGet();
                        System.out.println("第"+atomicInteger+"次");
                    }*/
                    for(int y=0; y<1000; y++){
                        x++;
                        System.out.println(x);
                    }
                }
            }).start();
        }
    }


}
