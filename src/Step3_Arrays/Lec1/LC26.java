package Step3_Arrays.Lec1;

public class LC26 {
    public static void main(String[] args) {


    int[] nums = {1,1,1,2,2,3,4,4,4,5,6,7,7};
////        int[] arr= new int[nums.length];
//        int k =0;
//
//        for (int i = k+1; i < nums.length-1; i++){
//                if(nums[i]!=nums[k]){
//                    k++;
//                    nums[k] = nums[i];
//                }
//        }
////        System.out.println(Arrays.toString(nums));
//        System.out.println(k);

    int k = 0;
            for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[k]) {
            k++;
            nums[k] = nums[i];
        }
    }
            System.out.println(k+1);
}}
