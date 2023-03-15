public class Main {
    public static void main(String[] args) {
        //  OperatingSystem obj=new Android();   //This one is very difficult to add a new OS for this we go for factory methord
        OperatingSystemFactory obj=new OperatingSystemFactory();
        OperatingSystem os=obj.getInstance("secure");
        //secure -> IOS
        //open-> Android
        //computer -> windows
        os.getDetails();
    }
}