import java.io.FileOutputStream;
import java.io.IOException;

public class testcase0003 {
    public static void main(String[] args) throws IOException {
         FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream("test.txt");
            out.write(122);
        }
        catch(IOException io) 
        {
            System.out.println("IO Error.");
        }
        finally 
        {
            out.close();
        }
    }
}
