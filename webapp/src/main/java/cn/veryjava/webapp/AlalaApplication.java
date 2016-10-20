package cn.veryjava.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wangjj on 16-10-18.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.veryjava.db", "cn.veryjava.logic","cn.veryjava.webapp"})
public class AlalaApplication {
  public static void main(String[] args) {
    SpringApplication.run(AlalaApplication.class, args);
  }
}
