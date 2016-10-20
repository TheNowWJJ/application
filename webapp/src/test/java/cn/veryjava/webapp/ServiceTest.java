package cn.veryjava.webapp;

import cn.veryjava.db.persistence.entity.User;
import cn.veryjava.logic.service.impl.mtr.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wangjj on 16-10-18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlalaApplication.class)
public class ServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void TestB() {
    User user = userService.findById(1);

    System.out.println(user);
  }
}
