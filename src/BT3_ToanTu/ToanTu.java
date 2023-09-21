package BT3_ToanTu;

public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int d = 3;
        int f = 3;
        // Toán tử số học
        System.out.println("Tổng a + b = "+ (a+b)); // kết quả 15
        System.out.println("Hiệu a - c = "+ (a-c)); // Kết quả 8
        System.out.println("Tích b * c = "+ (b*c)); // Kết qua 10
        System.out.println("Thương a / b = "+ (a/c)); // Kết quả 5
        System.out.println("Thương lấy dư b % c: " + (b%c)); // Kết quả 1
        System.out.println("Kết quả 1: " + (a*b/c)); // Kết quả 25
        System.out.println("Kết quả 2: " + ((a+b)*c)); // Kết quả 30
        // Toán tử so sánh
        String number1 = (a > b) ? "số " + a + " > " + "số " +b : "số " + a + " < " + "số " +b;
        String number2 = (c < b) ? "số " + c + " < " + " số " +b : "số " + c + " > " + " số " +b;
        String number3 = (d == f) ? "số " + d + " = " + " số " + f : "Hai số không bằng nhau";
        // Toán tử logic
        String number4 = ((a - b == 5) && (c + d == 5)) ? "Điều kiện đúng kết quả bằng 5" : "Điều kiện sai không đúng kết quả bẳng 5";
        String number5 = ((b - c == 3) || f == 3) ? "Điều kiện đúng kết quả là 3" : "Điều kiện không đúng kết quả là 3";

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
    }
}
