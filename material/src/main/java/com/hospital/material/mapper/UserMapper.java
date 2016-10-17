package com.hospital.material.mapper;

import com.hospital.material.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.mapper.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
@Mapper
public interface UserMapper {
  User findById(int id);
}
