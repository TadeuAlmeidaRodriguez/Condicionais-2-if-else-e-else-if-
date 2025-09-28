import java.util.Scanner;

public class Atividade7
    {
        public static void main (String[] args)
        {Scanner entrada = new Scanner (System.in);

        double variavel_x;

        System.out.printf ("Digite um número real: ");
        variavel_x = entrada.nextFloat();

        if (variavel_x <= -100)
        {
            System.out.printf ("A função para esse valor é f(x) = x - 5, portante o resultade de x é: %.1f", (variavel_x - 5));

        }
        else if (variavel_x < 0 && variavel_x > -100)
        {
            System.out.printf ("A função para esse valor é f(x) = x, portanto o resultado de x é: %.1f", variavel_x);
        }
        else
        {
            System.out.printf ("A função para esse valor é f(x) = x + 5, portanto o resultade de x é: %.1f", (variavel_x + 5));
        }
        }



    }
