package BT_PhuongThuc;

import java.sql.SQLOutput;

public class Thuchanh_Phuongthuc {
    private static String name; // Thuộc tính
    // Hàm có trả về value
    public static String getName(){
        name = "Đào Huy Trường";
        return name;
    }
    // hàm không có giá trị trả về
    public static void showInfo(){
        System.out.println("Họ tên: " + getName());
    }
    // Hàm có tham số
    public static void getAddress(String address, String sđt){
        System.out.println("Địa chỉ: " + address);
        System.out.println("SĐT: " + sđt);

    }
    public static void main(String[] args) {
        System.out.println("------- Thông tin -------");
        showInfo();
        getAddress("Quận 12", "0981397748");
    }
}
