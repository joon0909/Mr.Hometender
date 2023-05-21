package site.jwhy.mrhometender.hometender;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"site.jwhy.mrhometender.hometender.mapper"})
@SpringBootApplication
public class HometenterApplication {

  public static void main(String[] args) {
    SpringApplication.run(HometenterApplication.class, args);
  }

}
