import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double rendaSalario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServico = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = sc.nextDouble();

        double salarioMensal = rendaSalario / 12;
        double impostoSalario = 0.0;

        if (salarioMensal >= 5000) {
            impostoSalario = rendaSalario * 0.20;
        } else if (salarioMensal >= 3000) {
            impostoSalario = rendaSalario * 0.10;
        }

        double impostoServico = rendaServico * 0.15;

        double impostoCapital = rendaCapital * 0.20;

        double impostoBruto = impostoSalario + impostoServico + impostoCapital;

        double maxDeducao = impostoBruto * 0.30;
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        double abatimento = Math.min(gastosDedutiveis, maxDeducao);

        double impostoDevido = impostoBruto - abatimento;

        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
        System.out.println("\n* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maxDeducao);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);
        System.out.println("\n* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
        System.out.printf("Abatimento: %.2f\n", abatimento);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

        sc.close();
    }
}
