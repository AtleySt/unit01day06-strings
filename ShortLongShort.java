public class ShortLongShort {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        if (a.length() > b.length()) {
            System.out.println(b+a+b);
        } else {
            System.out.println(a+b+a);
        }
    }
}
