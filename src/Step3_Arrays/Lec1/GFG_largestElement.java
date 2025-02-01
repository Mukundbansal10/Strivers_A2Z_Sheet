package Step3_Arrays.Lec1;

public class GFG_largestElement {
    public static void main(String[] args) {

    int[] arr = {2,43,53,4,4,2,6};
    int num= arr[0];
        for(int i =0;i<=arr.length-1;i++){
        if (arr[i]> num) {
            num = arr[i];
        }
    }
        System.out.println(num);
}
}
