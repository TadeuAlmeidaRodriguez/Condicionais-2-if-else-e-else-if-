import java.util.Scanner;

public class Atividade4
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            int operador;
            float adicao;
            float subtracao;
            float multiplicacao;
            float divisao;
            float numero_um ;
            float numero_dois;


            System.out.printf ("Digite o primeiro número: ");
            numero_um = entrada.nextFloat();
            System.out.printf ("Digite o segundo número: ");
            numero_dois = entrada.nextFloat();

            adicao = numero_um + numero_dois;
            subtracao = numero_um - numero_dois;
            multiplicacao = numero_um * numero_dois;
            divisao = numero_um / numero_dois;

            System.out.printf ("Escolha qual a operação que você quer fazer\nAdição (1)\nSubtração (2)\nMultiplicação (3)\nDivisão (4)\nOperação: ");
            operador = entrada.nextInt();

            if (operador == 4 && numero_dois ==0)
            {
                System.out.printf ("Não existe divisão por 0 (zero)");
            }
            else if (operador == 1)
            {
                System.out.printf ("O valor da adição é: %.1f", adicao);
            }
            else if (operador == 2)
            {
                System.out.printf ("O valor da subtração é: %.1f", subtracao);
            }
            else if (operador == 3)
            {
                System.out.printf ("O valor da multiplicação é: %.1f", multiplicacao);
            }
            else if (operador == 4)
            {
                System.out.printf ("O valor da divisão é: %.1f", divisao);
            }
            else
            {
                System.out.printf ("Esse valor não condiz com nenhuma operação dada com possibilidade");
            }



        }
    }