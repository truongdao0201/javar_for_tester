package BT5_For;

public class bai_for {
    public static void main(String[] args) {
        System.out.println("Bài tập về For đơn giản"); // Bài tập For cải tiến
        for(int i = 0; i <= 50; i++){
            System.out.println("Số thứ tự: " + i);
        }
        System.out.println("\n Bài tập về For cải tiến");// Bài tập For cải tiến
        String arrayName[] = {"truong", "dat", "huy", "hung", "han"};
        for (String name: arrayName){
            System.out.println(name);
        }
        System.out.println("\n Bài tập về While"); // Bài tập về while
        int i=0;
        while (i < 10){
            System.out.println("Số thứ tự: " + i);
            i++;
        }
        System.out.println("\n Bài tập về Do While"); // Bài tập do while
        int number = 0;
        do {
            System.out.println("Số thứ tự: " + number);
            number++;
        }while (number <= 10);
    }
}
