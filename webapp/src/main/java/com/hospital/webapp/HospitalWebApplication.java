package com.hospital.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wangjj on 16-10-18.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hospital.db", "com.hospital.webapp", "com.hospital.logic"})
public class HospitalWebApplication {
  public static void main(String[] args) {
    SpringApplication.run(HospitalWebApplication.class, args);
  }
}
