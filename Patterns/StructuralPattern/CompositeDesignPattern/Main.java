public class Main
{
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(123, "Monesh");
        Developer dev2 = new Developer(124, "Naveen");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(125, "Srinivas" );
        Manager man2 = new Manager(126, "Akash");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}