package Step1_basics.Lec_1;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    public static void main(String[] args) {
        int choice =2;
        ArrayList<Double> list = new ArrayList<>(10);
        list.add(4.0);
        list.add(7.0);

        double area = switchCase(choice, list);
        System.out.println("area = " + area);
    }

        public static double switchCase(int choice, List<Double> arr){
            double area = 0.0;
            switch(choice){
                case 1:
                    area = Math.PI * (arr.get(0) * arr.get(0));
                    break;
                case 2:
                    area = arr.get(0) * arr.get(1);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid choice");
            }
            return area;
        }

}
