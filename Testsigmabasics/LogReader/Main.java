import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        ArrayList<String> loggerDetails=new ArrayList<>();
        try(FileInputStream in=new FileInputStream("input.txt");)
        {

            int singleLetter;
            String singleLine="";
            while((singleLetter=in.read())!=-1)
            {
                if(singleLetter=='\n')
                {
                    loggerDetails.add(singleLine);
                    singleLine="";
                }
                else {
                    singleLine+=(char)singleLetter;
                }
            }
            Logger logger=new Logger(loggerDetails.get(0),loggerDetails.get(1),loggerDetails.get(2));
            logger.getDetails();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
};