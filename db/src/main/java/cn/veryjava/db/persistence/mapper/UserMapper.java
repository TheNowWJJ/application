package cn.veryjava.db.persistence.mapper;

import cn.veryjava.db.persistence.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangjj on 16-10-18.
 */
@Mapper
public interface UserMapper {
  User findById(int id);
}
