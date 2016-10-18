package com.hospital.db.persistence.mapper;

import com.hospital.db.persistence.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangjj on 16-10-18.
 */
@Mapper
public interface UserMapper {
  User findById(int id);
}
