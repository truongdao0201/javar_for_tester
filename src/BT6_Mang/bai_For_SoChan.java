package BT6_Mang;

public class bai_For_SoChan {
    public static void main(String[] args) {
        System.out.println("--------- Mảng các số nguyên ---------");
        int number[] = new int[50];// Bài tập For và mảng in số chẳn
        for (int i=0; i < number.length; i++){
            number[i] = i+1;
            System.out.println(number[i]);
        }
        System.out.println("------- Danh sách số chẳn -------");
        int arrNumber[] = new int[50];
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 == 0){
                arrNumber[i] = number[i];
                System.out.println(arrNumber[i]);
            }
        }
    }
}
