package javabasic.caulenhdieukien;

public class DieuKienIFElse {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        String message = "Add category successful";

        if((number1 < number2) && message.equals("Add success")){
            System.out.println("Thoả điều kiện");
        }

        if((number1 < number2) && message.equals("Add category successful")){
            System.out.println("Thoả điều kiện");
        }else {
            System.out.println("Không Thoả điều kiện");
        }

    }
}
