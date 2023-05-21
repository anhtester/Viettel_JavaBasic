package javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {

        //Khai báo mảng lưu giá trị số nguyên
        int songuyen[] = new int[10];

        //Gán giá trị vào Mảng
        songuyen[0] = 5; //Gán giá trị 5 vào vị trí thứ nhất (mảng bắt đầu từ 0)
        songuyen[1] = 7;
        songuyen[5] = 10;

        //Gán giá trị thông qua FOR
//        for (int i = 0; i < songuyen.length; i++) {
//            songuyen[i] = 5;
//        }

        System.out.println(songuyen[5]); //Lấy ra giá trị tại vị trí cụ thể

        //Truy xuất giá trị trong Mảng
        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }

    }
}
