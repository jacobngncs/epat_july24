package sg.edu.nus.iss.epat.workshop;

public class Salary {
    private float baseSalary;

    public Salary(float salary) {
        this.baseSalary = salary;
    }

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public float computeDeductions() {
        return this.baseSalary * 0.2f;
    }
}
