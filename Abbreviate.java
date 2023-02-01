public class Abbreviate {
    public static void main(String[] args) {
        String a = args[0];
        String firstTwo = a.substring(0,2);
        String lastTwo = a.substring(a.length()-2, a.length());

        if (a.length()<8) {
            String result = a;
            System.out.println(result);
        } else {
            String result = firstTwo+"..."+lastTwo;
            System.out.println(result);
        }
    }
}
