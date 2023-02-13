import java.util.Scanner;
/*Даны три вещественных числа а, b, с. Проверить:
1. выполняется ли неравенство а < b < с;
2. выполняется ли неравенство b > а > с.*/
public class Main {
    public static void main(String[] args) {
      
     double a = 19;
     double b = 20;
     double c = 18;
     
     System.out.printf("a = %f, b = %f, c = %f \n", a,b,c);
     
     if (a < b && b <  c && a < c ) {
       System.out.println("a < b < c - Неравенство выполняется");
     }
     else {
       System.out.println("Неравенство не выполняется");
     }
     
     if (b > a && b > c && a > c) {
       System.out.println("b > a > c - Неравенство выполняется");
     }
     else {
       System.out.println("Неравенство не выполняется");
     }
     
  }
}