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
    }
}
