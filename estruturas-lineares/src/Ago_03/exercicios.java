package Ago_03;

public class exercicios {

    public double[][] criaMatriz(){
        int num01 = RNG.randomNumberGenerator(1, 10);
        int num02 = RNG.randomNumberGenerator(1, 10);

        double[][] arr = new double[num01][num02];
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
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }

    public void exercicio01B(){
        int[][] arr = new int[5][10];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j * j;
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }

    public void exercicio01C(){
        int[][] arr = new int[6][6];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i;
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }

    public void exercicio01D(){
        int[][] arr = new int[9][9];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
               if(j % 2 == 0){
                   arr[i][j] = -1;
               } else {
                   arr[i][j] = 0;
               }
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }

    public void exercicio02(){
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }

    public void exercicio03(){
        double[][] arr = new double[2][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Teclado.leInt("Digite um número com casas decimais: ");
            }
        }
        //tá armazenado, o exercício não pede para printar
    }

    public int exercicio04_05(double[][] arr){
       return arr.length;
    }

    public void exercicio06(){

        String numeros;

        double[][] arr = new double[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
            }
            System.out.println("");
        }
        //return numeros;
    }

    public void exercicio07(){

        double maiorValor;

        double[][] arr = new double[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomDoubleNumberGenerator(0, 10);
            }
        }
        //return maiorValor;
    }

    public void exercicio08(){

        int soma;

        int[][] arr = new int[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
            }
        }
        //return soma;
    }

    public void exercicio09(){

        int mediaValores;

        int[][] arr = new int[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
            }
        }
        //return mediaValores;
    }

    public void exercicio10(){

        int matriz;
        int contador = 1;

        int[][] arr = new int[2][2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Teclado.leInt("Digite o " + contador + "º número da " + (i+1) + "ª linha: ");
                contador++;
            }
        }
        //return matriz;
    }

    public void exercicio11(){

        int[][] arr = new int[num01][num02];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = RNG.randomNumberGenerator(0, 100);
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = -1;
                }
            }
        }
    }
}
