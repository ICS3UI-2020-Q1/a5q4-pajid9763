import java.util.Scanner;
/**
 * program that calculates interest rate
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  // ask the user to enter a starting balance 
  System.out.println("Please enter a starting balance");
  double balance = input.nextDouble();

  // ask the user to enter a interest rate
  System.out.println("Please enter your interest rate");
  double rate = input.nextDouble();
  double ratePercent = rate/100;

  // ask the user how many years they are investing
  System.out.println("Please enter the number of years you will invest for");
  double year = input.nextDouble();

  // calculate sum of interest rate
  for (double i = 1; i <= year; i++){
    double sum = balance * ratePercent;
    balance += sum;
  }
    // tell the user their final balance
    System.out.println("Your final balance would be $" + balance);
  }
}
