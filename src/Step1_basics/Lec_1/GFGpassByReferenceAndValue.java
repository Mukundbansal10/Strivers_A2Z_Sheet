package Step1_basics.Lec_1;

import java.util.Arrays;

public class GFGpassByReferenceAndValue {
    public static void main(String[] args) {
        int a = 1 , b=2;
        int[] ans = passedBy(a, b);
        System.out.println(Arrays.toString(ans));
    }
    static int[] passedBy(int a, int b){
        int[]arr = {a+1,b+2};
        return arr;
    }
}
