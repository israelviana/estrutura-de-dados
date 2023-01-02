import lista_ligada.ListaEncadeada;

import java.util.Scanner;

public class Menu {
    public void menu(){
        //Scanner para entrada de dados!
        Scanner sc = new Scanner(System.in);
        //Declaração de objetos!
        Vetor v = new Vetor();
        ListaEncadeada lista = new ListaEncadeada();
        ListaEncadeada l = new ListaEncadeada();
        //Inicio do menu!
        System.out.println("Qual conteúdo deseja visualizar?");
        System.out.println("1 - Vetor\n2 - Lista Encadeada");
        int index = sc.nextInt();
        switch (index){
            case 1:
                System.out.println("Digite qual método deseja executar!");
                System.out.println("1 - Vetor de Inteiros\n2 - Vetor de String\n3 - Busca Linear");
                int metodo1 = sc.nextInt();
                switch (metodo1){
                    case 1:
                        v.RunVetorInteiros();
                    case 2:
                        v.RunVetorString();
                    case 3:
                        v.RunBuscaLinear();
                }
                break;
            case 2:
                System.out.println("Digite qual método deseja executar!");
                System.out.println("1 - Adicionar elementos na lista\n2 - Remover elementos da lista\n3 - Buscar elemento específico através da posição");
                int metodo2 = sc.nextInt();
                switch (metodo2){
                    case 1:
                        lista.adicionar("AC");
                        lista.adicionar("CE");
                        lista.adicionar("BA");
                        System.out.println("Tamanho: " + lista.getTamanho());
                        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
                        System.out.println("Ultimo: " + lista.getUltimo().getValor());
                        System.out.println(lista.get(0).getValor());
                        System.out.println(lista.get(1).getValor());
                        System.out.println(lista.get(2).getValor());
                }
        }
    }
}
