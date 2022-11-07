import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    

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

        System.out.println("\nWelcome to our Diner! please select n entree:\n"
                      + "1) steak\n"
                      + "2) wings\n"
                      + "3) salad\n"
                      + "and any other number for nothing!");

    int choice = sc.nextInt();

    switch(choice){
      case 1:
        System.out.println("here is your stake");
        break;
      case 2:
        System.out.println("here are your wings");
         break;
      case 3:
        System.out.println("here is your salad");
        break;
      default:
        System.out.println("there is nothing that you might be interested in?");
        break;
    }
     System.out.println("\nPlease select a drink:\n"
                            + "1) iced tea\n"
                            + "2) soda\n"
                            + "3) lemonade\n"
                            + "and any other number for nothing!");
    int drink = sc.nextInt();
    switch(drink){
      case 1:
        System.out.println("here is the iced tea you ordred");
        break;
      case 2:
        System.out.println("here is the soda you orderd");
        break;
      case 3:
        System.out.println("here is the lemonade you orderd");
        break;
      default:
        System.out.println("there is no drink you might be interested in");
        break;
        
    }
    sc.close();
  }
}