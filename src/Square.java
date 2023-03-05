import java.util.Scanner;
public class Square {
    char symbol;
    int dimension = 8;
    // Constructor
    public Square() {
        this.symbol = setSymbol();
    }

    private char setSymbol() {
        System.out.print("Enter any symbol: ");
        Scanner scnr = new Scanner(System.in);
        char input = scnr.next().charAt(0);
        return input;
    }
    public void printSquare() {
        System.out.println();
        for(int h = 0; h < dimension; ++h) {
            for(int w = 0; w < dimension; ++w) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
