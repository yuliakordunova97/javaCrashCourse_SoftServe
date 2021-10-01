public class MakeNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(5));
    }

    public static int makeNegative(final int x) {

        int negative;
        String n = "-" + x;
        negative = Integer.parseInt(n);

        return negative;

    }
}
