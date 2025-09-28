import java.util.Scanner;

public class Atividade3
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite a primeira nota: ");
            float primeira_nota = entrada.nextFloat();
            System.out.printf ("Digite a segunda nota: ");
            float segunda_nota = entrada.nextFloat();
            System.out.printf ("Digite a terceira nota: ");
            float terceira_nota = entrada.nextFloat();

            float media_notas = (primeira_nota + segunda_nota + terceira_nota)/3;

            if (media_notas >= 6)
            {
                System.out.printf ("O aluno foi aprovado");
            }
            else if (media_notas < 6 && media_notas > 5)
            {
                System.out.printf ("O aluno está em recuperação");
            }
            else
            {
                System.out.printf ("O aluno foi reprovado");
            }
        }
    }
