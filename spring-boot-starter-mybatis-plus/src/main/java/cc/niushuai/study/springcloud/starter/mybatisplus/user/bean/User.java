package cc.niushuai.study.springcloud.starter.mybatisplus.user.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ns
 * @date 2020/9/22
 */
@Data
@Accessors(chain = true)
public class User {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String name;
    private Integer age;
    private String email;
}