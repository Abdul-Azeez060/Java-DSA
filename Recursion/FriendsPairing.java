public class FriendsPairing {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(noOfpairs(n));
    }

    public static int noOfpairs(int n) {
        // base
        if (n == 1 || n ==2) {
            return n;
        }
        // single
        int fnm1 = noOfpairs(n-1);
        // double
        int fnm2 = (n-1) * noOfpairs(n-2);

        return fnm1+fnm2;
        //return noOfpairs(n-1) + (n-1)*noOfpairs(n-1);
    }
}
