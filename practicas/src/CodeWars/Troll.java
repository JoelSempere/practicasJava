package CodeWars;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("aqui en principio digo una palabrota"));
    }
    public static String disemvowel(String str) {
        return str.replaceAll("[AEIOUaeiouÁÉÍÓÚáéíóú]","");
    }
}
