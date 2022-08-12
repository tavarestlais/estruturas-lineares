package Ago_03;

import Utils.RNG;
import Utils.Teclado;

public class exercicios {

    public double[][] criaMatrizDouble(){
        int num01 = RNG.randomNumberGenerator(1, 10);
        int num02 = RNG.randomNumberGenerator(1, 10);

        double[][] arr = new double[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomDoubleNumberGenerator(0, 10);
            }
        }
        return arr;
    }

    public int[][] criaMatrizInt(){
        int num01 = RNG.randomNumberGenerator(1, 10);
        int num02 = RNG.randomNumberGenerator(1, 10);

        int[][] arr = new int[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
            }
        }
        return arr;
    }


    public void exercicio01A(){
        int[][] arr = new int[3][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void exercicio01B(){
        int[][] arr = new int[5][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j * j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void exercicio01C(){
        int[][] arr = new int[6][6];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void exercicio01D(){
        int[][] arr = new int[9][9];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i % 2 == 0){
                    arr[i][j] = -1;
                    System.out.print(arr[i][j] + " ");
                } else {
                    arr[i][j] = 0;
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void exercicio02(){
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void exercicio03(){
        double[][] arr = new double[2][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                //arr[i][j] = Teclado.leDouble("Digite um número com casas decimais: ");
                arr[i][j] = RNG.randomDoubleNumberGenerator(0, 10);
            }
        }
        //tá armazenado, o exercício não pede para printar
        //Printando
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                //idealmente arredondar esse valor
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int exercicio04_05(double[][] arr){
        return arr.length;
    }

    public String exercicio06(double[][] arr) {
        String str = arr.toString();
        return str;
    }

    public double exercicio07(double[][] arr){

        double maiorValor = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > maiorValor){
                    maiorValor = arr[i][j];
                }
            }
        }
        return maiorValor;
    }

    public int exercicio08(int[][] arr){

        int soma = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                soma += arr[i][j];
            }
        }
        return soma;
    }

    public int exercicio09(int[][] arr){

        int mediaValores = 0;
        int linha;
        int contador;
        int soma = 0;

        contador = arr.length;

        System.out.println("Quantidade de linhas da matriz: " + contador);
        linha = Teclado.leInt("Qual linha deseja calcular a média?");

        while(linha <= 0 || linha > arr.length){
            System.out.println("Digite um número entre 1 e " + contador);
            System.out.println("Quantidade de linhas da matriz: " + contador);
            linha = Teclado.leInt("Qual linha deseja calcular a média?");
        }

        for(int j = 0; j < arr[linha].length; j++){
            soma += arr[linha][j];
        }

        mediaValores = soma/ (contador -1);

        return mediaValores;
    }

    public int[][] exercicio10(){

        int contador = 1;

        int[][] arr = new int[2][2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Teclado.leInt("Digite o " + contador + "º número da " + (i+1) + "ª linha: ");
                contador++;
            }
            contador = 1;
        }
        return arr;
    }

    public int[][] exercicio11(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = -1;
                }
            }
        }
        return arr;
    }
}