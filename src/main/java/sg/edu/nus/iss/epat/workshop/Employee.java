package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
	private String name;
	private Salary salary;
	// private float salary;
	
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = new Salary(salary);
		// this.salary = salary;
	}

	// public float getBaseSalary() { return salary; }
	public String getName() { return name;}
	// public float computeDeductions() { return salary*0.2f;}
	public abstract float variableComponent();
	
	public float computeSalary() {
		return salary.getBaseSalary() - salary.computeDeductions() + variableComponent();
	};
	
}

