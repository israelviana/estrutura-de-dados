import java.util.Scanner;

public class Vetor {

    private int[] vetorInteiro = new int[10];

    private String[] vetorString = new String[10];

    public void RunVetorInteiros(){
        vetorInteiro[0] = 3;
        vetorInteiro[1] = 4;
        vetorInteiro[2] = 8;
        vetorInteiro[3] = 13;
        vetorInteiro[5] = 51;
        vetorInteiro[4] = 22;
        vetorInteiro[6] = 33;

        System.out.println("Imprimindo...");

        for (int i = 0; i < vetorInteiro.length; i++){
            System.out.println(vetorInteiro[i]);
        }

        System.out.println("\nFinalizando vetor de inteiros!");

        System.out.println("----------------------------------------------------------------------\n");
    }

    public void RunVetorString(){
        vetorString[0] = "AC";
        vetorString[1] = "BA";
        vetorString[2] = "CE";
        vetorString[3] = "DF";
        vetorString[4] = "AM";
        vetorString[5] = "AP";
        vetorString[6] = "PB";
        vetorString[7] = "RN";
        vetorString[8] = "MS";
        vetorString[9] = "SP";

        System.out.println("Imprimindo...");

        for (int i = 0; i < vetorString.length; i++){
            System.out.println("Estado " + i + ": " + vetorString[i]);
        }
    }

    public void RunBuscaLinear(){
        vetorString[0] = "AC";
        vetorString[1] = "BA";
        vetorString[2] = "CE";
        vetorString[3] = "DF";
        vetorString[4] = "AM";
        vetorString[5] = "AP";
        vetorString[6] = "PB";
        vetorString[7] = "RN";
        vetorString[8] = "MS";
        vetorString[9] = "SP";

        System.out.println("Imprimindo estados...");

        for (int i = 0; i < vetorString.length; i++){
            System.out.println("Estado " + i + ": " + vetorString[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sigla do estado que deseja procurar!");
        String siglaBusca = sc.nextLine();

        //Busca Linear
        boolean encontrou = false;

        for (int i = 0; i < vetorString.length; i++){
            String elemento = vetorString[i];
            if (elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            }
        }

        if (encontrou){
            System.out.println("Encontrou!");
        }else{
            System.out.println("Não encontrou!");
        }
    }
}
