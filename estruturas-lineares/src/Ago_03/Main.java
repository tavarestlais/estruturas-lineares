package Ago_03;

public class Main {
    public static void main(String[] args) throws Exception {
        exercicios exercicioTeste = new exercicios();

        System.out.println("Exercício 01 A");
        exercicioTeste.exercicio01A();
        System.out.println("Exercício 01 B");
        exercicioTeste.exercicio01B();
        System.out.println("Exercício 01 C");
        exercicioTeste.exercicio01C();
        System.out.println("Exercício 01 D");
        exercicioTeste.exercicio01D();

        System.out.println("Exercício 02");
        exercicioTeste.exercicio02();
        System.out.println("Exercício 03");
        exercicioTeste.exercicio03();
        System.out.println("Exercício 04 e 05");
        System.out.println("Quantidade de linhas da matriz: "+ exercicioTeste.exercicio04_05(exercicioTeste.criaMatrizDouble()));
        System.out.println("\nExercício 06");
        System.out.println("String de saída: " + exercicioTeste.exercicio06(exercicioTeste.criaMatrizDouble()));
        System.out.println("\nExercício 07");
        System.out.println("Maior valor da matriz: "+ exercicioTeste.exercicio07(exercicioTeste.criaMatrizDouble()));
        System.out.println("\nExercício 08");
        System.out.println("Soma de todos elementos da matriz: "+ exercicioTeste.exercicio08(exercicioTeste.criaMatrizInt()));
        System.out.println("\nExercício 09");
        System.out.println("Média de valores da linha informada: "+ exercicioTeste.exercicio09(exercicioTeste.criaMatrizInt()));
        System.out.println("\nExercício 10");
        System.out.println(exercicioTeste.exercicio10());
        System.out.println("\nExercício 11");
        System.out.println(exercicioTeste.exercicio11(exercicioTeste.criaMatrizInt()));

    }
}

//em casa
//baixar java baixar JDK e SDK e configurar no windows e no intelliJ
//rodar como projetopackage Ago_03;
