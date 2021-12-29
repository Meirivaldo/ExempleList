package one.dio;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeSymbol.iterator;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();  //Cria uma lista com a variavel "nomes" e da um Println!
        nomes.add("Carlos");  //add(), adiciona um item a nossa lista!
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);
        nomes.set(2, "Larissa"); //Metodo de atualização, a informação na posição e valor que argumentarmos!


        Collections.sort(nomes); //Metodo sort aparece a lista de nome em ordem alfabetica!
        nomes.set(2, "Wesley");
        System.out.println(nomes);  //Vai imprimir a variavel "nomes" como foi criada na lista!

        nomes.remove(1); //remove o indece da posição que passamos na lista!
        System.out.println(nomes);

        nomes.remove("Wesley"); //Remove o objeto
        System.out.println(nomes);

        String nome = nomes.get(1);  //recebe um inteiro, retorna para a variavel do indice que passamos!
        System.out.println(nome);

        int quantosTemNaLista = nomes.size(); //Para saber quantos elementos tem na lista!
        System.out.println(quantosTemNaLista);

        boolean temAnderson = nomes.contains("Anderson");//Se colocar a variavel + . aparecem os metodos disponiveis!
//        Pergunta se no metodo tem o nome do elemento!
        System.out.println(temAnderson);

        boolean temPaulo = nomes.contains("Paulo"); //Verifica se tem o elemento
        System.out.println(temPaulo);

        boolean listEstaVazia = nomes.isEmpty(); //Verifica se a lista está vazia!
        System.out.println(listEstaVazia);

        int emQualPosicao = nomes.indexOf("Anderson"); //Verifica em qual posição esta o elemento!
        System.out.println(emQualPosicao);

        for(String nomeDoIem: nomes){
            System.out.println("---->" + nomeDoIem);
        }




//
//
//
//














    }

    private static void ream() {
    }

}
