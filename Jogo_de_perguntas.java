import java.util.Scanner;

public class Jogo_de_perguntas{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("====Jogo de respostas====");

        int resposta;
        int ponto = 0;

                System.out.println("1 - Qual é a capital do brasil?");
                System.out.println("1. Brasilia");
                System.out.println("2. São Paulo");
                System.out.println("3. Rio de Janeiro");

        resposta = sc.nextInt();
        
        if(resposta == 1){
            System.out.println("Acertou");
        }
    }
}
