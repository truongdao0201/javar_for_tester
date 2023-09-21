package BT2_KieuDuLieu;

public class NhanVien {
    public static void main(String[] args) {
        String name = "Đào Huy Trường"; // Kiểu chuỗi (String)
        int old = 25; // kiểu số nguyên (int)
        boolean gender_nam = true; // Kiểu true/false (boolean)
        float height = 73.57f; // kiểu số thực (float);
        String address = "Quận 12"; // Kiểu chuỗi (String)
        String job = "Công Nghệ Thông Tin"; // Kiểu chuỗi (String)
        double salary = 5.58; //Kiểu số thực (double)

        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + old);
        System.out.println("Giới tính nam: " + gender_nam);
        System.out.println("Cân nặng: " + height + "kg");
        System.out.println("Địa chỉ: " + address);
        System.out.println("Nghề nghiệp: " + job);
        System.out.println("Lương: " + salary);
    }
}
