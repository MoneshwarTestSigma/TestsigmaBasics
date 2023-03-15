public class Manager implements Employee {
    private String name;
    private long empId;

    public Manager(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name );
    }
}
