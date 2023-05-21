package javabasic.toantu.toantulogic;

public class TTLogic {
    public static void main(String[] args) {

        String message1 = "Login successful";
        String message2 = "Login successfully";
        int number1 = 10;
        int number2 = 20;
        int number3 = 10;

        //Toán tử VÀ &&
        /*
        - Toán tử VÀ chỉ đúng khi tất cả các điều kiện đều đúng. Ngược lại sẽ sai khi có một thằng sai.
        - Dùng để kết hợp các điều kiện lại với nhau (mà các loại điều kiện là khác nhau)
         */

        System.out.println((message1 == message2) && (number1 <= number2));

        //Toán tử HOẶC ||
        /*
        - Toán tử HOẶC sẽ đúng khi chỉ cần một trong các điều kiện đúng. Ngược lại chỉ sai khi tất cả đều sai.
        - Dùng để kết hợp các điều kiện lại với nhau (trên cùng một loại điều kiện)
         */

        System.out.println((message1 == message2) || (number1 <= number2));

        //Toán tử Gán
        int var = 20; //Gán giá trị
        String name = "abc";
        int p,q,r,s;
        p=q=r=s=30; //Gán giá trị đồng loạt (điều kiện: tất cả các biến phải cùng kiểu dữ liệu)

    }
}
