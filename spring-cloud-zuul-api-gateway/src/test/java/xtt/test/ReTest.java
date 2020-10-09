package xtt.test;

import cn.hutool.core.util.ReUtil;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ns
 * @date 2020/9/29
 */
public class ReTest {

    String p = ".*E([0-9A-Z]{2})20([0-9])[0-9]{14}.*";
    String str = "{\"LOGISTICSCAR_ID\": \"\", \"type\":\"1\",\"logisticsCarId\":\"E0C20200928174228151\"}";

    @Test
    public void re1() {

        String str = "{\"LOGISTICSCAR_ID\": \"\", \"type\":\"1\",\"logisticsCarId\":\"E0C20200928174228151\"}";
        boolean match = ReUtil.isMatch("E([0-9A-Z]{2})20([0-9])[0-9]{14}", str);
        System.out.println(match);
    }

    @Test
    public void re2() {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(str);

        boolean matches = matcher.matches();

        System.out.println(matches);

    }

    @Test
    public void re3() {
        Pattern pattern = Pattern.compile(".*E([0-9A-Z]{2})20([0-9]){15}.*");

        Matcher m1 = pattern.matcher("E0C20200928174228151");
        System.out.println(m1.matches());

        Matcher m2 = pattern.matcher("{\"LOGISTICSCAR_ID\": \"\", \"type\":\"1\",\"logisticsCarId\":\"E0C20200928174228151\"}");
        System.out.println(m2.matches());

    }


}
