import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean qToQuit = false;
        int userInput;
        Scanner scnr = new Scanner(System.in);
        do {
            System.out.println("1 for Square\n2 for rectangle\n3 to quit");
            System.out.print("\nSelection: ");
            userInput = scnr.nextInt();
            System.out.println();
            if(userInput == 1) {
                Square square = new Square();
                square.printSquare();
            }
            if(userInput == 2) {
                Rectangle rectangle = new Rectangle();
                rectangle.printRectangle();
            }
            if(userInput == 3) {
                System.out.println("Goodbye!");
                qToQuit = true;
            }
        }while(!qToQuit);
    }
}
