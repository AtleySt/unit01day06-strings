// great, except again:
// TODO: you have to actually make a new String
public class Abbreviate {
    public static void main(String[] args) {
        String a = args[0];
        String firstTwo = a.substring(0,2);
        String lastTwo = a.substring(a.length()-2, a.length());

        if (a.length()<8) {
            System.out.println(a);
        } else {
            System.out.println(firstTwo+"..."+lastTwo);
        }
    }
}
