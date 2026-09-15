    import java.util.Scanner;

    public class Jogo_de_perguntas{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            System.out.println("====Jogo de respostas====");
            int resposta;
            int[] pontos = new int[3];
            int total_resposta = 0;
            int jogador = 0;
            String[] nomes = new String[3] ;
            int temp;
            String names;

            do{
            int ponto = 0;
            int erro = 0;
            System.out.println("Digite seu nome: ");
            nomes[jogador] = sc.next();

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
                    erro++;
                break;
                case 3:
                    System.out.println("Errou");
                    erro++;
                break;
                default:
                    System.out.println("Opção inválida, tente novamente!!");
            }
        }   while(resposta >= 4 || resposta <= 0);

        do{
            System.out.println("2 - Quem era Julio Cesar");
            System.out.println("1. Imperador");
            System.out.println("2. Ditador");
            System.out.println("3. Soldado");

            resposta = sc.nextInt();

            switch(resposta){
                case 1:
                    System.out.println("Acertou");
                    ponto++;
                break;
                case 2:
                    System.out.println("Errou");
                    erro++;
                break;
                case 3:
                    System.out.println("Errou");
                    erro++;
                break;
                default:
                    System.out.println("Opção inválida, tente novamente!!");
            }
        }   while(resposta >= 4 || resposta <= 0);

        do{
            System.out.println("3 - Em que ano o Flamengo foi treinado pelo JJ");
            System.out.println("1. 2018");
            System.out.println("2. 2022");
            System.out.println("3. 2019");

            resposta = sc.nextInt();

            switch(resposta){
                case 1:
                    System.out.println("Errou");
                    erro++;
                break;
                case 2:
                    System.out.println("Errou");
                    erro++;
                break;
                case 3:
                    System.out.println("Acertou");
                    ponto++;
                break;
                default:
                    System.out.println("Opção inválida, tente novamente!!");
            }

        }   while(resposta >= 4 || resposta <= 0);

            pontos[jogador] = ponto;


            total_resposta = ponto + erro;

            System.out.println("");


            System.out.println("====Resultado====");

            System.out.println("Você tem " + ponto + " ponto(s)");
            System.out.println("Você tem " + erro + " erro(s)");
            System.out.println("Perguntas totais " + total_resposta);

            System.out.println("");

            if(ponto >= 2){
                System.out.println("Fez o minimo esperado " + nomes[jogador]);
            } else{
                System.out.println("PQP em " + nomes[jogador]);
            }

            jogador++;
        } while(jogador < 3);
            System.out.println("===Ranking===");
            for(int i = 0; i < 3; i++){
                System.out.println(pontos[i]);
                System.out.println(nomes[i]);
            }

            if(pontos[0] < pontos[1]){
            names = nomes[0];
            nomes[0] = nomes[1];
            nomes[1] = names;

            temp = pontos[0];
            pontos[0] = pontos[1];
            pontos[1] = temp;

            } else if(pontos[1] < pontos[2]){

            names = nomes[1];
            nomes[1] = nomes[2];
            nomes[2] = names;

            temp = pontos[1];
            pontos[1] = pontos[2];
            pontos[2] = temp;
            }

            if(pontos[2] < pontos[3]){
                names = nomes[2];
                nomes[2] = nomes[3];
                nomes[3] = names;
            }
        }
    }
