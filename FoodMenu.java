import java.util.Scanner;

public class FoodMenu{

public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int dosaQty=0, teaQty=0 ,SamosaQty=0, SandwitchQty=0;
    do{

    System.out.println("*** Welcome to Food Menu ***");

System.out.println("1. Dosa (Rs. 100)"); System.out.println("2. Tea (Rs. 10)");

System.out.println("3. Samosa (Rs. 20)"); System.out.println("4. Sandwitch (Rs. 50)");

System.out.println("5. Generate Bill");

System.out.println("Enter your choice: ");

int choice = scan.nextInt();

switch(choice) {

case 1:
    dosaQty = qty;
break;

case 2:
    teaQty = qty;

 break;

case 3:
    SamosaQty =

break; case 4:

break;

case 5

default: System.out.println("Invalid choice, try again");

}
}
}