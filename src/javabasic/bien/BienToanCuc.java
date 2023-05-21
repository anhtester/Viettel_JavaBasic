package javabasic.bien;

public class BienToanCuc {

    //Biến toàn cục
    String name = "Phương";
    int age = 32;
    String address = "Hà Nội";

    public void getInfo1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void getInfo2() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {

        //System.out.println("Name: " + BienToanCuc.name);

        BienToanCuc bienToanCuc = new BienToanCuc();
        System.out.println("Name: " + bienToanCuc.name);
    }

}
