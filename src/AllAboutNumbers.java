import java.util.Scanner;

public class AllAboutNumbers {

public static void main(String args[]) {

    int num1, num2, num3;
    int highest = Integer.MIN_VALUE;
    int lowest = Integer.MAX_VALUE;

    Scanner keyboard = new Scanner(System.in);
    for(int i=0; i<10; i++){
    System.out.print("Please enter your first number:");
    num1 = keyboard.nextInt();
    if (num1 > highest){
        highest=num1;
    }
    keyboard.nextLine();

    System.out.print("Please enter your second  number");
    num2 = keyboard.nextInt();
        if (num2 > highest){
            highest=num1;

    keyboard.nextLine();

    System.out.print("Please enter your third number");
    num3 = keyboard.nextInt();
    keyboard.nextLine();

    num1 = keyboard.nextInt();
}



}
}
