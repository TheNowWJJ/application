package cn.veryjava.webapp.controller;

import cn.veryjava.db.persistence.entity.User;
import cn.veryjava.db.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjj on 16-10-18.
 */
@Controller
public class IndexController {

  @Autowired
  private UserMapper userMapper;

  @RequestMapping("/")
  public String index() {

    User user = userMapper.findById(1);
    System.out.println(user);

    return "index";
  }
}