package BT6_Mang;

public class Bai_For_SoChan {
    public static void main(String[] args) {
        System.out.println("--------- Danh sách các số chẳn ---------");
        int count = 0;
        int arrNumer[] = new int[26];
        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                arrNumer[count] = i;
                count++;
            }
        }
        for (int num: arrNumer){
            System.out.println(num);
        }
    }
}
