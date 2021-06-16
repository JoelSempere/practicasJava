package CodeWars;

import java.util.Arrays;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.
 */
public class FindOutlier {
    public static void main(String[] args) {
        int[]prueba={1,3,7,9,8,6};
        System.out.println(find(prueba));
    }

    static int find(int[] integers){
        boolean sigo=true;
        int diff=0;
        int contI=0;
        int contP=0;

        if (integers.length < 3){
            diff=0;
            sigo=false;
        }
        if (sigo) {
            for (int n : integers
            ) {
                if (n % 2 == 0) {
                    contP++;
                } else {
                    contI++;
                }
            }

            if ((contP > 1 && contI != 1) || (contP != 1 && contI > 1)) {
                diff = 0;
                sigo = false;
            }

            //
            if (sigo) {
                if (contP == 1) {
                    for (int i : integers
                    ) {
                        if (i % 2 == 0) {
                            diff = i;
                        }
                    }
                } else {
                    for (int i : integers
                    ) {
                        if (i % 2 != 0) {
                            diff = i;
                        }
                    }
                }
            }
        }

        return diff;
    }
}
