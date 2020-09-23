package cc.niushuai.study.springcloud.starter.mybatisplus.config;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;

/**
 * @author ns
 * @date 2020/9/22
 */
public class CustomerIdentifierGenerator implements IdentifierGenerator {
    /**
     * 生成Id
     *
     * @param entity 实体
     * @return id
     */
    @Override
    public Number nextId(Object entity) {
        int randomInt = RandomUtil.randomInt(10, 2000);
        System.out.println("randomInt = " + randomInt);
        return 0 + randomInt;
    }

    /**
     * 生成uuid
     *
     * @param entity 实体
     * @return uuid
     */
    @Override
    public String nextUUID(Object entity) {
        return "niushuai-nextid-" + System.currentTimeMillis();
    }
}
