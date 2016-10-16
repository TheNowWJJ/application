package com.hospital.material.service;

import com.hospital.material.MaterialApplication;
import com.hospital.material.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.service.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MaterialApplication.class)
public class UserServiceTest {

  @Autowired
  private UserService service;

  @Test
  public void testFindById() {
    User user = service.findById(2);

    Assert.assertNotEquals(null, user);

    System.out.println(user);
  }
}