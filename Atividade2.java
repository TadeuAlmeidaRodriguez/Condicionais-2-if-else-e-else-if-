import java.util.Scanner;

public class Atividade2
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número de 0 à 9: ");
            int numero_elegido = entrada.nextInt();

            if (numero_elegido <0 || numero_elegido >9)
            {
                System.out.printf ("Formato inválido");
            }
            else if (numero_elegido >0 || numero_elegido<9)
            {
                System.out.printf ("%d", numero_elegido);
            }
            else
            {
                System.out.printf ("O núemero é inválido");
            }
        }
    }
