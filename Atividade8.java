import java.util.Scanner;

public class Atividade8
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            double salario;
            double valor_imposto;
            double ganhos_mensais;

            System.out.printf ("Digite o valor do seu salário em R$ (reais): ");
            salario = entrada.nextFloat();

            double imposto_um = salario * 0;
            double imposto_dois = (salario * 0.075) - 158.40;
            double imposto_tres = (salario * 0.15) - 370.40;
            double imposto_quatro = (salario * 0.225) - 651.73;
            double imposto_cinco = (salario * 0.275) - 884.96;

            if (salario <= 2112)
            {
                System.out.printf ("O valor que você pagará de imposto é: %.2f",imposto_um);
            }
            else if (salario > 2112 && salario <= 2826.65)
            {
                System.out.printf ("O valor que você pagará de imposto é: %.2f", imposto_dois);
            }
            else if (salario > 2826.65 && salario <= 3751.05)
            {
                System.out.printf ("O valor que você pagará de imposto é: %.2f", imposto_tres);

            }
            else if (salario > 3751.05 && salario <= 4664.68)
            {
                System.out.printf ("O valor que você pagará de imposto é: %.2f", imposto_quatro);
            }
            else
            {
                System.out.printf ("O valor que você pagará de imposto é: %.2f", imposto_cinco);
            }
        }

    }
