package exam_05;

import java.util.Scanner;

public class HwNo8{
    public static void main(String[] args){
    System.out.println("------------------------");
    System.out.print("�ݾ��� �Է��ϼ���:");
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();

    Exchange ec = new Exchange();
        ec.change(money);

    }
}