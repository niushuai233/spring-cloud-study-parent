package cc.niushuai.study.springcloud.springbootmvc;

import org.junit.Test;

import java.util.Base64;

/**
 * @author ns
 * @date 2020/9/21
 */
public class EncodeTest {

    @Test
    public void encodeTest() {

        String s = Base64.getEncoder().encodeToString("xyz".getBytes());

        System.out.println(s);
    }
}
