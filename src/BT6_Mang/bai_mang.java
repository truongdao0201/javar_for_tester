package BT6_Mang;

public class bai_mang {
    public static void findName(String arr[]){
        String name = "han";
        for (int i=0; i < arr.length; i++){
           if (name == arr[i]){
               System.out.println("Kết quả: " + arr[i]);
           }
        }
    }
    public static void main(String[] args) {
        System.out.println("--------- Mảng Nặc Danh ---------");
        String arrName[] = {"truong", "dat", "hung", "han"}; // Mảng nặc danh
        for (int i=0; i < arrName.length; i++){
            System.out.println(arrName[i]);
        }
        System.out.println("--------- Mảng Trong Phương Thức ---------");
        String listName[] = {"truong", "dat", "hung", "han"}; // Dùng mảng vào phương thức
        findName(listName);
        System.out.println("--------- Mảng Tìm Số Chẳn ---------");
        int number[] = new int[50]; // Bài tập For và mảng in số chẳn
        for (int i=1; i < number.length; i++){
            if(i % 2 == 0){
                System.out.println("Số chẳn " + i);
            }
        }
    }
}
