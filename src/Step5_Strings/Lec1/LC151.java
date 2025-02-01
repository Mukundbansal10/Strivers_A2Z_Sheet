package Step5_Strings.Lec1;

public class LC151 {
    static String reverseWords(String str, String rev) {
        for (int i= str.length()-1;i>0;i--){
            rev =rev+i;

        }return "helll";
    }

    public static void main(String[] args) {
        String str = " hello world how are you";
        String rev = "";
        String s = reverseWords(str,rev);
        System.out.println(s+ " ");
    }
}
