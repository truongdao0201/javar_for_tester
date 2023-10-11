package BT7_Collection_ArrayList;

import java.util.ArrayList;

public class ChinhSua_BaiTap_Mang {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumber1 = new ArrayList<Integer>();
        ArrayList<Integer> arrNumber2 = new ArrayList<Integer>();
        // Chèn các số nguyên 1 -> 50 vào ArrayList thông qua vòng lặp For
        int count = 50;
        for (int i=1; i <= count; i++){
            arrNumber1.add(i);
        }
        // Sao chép các số chẳn tử arrNumber1 qua arrNumber2
        for (int num: arrNumber1){
            if (num % 2 == 0){
                arrNumber2.add(num);
            }
        }
        // In các số chẳn trong ArrayList arrNumber2
        System.out.println("--------- Arraylist các số chẳn tử ArrayList Number2 ---------");
        for (int num2: arrNumber2){
            System.out.println(num2);
        }
    }
}
