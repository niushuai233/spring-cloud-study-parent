package cc.niushuai.study.springcloud.springbootmvc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author ns
 * @date 2020/9/21
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootMvcApplication.class)
public class SpringBootMvcApplicationTest {

    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void sayHelloTest() {

        String result = restTemplate.getForObject("http://localhost:8900/hello", String.class);

        Assert.assertEquals("Hello World!", result);

    }

}
