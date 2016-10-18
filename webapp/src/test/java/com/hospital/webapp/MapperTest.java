package com.hospital.webapp;

import com.hospital.db.persistence.entity.User;
import com.hospital.db.persistence.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wangjj on 16-10-18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HospitalWebApplication.class)
public class MapperTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void testA() {

    User user = userMapper.findById(1);
    System.out.println(user);
  }
}
