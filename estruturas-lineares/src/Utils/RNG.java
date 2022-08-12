package Utils;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.Arrays;

public class RNG{
    private static int teleNumbers = 60;

    public static int randomNumberGenerator(int min, int max) {
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public static double randomDoubleNumberGenerator(int min, int max) {
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }

    public static int[] getRandomListBySize(int size) {
        // usa um Set que nao aceita aleatórios e adicionar números até atingir o tamanho esperado
        Set<Integer> randomNumbers = new HashSet<Integer>();
        while(randomNumbers.size() < size) {
            randomNumbers.add( randomNumberGenerator(1,teleNumbers) );
        }

        //Converte set de volta pra array
        int[] randomArray = new int[size];
        int j = 0;
        for (int i: randomNumbers) {
            randomArray[j++] = i;
        }

        Arrays.sort(randomArray);
        return randomArray;
    }

    public static String getRandomName() {
        String[] female = new String[]{"Helena","Alice","Laura","Manuela","Valentina","Sophia","Isabella","Heloísa","Luiza","Júlia","Lorena","Lívia","Maria Luiza","Cecília","Lais","Giovanna","Maria Clara","Maria Eduarda","Mariana","Lara"};
        String[] male = new String[]{"Miguel","Davi","Gabriel","Arthur","Lucas","Matheus","Pedro","Guilherme","Italo","Rafael","Felipe","Bernardo","Enzo","Nicolas","João Pedro","Pedro Henrique","Cauã","Vitor","Eduardo","Daniel"};
        String[] lastName = new String[]{"Silva","Santos","Oliveira","Souza","Rodrigues","Ferreira","Alves","Pereira","Lima","Gomes","Tavares","Ribeiro","Martins","Carvalho","Nunes","Lopes","Soares","Franco","Vieira","Barbosa"};

        if (randomNumberGenerator(1,2) == 1){
            return female[randomNumberGenerator(0,19)] + " " + lastName[randomNumberGenerator(0,19)];
        } else {
            return male[randomNumberGenerator(0,19)] + " " + lastName[randomNumberGenerator(0,19)];
        }
    }
}