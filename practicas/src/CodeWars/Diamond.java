package CodeWars;
//muy lento
public class Diamond {
    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) {
        String salida="";
        boolean numeroCorrecto = false;
        int numFilasRombos;
        do {
            numFilasRombos = n;
            if(numFilasRombos>0 && numFilasRombos%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);

        salida+=(""+"\n");

        int numFilas = numFilasRombos/2 + 1;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                salida+=" ";
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                salida+="*";
            }
            salida+=(""+"\n");
        }

        numFilas--;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=altura;blancos++){
                salida+=" ";
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                salida+="*";
            }
            salida+="\n";
        }
        return salida;
    }
}
