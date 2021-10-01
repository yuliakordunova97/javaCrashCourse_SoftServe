public class ToBinary {

    public static void main(String[] args) {

        System.out.println(toBinary(5));
    }



    public static int toBinary(int n) {
        String n1 = Integer.toBinaryString(n);
        n = Integer.parseInt(n1);

        return n;

    }
}
