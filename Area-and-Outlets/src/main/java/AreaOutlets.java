import java.util.*;

public class AreaOutlets {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Digite a escala: ");
        double escala = 0;

        try {
            escala = Double.parseDouble(sc.nextLine().trim());
            escala = escala / 100;
        } catch (Exception e) {
            System.out.println("Invalid option.");
        }
        
        while(true) {

            System.out.println();
            System.out.printf("Digite a largura (width/para cima): ");
            double width = Double.parseDouble(sc.nextLine().trim());
            width = width / 100;

            System.out.printf("Digite a comprimento (length/para os lados): ");
            double length = Double.parseDouble(sc.nextLine().trim());
            length = length / 100;

            double widthReal = (width * 50) / escala;
            double lengthReal = (length * 50) / escala;

            double area = widthReal * lengthReal;
            double outlets = (area * 2) / 10;
            int outletsInt = (int) Math.floor(outlets);

            System.out.printf("Width: %f", widthReal);
            System.out.println();
            System.out.printf("Length: %f", lengthReal);
            System.out.println();
            System.out.printf("Area: %f", area);
            System.out.println();
            System.out.printf("Outlets: %d", outletsInt);
            System.out.println();

        }

    }
}
