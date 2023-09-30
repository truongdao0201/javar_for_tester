package BT5_For;

public class bai_for {
    public static void main(String[] args) {
        System.out.println("--------- Bài tập về For đơn giản --------- "); // Bài tập For cải tiến
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println("Số chẳn: " + i);
            }
        }

        System.out.println("\n--------- Bài tập về For cải tiến --------- ");// Bài tập For cải tiến
        String arrayName[] = {"truong", "dat", "huy", "hung", "han"};
        for (String name: arrayName){
            System.out.println(name);
        }

        System.out.println("\n--------- Bài tập về While --------- "); // Bài tập về while
        int i=0;
        while (i < 10){
            System.out.println("Số thứ tự: " + i);
            i++;
        }

        System.out.println("\n--------- Bài tập về Do While --------- "); // Bài tập do while
        int number = 0;
        do {
            int res = number * 2;
            System.out.println("kết quả: " + res);
            number++;
        }while (number < 10);
    }
}
