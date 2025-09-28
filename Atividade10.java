import java.util.Scanner;
import java.lang.Math;

public class Atividade10
    {
        public static void main(String[] args)
        {
        Scanner entrada = new Scanner (System.in);

        System.out.printf ("Digite o termo a (x²): ");
        double termo_a = entrada.nextFloat();
        System.out.printf ("Digite o termo b (x¹): ");
        double termo_b = entrada.nextFloat();
        System.out.printf ("Digite o termo c (independente): ");
        double termo_c = entrada.nextFloat();

        double delta_base = Math.pow (termo_b,2) - (4 * termo_a * termo_c);
        double delta_final = Math.sqrt (delta_base);
        double primeira_raiz = (- termo_b + delta_final)/(2 * termo_a);
        double segunda_raiz = (- termo_b - delta_final) / (2 * termo_a);
        double vertice_x = (primeira_raiz + segunda_raiz)/2;
        double variacao_y = termo_a * Math.pow (vertice_x,2);
        double vertice_y = variacao_y + (termo_b * vertice_x) + termo_c;

        if (termo_a == 0)
        {
            System.out.printf ("Não é uma equação de 2º grau");
        }
        else if (delta_base <0)
        {
            System.out.printf ("Não existe raízes reais para essa equação");
        }
        else if (delta_base == 0 )
        {
            System.out.printf ("Existe apenas uma raiz para essa equação: %.1f\nTendo vértices: x = %.1f ; y = %.1f", primeira_raiz, vertice_x, vertice_y);
        }
        else
        {
            System.out.printf ("Existem duas raizes para a fução do segundo grau, sendo : a¹ = %.1f ; a² = %.1f\nTendo vértíces: x = %.1f ; y = %.1f", primeira_raiz, segunda_raiz, vertice_x, vertice_y);
        }

        }
    }