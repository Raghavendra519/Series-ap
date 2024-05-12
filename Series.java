class Solution {

    public static int nthTermOfAP(int a1, int a2, int n) {

        int commonDifference = a2 - a1;

        return a1 + (n - 1) * commonDifference;

    }

}
