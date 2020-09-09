public class Main {
    public static void main(String[] args) {
        int a = 40,  b = 30;
        // write a logic to print number which is bigger
        int bigNumber = a>b ? a:b; // ternary
        System.out.println(bigNumber);


    }

    public int maxMod5(int a, int b) {
        if(a==b) return 0;
        if(  a%5 == b%5 ) {
            return a < b ? a: b;
        }
        return a > b ? a: b;
    }
}
