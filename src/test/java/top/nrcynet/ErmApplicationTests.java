package top.nrcynet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import top.nrcynet.dao.mapper.EmployeeMapper;

@SpringBootTest
class ErmApplicationTests {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Test
	void contextLoads() {
		
		System.out.println(employeeMapper.selectEmployeeAll());
		
	}

}
