package BT4_IF_Else;

public class Bai_IF_Else {
    public static void main(String[] args) {
        // Bài tập về IF_Else
        int number = 100;
        if (number == 100) {
            System.out.println("Number bằng 100");
        } else if (number < 50) {
            System.out.println("number nhỏ hơn một 50");
        } else {
            System.out.println("number lớn hơn 50");
        }

        // Bài Tập về Switch Case
        int month = 6;
        switch (month) {
            case 1:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 3:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 5:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 7:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 10:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 6:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 9:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Số tháng không hợp lệ");
                break;
        }

        // Baì tập Switch Case rút gọn công việc khi thoả điều kiện
        int month2 = 8;
        switch (month2){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month2 + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month2 + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month2 + " có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Số tháng không hợp lệ");
                break;
        }
    }
}