package CodeWars;

public class Printer {
    public static String printerError(String s) {
        int cont = 0;
        int error=0;
        String salida = "";


        char[] letras =
                {
                        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
                };
        for (int i = 0; i < s.length(); i++) {
            char caracter=s.toUpperCase().charAt(i);
            cont++;
            for (int j = 0; j < letras.length; j++) {
                if (caracter == letras[j]) {
                    if (letras[j]>letras[12]){
                        error++;
                    }

                }
            }
        }
        salida=error+"/"+cont;
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(printerError("ksdjkolfsdjksdfzz"));
    }
}
