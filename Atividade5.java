import java.util.Scanner;

public class Atividade5
    {
        public static void main(String[] args)
        {
            int planeta;
            double peso_terra;
            double gravidade_mercurio = 0.37;
            double gravidade_venus = 0.88;
            double gravidade_marte = 0.38;
            double gravidade_jupter = 2.64;
            double gravidade_saturno = 1.15;
            double gravidade_urano = 1.17;

            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Escolha qual planeta você quer saber quanto mede  o peso em relação à gravidade\n(1) Mercúrio\n(2) Vênus\n(3) Marte\n(4) Júpter\n(5) Saturno\n(6) Urano\nEscolha: ");
            planeta = entrada.nextInt();
            System.out.printf ("Agora digite o peso a pessoa aqui na terra: ");
            peso_terra = entrada.nextInt();

            if (planeta == 1)
            {
                System.out.printf ("O peso em Mercúrio é: %.2f Kg", (peso_terra * gravidade_mercurio));
            }
            else if (planeta == 2)
            {
                System.out.printf ("O peso em Vênus é: %.2f Kg", (peso_terra * gravidade_venus));
            }
            else if (planeta == 3)
            {
                System.out.printf ("O peso em Marte é: %.2f Kg", (peso_terra * gravidade_marte));
            }
            else if (planeta == 4)
            {
                System.out.printf ("O peso em Júpter é: %.2f Kg",(peso_terra * gravidade_jupter));
            }
            else if (planeta == 5)
            {
                System.out.printf ("O peso em Saturno é: %.2f Kg", (peso_terra * gravidade_saturno));
            }
            else if (planeta == 6)
            {
                System.out.printf ("O peso em Urano é: %.2f Kg", (peso_terra * gravidade_urano));
            }
            else
            {
                System.out.printf ("Esse número não lista planeta nenhum");
            }




        }
    }
