package BT1_Bien;

public class SinhVien {
    int age = 25; // biến global
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        String fullname = "Đào Huy Trường"; // biến local
        System.out.println("Họ tên: " + fullname); // In giá trị biến local
        System.out.println("Tuổi: " + sv.age); // In giá trị biến global
        System.out.println("Địa chỉ: " + ThongTin.address); // In giá trị biến static
    }
}
