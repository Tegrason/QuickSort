import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] ch = {'a','b','a','b','a','b','a','b'};
        System.out.println(Arrays.toString(getNext(ch)));
    }
    protected static int[] getNext(char[] p) {
        int pLen = p.length;
        int[] next = new int[pLen];
        int k = -1;
        int j = 0;
        next[0] = -1; // next数组中next[0]为-1
        while (j < pLen - 1) {
            if (k == -1 || p[j] == p[k]) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
