package NivelIntermediario;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome, vila;
        int idade, i = 0;

        Scanner scan = new Scanner(System.in);
        LinkedList<Object> listaNinja = new LinkedList<>();

        Ninja ninja1 = new Ninja("Naruto Uzucrack", "Aldeia da Folha", 19);
        Ninja ninja2 = new Ninja("Sasuke Umbra", "Aldeia da Folha", 21);
        Ninja ninja3 = new Ninja("Sakura Haruno", "Aldeia da Folha", 18);
        Ninja ninja4 = new Ninja("Madara Uchiha", "Aldeia da Folha", 45);
        Ninja ninja5 = new Ninja("Hashirama", "Aldeia da Folha", 47);
        Ninja ninja6 = new Ninja("Gaara do Deserto", "Aldeia do Vento", 20);
        Ninja ninja7 = new Ninja("Kakashi Hatake", "Aldeia da Folha", 34);

        listaNinja.add(ninja1);
        listaNinja.add(ninja2);
        listaNinja.add(ninja3);
        listaNinja.add(ninja4);
        listaNinja.add(ninja5);
        listaNinja.add(ninja6);
        listaNinja.add(ninja7);

        while(i != 5) {
            System.out.println("----------- Menu interativo -----------");
            System.out.println("1 - Adicionar ninja ao inicio da lista \n2 - Remover o primeiro ninja "
                    + "\n3 - Exibir a lista completa de ninjas \n4 - Acessar ninja pelo índice \n5 - Sair");
            i = scan.nextInt();

            switch(i) {
                case 1:
                    scan.nextLine();

                    System.out.println("Digite o nome do ninja: ");
                    nome = scan.nextLine();
                    System.out.println("Digite o a vila do ninja: ");
                    vila = scan.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    idade = scan.nextInt();

                    listaNinja.add(0, new Ninja(nome, vila, idade));
                    System.out.println("Ninja adicionado! " + listaNinja.get(0));
                    break;
                case 2:
                    listaNinja.remove(0);
                    System.out.println("Ninja removido! " + listaNinja.get(0));
                    break;
                case 3:
                    System.out.println(listaNinja);
                    break;
                case 4:
                    System.out.println("Digite o index do ninja: ");
                    int index = scan.nextInt();
                    System.out.println(listaNinja.get(index));
                case 5:
                    System.out.println("Finalizando programa!");
                    continue;
            }
        }

    }
}
