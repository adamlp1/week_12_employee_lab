package staff.management;
import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int natInsuranceNum, double salary, String deptName) {
        super(name, natInsuranceNum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
