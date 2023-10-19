package BT7_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayList_NhanVien {
    public static void main(String[] args) {
        ArrayList<Object> nhanvien = new ArrayList<Object>();
        nhanvien.add("Họ và tên: Dao Huy Truong");
        nhanvien.add("Ngày sinh: 2/1/1998");
        nhanvien.add("Độ tuổi: " + 25);
        nhanvien.add("SĐT: 0396891177");
        nhanvien.add("Địa chỉ: Quận 12");
        for (Object user: nhanvien){
            System.out.println(user);
        }
    }
}
