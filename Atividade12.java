import java.util.Scanner;

public class Atividade12
    {
        public static void main(String[] args)
        {
         Scanner entrada = new Scanner (System.in);

         System.out.printf ("Digite a medida da aresta A de um triângulo: ");
         float lado_a = entrada.nextFloat();
         System.out.printf ("Digite a medida da  aresta B do mesmo triãngulo:  ");
         float lado_b = entrada.nextFloat();
         System.out.printf ("Digite a medida da aresta C do mesmo triângulo: ");
         float lado_c = entrada.nextFloat();

         if (lado_a > (lado_b + lado_c) || lado_b > (lado_a + lado_c) || lado_c > (lado_a + lado_b) )
         {
             System.out.printf ("Esses valores para as arestas não permitem formar um triângulo\nUm dos lados não pode ser maior que a soma dos outros dois.\nNa próxima tentativa escolha outros valores");
         }
         else if (lado_a == lado_b && lado_b == lado_c)
         {
             System.out.printf ("Esse é um triângulo equilátero\nTodos os lados são iguais");
         }
         else if (lado_a == lado_b && lado_c != lado_a || lado_a == lado_c && lado_b != lado_a || lado_b == lado_c && lado_a != lado_b)
         {
             System.out.printf ("Esse é um triângulo isósceles\nDois lados são iguais");
         }
         else
         {
             System.out.printf ("Esse é um triângulo escaleno\nTodos os lados são diferentes");
         }
        }
    }
