package BT_XuLy_String;

public class Xuly_String {
    public static void main(String[] args) {
        String chuoi = "   Các phương thức cơ bản để xử lý chuỗi trong Java bằng hàm java có sẵn  ";
        // Kiểm tra độ dài của chuỗi hàm length
        System.out.println(chuoi.length());
        // Kiểm tra chuỗi cso chứa ký tự chuỗi nhất định
        System.out.println("Kiểm tra chứa ký tự: " + chuoi.contains("Java"));
        // Hàm xoá khoảng trắng trong chuỗi
        System.out.println("Xoá khoảng trắng:" + chuoi.trim());
        // Hàm in chữ hoa cho chuỗi
        System.out.println("Chữ hoa:" + chuoi.toUpperCase());
        // Hàm in chữ thường trong chuôi
        System.out.println("Chữ thường:" + chuoi.toLowerCase());
        // Hàm nỗi chuỗi concat
        System.out.println("Nối chuỗi:" + chuoi.concat("Python"));
        // Hàm lấy vị trí chuỗi nhất định
        System.out.println("Lấy chuỗi:" + chuoi.indexOf("Các"));
        //  hàm cắt chuỗi từ 1 vị trí trí nhất định
        System.out.println("Cắt chuỗi:" + chuoi.substring(3,6));
    }
}
