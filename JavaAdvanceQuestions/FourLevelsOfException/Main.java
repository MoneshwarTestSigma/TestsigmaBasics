public class Main {
    public static void main(String[] args) {
        ExceptionClass exceptionClass=new ExceptionClass();
        try
        {
            exceptionClass.method1();
        }
        catch (AException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}