package Step3_Arrays.Lec1;

public class GFG_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,4,2,5,2,66,3,7,4,2,35};
        System.out.println("secondLargest(arr) = " + secondLargest(arr));
    }
    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
}
