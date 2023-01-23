import java.util.Scanner;

public class practical1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean repeat=true;
        while(repeat){
            System.out.println("Enter your choice\n0. Exit\n1. Integer\n2. String\n3.Float");
            int opt=input.nextInt();
            switch(opt){
                case 0:{
                    repeat=false;
                    break;
                }case 1:{
                    System.out.print("Enter first integer value:  ");
                    int a,b;
                    a=input.nextInt();
                    System.out.print("Enter first integer value:  ");
                    b=input.nextInt();
                    System.out.printf("Sum: %d\n\n",a+b);
                    break;
                }case 2:{
                    String a,b;
                    System.out.println("Enter first string:\n");
                    a=input.next();
                    System.out.println("Enter second string:\n");
                    b=input.next();
                    System.out.printf("Sum: %s\n\n",(a+b));
                    break;
                }case 3:{
                    System.out.print("Enter first float value:  ");
                    float a=input.nextFloat();
                    System.out.print("Enter second float value: ");
                    float b=input.nextFloat();
                    System.out.printf("Sum:   %.5f\n\n",a+b);
                }
            }
        }
    }
}