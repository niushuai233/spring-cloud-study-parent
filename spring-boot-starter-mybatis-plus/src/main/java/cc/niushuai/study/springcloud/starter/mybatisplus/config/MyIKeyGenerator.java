package cc.niushuai.study.springcloud.starter.mybatisplus.config;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;

/**
 * @author ns
 * @date 2020/9/22
 */
public class MyIKeyGenerator implements IKeyGenerator {
    /**
     * 执行 key 生成 SQL
     *
     * @param incrementerName 序列名称(对应类上注解 {@link KeySequence#value()} 的值)
     * @return sql
     */
    @Override
    public String executeSql(String incrementerName) {
        System.out.println("incrementerName=" + incrementerName);
        return System.currentTimeMillis() + "-niushuai";
    }
}
