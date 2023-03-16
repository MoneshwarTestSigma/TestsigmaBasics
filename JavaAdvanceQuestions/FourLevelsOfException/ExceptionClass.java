import java.io.IOException;
import java.sql.SQLException;

public class ExceptionClass {
    void method1() throws AException
    {
        int error=10;
        try {
            method2();
        }
        catch (SQLException e)
        {
            error+=100;
            System.out.println("Error of method1 change :"+error);
            throw new AException();
        }

    }
    void method2() throws SQLException
    {
        int error=20;
        try{
            method3();
        }
        catch (IOException e)
        {
            error+=100;
            System.out.println("Error of method2 change :"+error);
            throw new SQLException();
        }

    }
    void method3() throws IOException
    {
        int error=30;
        try{
            method4();
        }
        catch (ArithmeticException e)
        {
            error+=100;
            System.out.println("Error of method3 change :"+error);
            throw new IOException();
        }

    }
    void method4() throws ArithmeticException
    {
        int error=40;
        try{
            int a= Integer.parseInt(null);
            System.out.println(a);
        }
        catch (NumberFormatException e)
        {
            error+=100;
            System.out.println("Error of method4 change :"+error);
            throw new ArithmeticException();
        }

    }
}
