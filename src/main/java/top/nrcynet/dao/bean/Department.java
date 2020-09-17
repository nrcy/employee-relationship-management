package top.nrcynet.dao.bean;

public class Department {

	private Integer id;
	
	private Integer departmentId;

	private String leader;
	
	private String departmemtName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getDepartmemtName() {
		return departmemtName;
	}

	public void setDepartmemtName(String departmemtName) {
		this.departmemtName = departmemtName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentId=" + departmentId + ", leader=" + leader + ", departmemtName="
				+ departmemtName + "]";
	}
	
}
