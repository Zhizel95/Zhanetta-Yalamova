import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double radius = 15;
      double side = 15;
      double pi =  Math.PI;
      double s1 = radius* radius*pi;
      double s2 =  side* side;
      
     System.out.println("Радиус круга = "+radius);
     System.out.println("Сторона квадрата = " +side);
     if (radius<=0){
       System.out.println("Ошибка");
     } 
     else 
     if (side<=0) {
       System.out.println("Ошибка");
     }
     else
     if (s1>s2) {
       System.out.println("Площадь круга больше площади квадрата");
     }
     else
     if (s2>s1) {
       System.out.println("Площадь квадрата больше площади круга");
     }
     else {
       System.out.println("Площади равны");
     }
    
  }
}