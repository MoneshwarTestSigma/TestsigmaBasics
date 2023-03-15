import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader in=new FileReader("input.txt");  //16 bit at a time
            FileWriter out=new FileWriter("output.txt");
//            FileInputStream in=new FileInputStream("input.txt");  //8 bit at a time
//            FileOutputStream out=new FileOutputStream("output.txt");
            int x;

            while((x=in.read())!=-1)
            {
                out.write(x);
            }
            in.close();
            out.close();
            System.out.println("Success");

        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}