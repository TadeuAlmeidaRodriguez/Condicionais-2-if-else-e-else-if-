import java.util.Scanner;

public class Atividade1
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número: ");
            float numero_avaliado = entrada.nextFloat();

            if (numero_avaliado == 0)
            {
                System.out.printf ("O número é igual a zero");
            }
            else if (numero_avaliado < 0)
            {
                System.out.printf ("O número é menor que zero");
            }
            else
            {
                System.out.printf ("O número é maior que zero");
            }
        }
    }
