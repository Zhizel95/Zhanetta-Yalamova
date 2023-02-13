public class Main {
    public static void main(String[] args) {
      Human man = new Human();
      man.setName("Doni");
      man.setAge(17);
}
 
 class Human{
   String name;
   int age;
   
   public void setName(String myName){
     name = myName;
   }
   public String getName(){
     return name;
   }
   public void setAge(int myAge){
     age = myAge;
   }
   public int getAge(){
     return age;
   }
   public void getInfo(){
     System.out.println(name + "," + age);
     
   }
 } 
}
    

