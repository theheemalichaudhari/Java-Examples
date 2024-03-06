import java.io.File;
public class FileDemo 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("abc.txt");
        if(f.createNewFile())
        {
            System.out.println("abc.txt file is created");

        }
        else
        {
            System.out.println("abc.txt file is not created");
        }
    }

    
}
