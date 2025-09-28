import java.util.Scanner;

public class Atividade11
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite a idade do atleta: ");
            int idade_atleta = entrada.nextInt();

            if (idade_atleta < 5 || idade_atleta >25)
            {
                System.out.printf ("O atleta não tem uma categoria para sua faixa etária");
            }
            else if (idade_atleta == 5 && idade_atleta <= 7)
            {
                System.out.printf ("Categoria Infantil A");
            }
            else if (idade_atleta == 8 && idade_atleta <=10)
            {
                System.out.printf ("Categoria Infantil B");
            }
            else if (idade_atleta == 11 && idade_atleta <= 13)
            {
                System.out.printf ("Categoria Juvenil A");
            }
            else if (idade_atleta == 14 && idade_atleta <= 17)
            {
                System.out.printf ("Categoria Juvenil B");
            }
            else
            {
                System.out.printf ("Categoria Sênior");
            }
        }
    }
