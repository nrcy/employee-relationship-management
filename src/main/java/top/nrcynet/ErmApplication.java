package top.nrcynet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.nrcynet.dao.mapper")
@SpringBootApplication
public class ErmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErmApplication.class, args);
	}

}
