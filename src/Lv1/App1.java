package Lv1;

import Lv2.calculator2;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int result = 0;

        while (true){

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                a = sc.nextInt();

                if (a < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력해주세요");
                } else{
                    break;
                }
            }


            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                b = sc.nextInt();

                if (b < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력해주세요");
                } else{
                    break;
                }

            }

            String st;
            char ch;
            while (true) {
                System.out.println("사칙연산 기호를 입력하세요: ");
                String op = sc.next();
                ch = op.charAt(0);

                if ((op.length() == 1) && "'+-*/".contains(op)) {
                    break;
                } else {
                    System.out.println("+, -, *, / 만 넣어주세요");
                }

            }
            switch (ch) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    result = a / b;
                    break;

                default:
                    System.out.println("+,-,*,/ 중 하나를 입력해주세요");

            }
            System.out.println("계산결과: " + result);
            System.out.println("더 계산하시겠습니까? (yes 입력시 계속 / no 입력시 종료");
            st = sc.next();
            if (st.equals("no")){
                break;
            }
        }

    }
}
