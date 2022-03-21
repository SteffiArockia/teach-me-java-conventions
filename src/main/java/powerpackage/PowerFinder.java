package powerpackage;

public class PowerFinder {
    public static int of(int base,int power) {
        int ans = 1;
        for (int i = 0; i<power; i++) {
            ans *= base;
        }
        return ans;
    }
}
