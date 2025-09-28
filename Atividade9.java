import java.util.Scanner;

public class Atividade9
    {
        public static void main(String[] args)
        {
            float primeiro_numero;
            float segundo_numero;
            float terceiro_numero;


            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número real: ");
            primeiro_numero = entrada.nextFloat();
            System.out.printf ("Digite um outro para ser o segundo numero real: ");
            segundo_numero = entrada.nextFloat();
            System.out.printf ("Digite um outro para ser o terceiro número real: ");
            terceiro_numero = entrada.nextFloat();

            if (primeiro_numero > segundo_numero && primeiro_numero > terceiro_numero && segundo_numero > terceiro_numero)
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", primeiro_numero, segundo_numero, terceiro_numero);
            }
            else if (primeiro_numero > segundo_numero && primeiro_numero > terceiro_numero && terceiro_numero > segundo_numero)
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", primeiro_numero, terceiro_numero, segundo_numero);
            }
            else if (segundo_numero > primeiro_numero && segundo_numero > terceiro_numero && primeiro_numero > terceiro_numero)
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", segundo_numero, primeiro_numero, terceiro_numero);
            }
            else if (segundo_numero > primeiro_numero && segundo_numero > terceiro_numero && terceiro_numero > primeiro_numero)
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", segundo_numero, terceiro_numero, primeiro_numero);
            }
            else if (terceiro_numero > primeiro_numero && terceiro_numero > segundo_numero && primeiro_numero > segundo_numero)
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", terceiro_numero, primeiro_numero, segundo_numero);
            }
            else
            {
                System.out.printf ("A ordem é do maior para o menor: %.1f; %.1f; %.1f", terceiro_numero, segundo_numero, primeiro_numero);
            }


        }
    }
