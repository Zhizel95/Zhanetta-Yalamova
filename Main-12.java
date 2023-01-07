import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double radius = Math.sqrt(sc.nextDouble())/2.0;
    double side =  Math.sqrt(sc.nextDouble());
    
    System.out.println("Side = "+ side);
    System.out.println("Radius = " + radius);
    
    if (side ==radius)
    {
    System.out.println("Площадь круга равна площади квадрата!");  
    }
    else if(side>radius)
    {
    System.out.println("Круг можно вписать в квадрат!");
    }
    else if(side<radius)
    {
    System.out.println("Квадрат можно вписать в круг!");
    }
  }
}