package com.hospital.material;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
@Controller
@RequestMapping("/")
public class IndexController {

  @RequestMapping("/")
  public String index(){
    return "index";
  }

}
