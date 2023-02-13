import java.util.Scanner;
/*Данодвузначноечисло. Определить: 
1. Является ли сумма его цифр двузначным числом
2. Больше ли самого числа сумма его цифр
*/
public class Main {
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a/10;
    int c = a%10;
    
    System.out.println("Дано двузначное число " + a);
    
    System.out.printf("%d + %d = %d\n",b,c,b+c);
    
    if(b+c<10){
      System.out.println("Сумма цифр числа не является двузначным числом");
    }
    else {
      System.out.println("Сумма цифр числа является двузначным числом");
    }
  }
}