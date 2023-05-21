package com.anhtester.learn_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ViduArrayList {
    public static void main(String[] args) {

        //Khai báo ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Thêm phần tử vào ArrayList
        arrayList.add("Selenium");
        arrayList.add("Playwright");
        arrayList.add("Cypress");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");

        arrayList.add(1, "Katalon");
        arrayList.add(3, "akaAT Studio");

        //Duyệt phần tử trong ArrayList
        //Dùng vòng lặp FOR
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Khai báo thêm 1 ArrayList thứ 2
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Java");
        arrayList2.add("Python");

        //Add All ArrayList 2 to ArrayList 1
        arrayList.addAll(arrayList2);

        System.out.println("====================");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Remove 1 phaanf tuwr trong ArrayList
        arrayList.remove("Selenium");
        arrayList.remove(2);

        System.out.println("====================");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.size());

        //Remove co dieu kien
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).trim().equals("Selenium")){
                arrayList.remove(i);
            }
        }

        //Remove all "Selenium" value
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            if(itr.next().equals("Selenium")){
                itr.remove();
            }
        }

        System.out.println(arrayList.size());
        System.out.println("====================");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //Tìm kiếm trá trị phần tử
        System.out.println(arrayList.contains("ABC")); //Trả ra True nếu tìm thấy. false không tim thấy

    }
}
