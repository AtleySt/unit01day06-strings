public class ShortLongShort {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        if (a.length() > b.length()) {
            String result = b+a+b;
            System.out.println(result);
        } else {
            String result = a+b+a;
            System.out.println(result);
        }
    }
}
