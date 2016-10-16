package com.hospital.material.service;

import com.hospital.material.domain.User;
import com.hospital.material.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.service.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
@Service
public class UserService {
  @Autowired
  private UserMapper mapper;

  public User findById(int id) {
    return mapper.findById(id);
  }
}
