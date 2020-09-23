package cc.niushuai.study.springcloud.starter.hutooldb.user.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author ns
 * @date 2020/9/23
 */
@Data
@Accessors(chain = true)
public class User {

    private Long id;
    private String name;
    private LocalDateTime createTime;
}
