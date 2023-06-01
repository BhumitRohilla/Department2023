import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int choice;

        while(true){
            
            System.out.printf("Select:\n1: Area of Circle\n2: Area  of Rectange\n3: Area of Square\n4: Exit\n");
            choice = scan.nextInt();
            
            Shape obj;

            switch(choice){
                case 1:{
                    float radius = scan.nextFloat();
                    obj = new Circle(radius);
                    System.out.printf("Area of circle %f", obj.findArea());
                    break;
                }
                case 2:{
                    float length,breadth;
                    length = scan.nextFloat();
                    breadth= scan.nextFloat();
                    obj = new Rectange(length, breadth);
                    System.out.printf("Area of circle %f", obj.findArea());
                    break;
                }
                case 3:{
                    float side;
                    side = scan.nextFloat();
                    obj = new Square(side);
                    System.out.printf("Area of circle %f", obj.findArea());
                    break;
                }
                case 4:{
                    System.out.print("Program executed succesfully");
                    return ;
                }
            }
        }
    }
}

abstract class Shape{
    abstract public float findArea();
}

class Circle extends Shape{
    float radius;
    public Circle(float radius){
        super();
        this.radius = radius;
    }

    public float findArea(){
        return 3.14f * radius * radius;
    }
}

class Rectange extends Shape{
    float length,breadth;
    public Rectange(float length, float breadth){
        this.breadth = breadth;
        this.length  = length;   
    }

    public float findArea(){
        return length*breadth;
    }
}

class Square extends Rectange{
    public Square( float side ){
        super(side, side);
    }
}
