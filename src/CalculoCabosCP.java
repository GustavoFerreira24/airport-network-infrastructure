import java.util.Scanner;

public class CalculoCabosCP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Modo de distribuicao:");
        System.out.println("1 - CP no inicio");
        System.out.println("2 - CP num canto");
        System.out.print("Escolha: ");
        int modo = sc.nextInt();

        System.out.print("Comprimento parede 1 (m): ");
        double p1 = sc.nextDouble();

        System.out.print("Comprimento parede 2 (m): ");
        double p2 = sc.nextDouble();

        System.out.print("Comprimento parede 3 (m): ");
        double p3 = sc.nextDouble();

        System.out.print("Numero de outlets: ");
        int outlets = sc.nextInt();

        double comprimentoTotal = p1 + p2 + p3;
        double d = comprimentoTotal / outlets;

        double total = 0;

        System.out.println();
        System.out.printf("Distancia media: %.2f m\n\n", d);

        StringBuilder soma = new StringBuilder();

        if (modo == 1) {
            // CP no início
            for (int i = 1; i <= outlets; i++) {

                double cabo = i * d;
                total += cabo;

                System.out.printf("Cabo %d: %.2f m\n", i, cabo);

                soma.append(String.format("%.2f", cabo));
                if (i < outlets) soma.append(" + ");
            }

        } else if (modo == 2) {
            // CP num canto
            int metade = outlets / 2;

            for (int i = 1; i <= metade; i++) {

                double cabo = i * d;
                total += cabo;

                System.out.printf("Lado A - cabo %d: %.2f m\n", i, cabo);

                soma.append(String.format("%.2f", cabo));
                soma.append(" + ");
            }

            for (int i = 1; i <= outlets - metade; i++) {

                double cabo = i * d;
                total += cabo;

                System.out.printf("Lado B - cabo %d: %.2f m\n", i, cabo);

                soma.append(String.format("%.2f", cabo));
                if (i < outlets - metade) soma.append(" + ");
            }
        }

        soma.append(String.format(" = %.2f m", total));

        System.out.println("\n" + soma);

        sc.close();
    }
}