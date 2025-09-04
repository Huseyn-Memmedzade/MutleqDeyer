package yenipabka;

import java.util.Scanner;

public class MutleqDeyer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();


        int mutleqDeyer;

        mutleqDeyer = eded < 0 ? -eded : eded;
        System.out.println(eded + " ədədinin mütləq dəyəri: " + mutleqDeyer);
    }


}
