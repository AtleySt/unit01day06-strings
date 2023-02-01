public class NegatePhrase {
    public static void main(String[] args) {
        String a = args[0];
        String firstThree = a.substring(0,3);

        if (firstThree.equals("not")) {
            String result = a;
            System.out.println(result);
        } else {
            String result = "not " + a;
            System.out.println(result);
        }
    }
}
