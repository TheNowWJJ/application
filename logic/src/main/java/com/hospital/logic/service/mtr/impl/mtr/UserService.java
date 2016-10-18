package com.hospital.logic.service.mtr.impl.mtr;

import com.hospital.db.persistence.entity.User;
import com.hospital.db.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangjj on 16-10-18.
 */
@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public User findById(int id) {
    return userMapper.findById(id);
  }
}
