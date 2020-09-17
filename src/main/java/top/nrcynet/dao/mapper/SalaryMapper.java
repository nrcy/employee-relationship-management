package top.nrcynet.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.nrcynet.dao.bean.Salary;

public interface SalaryMapper {

	public Salary selectSalaryById(Integer id);
	
	public List<Salary> selectSalaryAll();
	
	public void deleteSalaryById(Integer id);
	
	public void insertSalaryByData(@Param("salary") Salary salary);
	
	public void updateSalaryByData(@Param("salary") Salary salary);
	
}
