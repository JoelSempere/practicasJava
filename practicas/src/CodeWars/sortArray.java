package CodeWars;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[]prueba={71,3,5,1,82,53,12,6,8,11};
        System.out.println(Arrays.toString(sortArray(prueba)));
    }

    public static int[] sortArray(int[] array) {
        int []guardar=new int[array.length];

        int posicion=0;
        int cont=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                guardar[posicion]=array[i];
                posicion++;
            }
        }
       Arrays.sort(guardar);
        posicion=0;

        for (int s:guardar
             ) {
            if (s !=0){
                cont++;
            }
        }
        int[]arrayOrdenado=new int[cont];

        for (int s:guardar
             ) {
            if (s!=0){
                arrayOrdenado[posicion]=s;
                posicion++;
            }
        }

        posicion=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                array[i]=arrayOrdenado[posicion];
                posicion++;
            }
        }
        return array;
    }
}
