import java.util.Scanner;

public class Rectangle {
    char symbol;
    int height;
    int width;
    // Constructor
    public Rectangle() {
        this.symbol = setSymbol();
        this.height = setHeight();
        this.width = setWidth();
    }

    private char setSymbol() {
        System.out.print("Enter any symbol: ");
        Scanner scnr = new Scanner(System.in);
        char input = scnr.next().charAt(0);
        return input;
    }
    private int setHeight() {
        System.out.println("Enter desired height: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
    private int setWidth() {
        System.out.println("Enter desired width: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
    public void printRectangle() {
        System.out.println();
        for(int h = 0; h < height; ++h) {
            for(int w = 0; w < width; ++w) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
