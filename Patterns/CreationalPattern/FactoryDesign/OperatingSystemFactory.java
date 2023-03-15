public class OperatingSystemFactory {
    public OperatingSystem getInstance(String str)
    {
        if(str=="open")
            return new Android();
        else if(str=="secure")
            return new IOS();
        else
            return new Windows();

    }
}
