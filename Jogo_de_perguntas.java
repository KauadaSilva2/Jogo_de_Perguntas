    import java.util.Scanner;

    public class Jogo_de_perguntas{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("====Jogo de respostas====");

            int resposta;
            int ponto = 0;
            int erro = 0;

                    System.out.println("1 - Qual é a capital do brasil?");
                    System.out.println("1. Brasilia");
                    System.out.println("2. São Paulo");
                    System.out.println("3. Rio de Janeiro");

            resposta = sc.nextInt();
        
            if(resposta == 1){
                System.out.println("Acertou");
                ponto++;
            } else{
                System.out.println("Errou");
                erro++;
            }

            System.out.println("2 - Quem era Julio Cesar");
            System.out.println("1. Imperador");
            System.out.println("2. Ditador");
            System.out.println("3. Soldado");

            resposta = sc.nextInt();

            if(resposta == 1){
                System.out.println("Acertou");
                ponto++;
            } else {
                System.out.println("Errou");
                erro++;
            }

            resposta = ponto + erro;

            System.out.println("Você tem " + ponto + " ponto(s)");
            System.out.println("Você tem " + erro + " erro(s)");
            System.out.println("Perguntas totais " + resposta);
        }
    }
