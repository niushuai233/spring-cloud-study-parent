package cc.niushuai.study.springcloud.feign.user.servive.fallback;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.springcloud.api.user.entity.ClientUser;
import cc.niushuai.study.springcloud.feign.user.servive.UserService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ns
 * @date 2020/9/27
 */
@Slf4j
@Component
public class UserServiceFallback implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {

        log.error("==================================================================================");
        log.error("{}", throwable.getMessage());
        log.error("==================================================================================");

        return new UserService() {
            @Override
            public Result randomUserInfo() {
                return Result.error("randomUserInfo fallback");
            }

            @Override
            public Result getUserInfo1(String name, Integer age) {
                return Result.error("getUserInfo1 fallback");
            }

            @Override
            public Result getUserInfo2(String name, Integer age) {
                return Result.error("getUserInfo2 fallback");
            }

            @Override
            public Result getUserInfo3(ClientUser clientUser) {
                return Result.error("getUserInfo3 fallback");
            }
        };
    }
}
