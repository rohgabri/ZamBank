import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo (F ou M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int cervejas = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int refrigerantes = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int espetinhos = sc.nextInt();

        double ingresso = (sexo == 'F' || sexo == 'f') ? 8.0 : 10.0;

        double consumo = (cervejas * 5) + (refrigerantes * 3) + (espetinhos * 7);

        double couvert = (consumo > 30) ? 0 : 4.0;

        double valorTotal = consumo + couvert + ingresso;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvert);
        System.out.printf("Ingresso = R$ %.2f\n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

        sc.close();
    }
}
