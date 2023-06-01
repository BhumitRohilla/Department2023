import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class practical14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String you want to enter\n");
        
        String str;
        str = scan.nextLine();

        try{
            FileWriter fw = new FileWriter("input.txt");
            fw.write(str);
            fw.close();

            FileReader fr = new FileReader("input.txt");
            int ch;
            while((ch = fr.read()) != -1 ){
                System.out.print((char)ch);
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }


    }
}
