package org.example;
import java.util.Scanner;

public class App {
  public int getInput() {
    int input;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print("\nPlease enter an integer value: ");
        input = scanner.nextInt();
        if ((input < 0) || (input > 10)) {
            System.out.println("\nPlease enter a valid integer value.");
        }
    }
    while ((input < 0) || (input > 10)); 
    scanner.close();
    return input;
  }
  

  public static void main(String[] args) {
    App app = new App();
    int value = app.getInput();
    System.out.println("\nThe value chosen by the user is: " + value);
  }
}
