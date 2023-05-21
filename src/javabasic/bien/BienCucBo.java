package javabasic.bien;

public class BienCucBo {

    public void sayHello() {
        int n = 10; // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        //System.out.println("Name: " + name);
    }

//    public void getInfo() {
//        System.out.println("Name: " + n);
//    }

    public static void main(String[] args) {
        //System.out.println("Gia tri cua n la: " + n);
        String name = "Phương"; //Biến cục bộ

        BienCucBo bienLocal = new BienCucBo();
        bienLocal.sayHello();
    }

}
