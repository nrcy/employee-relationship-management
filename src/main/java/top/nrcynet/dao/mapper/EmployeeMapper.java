package top.nrcynet.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.nrcynet.dao.bean.Employee;

public interface EmployeeMapper {
	
	public Employee selectEmployeeById(Integer id);
	
	public List<Employee> selectEmployeeAll();
	
	public void deleteEmployeeById(Integer id);
	
	public void insertEmployeeByData(@Param("employee") Employee employee);
	
	public void updateEmployeeByData(@Param("employee") Employee employee);
	
}
