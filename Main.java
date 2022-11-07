import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    sc.close();

    int y = 5;

    if(y > 0){
      System.out.println("true");
    }
    if(y == 5){
      System.out.println("true");
      
    }else{
      System.out.println("false");
    }
    if(age > 18){
      System.out.println("your so beautiful");
    }
    if(age == 18){
      System.out.println("you are cute");
    }
    else{
      System.out.println("your ugly");
    }
  }
}