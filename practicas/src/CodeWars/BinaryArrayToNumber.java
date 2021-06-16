package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int num = 0;
        int tam=binary.size()-1;
        for (int n:binary
             ) {
            if (n==1){
                num+=Math.pow(2,tam);
                tam--;
            } else{
                tam--;
            }

        }
        return num;
    }
}
