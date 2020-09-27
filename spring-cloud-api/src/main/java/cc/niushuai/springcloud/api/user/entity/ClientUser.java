package cc.niushuai.springcloud.api.user.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClientUser {

    private String name;
    private Integer age;
}
