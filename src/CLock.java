public class CLock {
    public static void main(String[] args) {
        System.out.println(past(0,1,1));

    }


    public static int past(int h, int m, int s) {

        return (s + (h*60) + (m*60))*1000;
    }

}
