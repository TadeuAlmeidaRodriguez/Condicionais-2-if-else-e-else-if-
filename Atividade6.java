import java.util.Scanner;

public class Atividade6
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.printf ("Digite uma constante para x: ");
            double numero_x = entrada.nextFloat();

            if (numero_x <= -100)
            {
                System.out.printf ("A sentença terá o valor de %.2f", (numero_x - 5));
            }
            else if (numero_x > -100 && numero_x < 0)
            {
                System.out.printf ("A sentença terá o valor de %.2f", numero_x);
            }
            else
            {
                System.out.printf ("A sentença terá o valor de %.2f", numero_x + 5);
            }


        }
    }
