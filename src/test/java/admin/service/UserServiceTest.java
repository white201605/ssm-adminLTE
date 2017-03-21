package admin.service;

import com.informationstorm.admin.model.FrontUser;
import com.informationstorm.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by JoinHan on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addFrontUserTest(){
        FrontUser frontUser = new FrontUser();
        frontUser.setName("张三");
        frontUser.setPassword("123");
        frontUser.setAccount("zhangsan@qq.com");
        frontUser.setCreateTime(new Date());
        userService.addFrontUser(frontUser);

    }
}
