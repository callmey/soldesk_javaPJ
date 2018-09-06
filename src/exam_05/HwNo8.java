package exam_05;

import java.util.Scanner;

public class HwNo8{
    public static void main(String[] args){
    System.out.println("------------------------");
    System.out.print("금액을 입력하세요:");
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    Exchange ec = new Exchange();
        ec.change(money);

    }
}