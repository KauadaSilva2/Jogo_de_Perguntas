    import java.util.Scanner;

    public class Jogo_de_perguntas{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("====Jogo de respostas====");

            int resposta;
            int ponto = 0;
            int erro = 0;

            do{
                    System.out.println("1 - Qual é a capital do brasil?");
                    System.out.println("1. Brasilia");
                    System.out.println("2. São Paulo");
                    System.out.println("3. Rio de Janeiro");

            resposta = sc.nextInt();

            switch(resposta){
                case 1:
                    System.out.println("Acertou");
                    ponto++;
                break;
                case 2:
                    System.out.println("Errou");
                break;
                case 3:
                    System.out.println("Errou");
                break;
                default:
                    System.out.println("Opção inválida, tente novamente!!");
            }
        }   while(resposta >= 4);

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

            System.out.println("3 - Em que ano o Flamengo foi treinado pelo JJ");
            System.out.println("1. 2018");
            System.out.println("2. 2022");
            System.out.println("3. 2019");

            resposta = sc.nextInt();

            if(resposta == 3){
                System.out.println("Acertou");
                ponto++;
            } else{
                System.out.println("Errou");
                erro++;
            }



            resposta = ponto + erro;

            System.out.println("");

            System.out.println("====Resultado====");

            System.out.println("Você tem " + ponto + " ponto(s)");
            System.out.println("Você tem " + erro + " erro(s)");
            System.out.println("Perguntas totais " + resposta);

            System.out.println("");

            if(ponto >= 2){
                System.out.println("Fez o minimo esperado");
            } else{
                System.out.println("PQP");
            }
        }
    }
