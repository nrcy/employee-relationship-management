package top.nrcynet.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import top.nrcynet.dao.bean.Department;

public interface DepartmentMapper {

	public Department selectDepartmentById(Integer id);
	
	public List<Department> selectDepartmentAll();
	
	public void deleteDepartmentById(Integer id);
	
	public void insertDepartmentByData(@Param("department") Department department);
	
	public void updateDepartmentByData(@Param("department") Department department);
	
}
