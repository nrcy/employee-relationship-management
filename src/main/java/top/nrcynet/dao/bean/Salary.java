package top.nrcynet.dao.bean;

public class Salary {

	private Integer id;
	
	private String name;
	
	private Integer salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
