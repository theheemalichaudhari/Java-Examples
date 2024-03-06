import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //buffered reader takes input only in strings
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        int num;
        System.out.println("Enter a number : ");
        num = Integer.parseInt(br.readLine());
        System.out.println("Number entered is : "+num);
    }
}
