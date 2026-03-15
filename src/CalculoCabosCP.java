import java.util.Scanner;

public class CalculoCabosCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Comprimento da parede 1 (m): ");
        double parede1 = sc.nextDouble();

        System.out.print("Comprimento da parede 2 (m): ");
        double parede2 = sc.nextDouble();

        System.out.print("Comprimento da parede 3 (m): ");
        double parede3 = sc.nextDouble();

        System.out.print("Numero de outlets: ");
        int outlets = sc.nextInt();

        if (outlets <= 0) {
            System.out.println("O numero de outlets tem de ser maior que 0.");
            sc.close();
            return;
        }

        double comprimentoTotalParedes = parede1 + parede2 + parede3;
        double distanciaMedia = comprimentoTotalParedes / outlets;
        double totalCabos = 0.0;

        System.out.println();
        System.out.printf("Comprimento total das paredes: %.2f m%n", comprimentoTotalParedes);
        System.out.printf("Distancia media entre outlets: %.2f m%n", distanciaMedia);
        System.out.println();

        StringBuilder expressao = new StringBuilder();

        for (int i = 1; i <= outlets; i++) {
            double comprimentoCabo = i * distanciaMedia;
            totalCabos += comprimentoCabo;

            System.out.printf("Comprimento cabo %d: %.2f m%n", i, comprimentoCabo);

            expressao.append(String.format("%.2f", comprimentoCabo));
            if (i < outlets) {
                expressao.append(" + ");
            }
        }

        expressao.append(String.format(" = %.2f m", totalCabos));

        System.out.println();
        System.out.println(expressao);

        sc.close();
    }
}