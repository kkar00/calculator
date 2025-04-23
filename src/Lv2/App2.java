package Lv2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator2 cal = new calculator2();

        int a;
        int b;
        char op;
        String St;

        while (true) {

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                a = sc.nextInt();

                if (a < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력해주세요");
                } else {
                    cal.setA(a);
                    break;
                }
            }


            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                b = sc.nextInt();

                if (b < 0) {
                    System.out.println("0을 포함한 양의 정수로 입력해주세요");
                } else {
                    cal.setB(b);
                    break;
                }

            }


            while (true) {
                System.out.println("사칙연산 기호를 입력하세요: ");
                String st2 = sc.next();
                op = st2.charAt(0);

                if ((st2.length() == 1) && "'+-*/".contains(st2)) {
                    break;
                } else {
                    System.out.println("+, -, *, / 만 넣어주세요");
                }
            }

            try {
                double result1 = cal.calculate(op);
                System.out.println("계산 결과: " + result1);
            } catch (ArithmeticException e) {
                System.out.println("에러: " + e.getMessage());
            }

            System.out.println("지금까지의 계산 결과: " + cal.printResult());


            //계산을 더 진행할지 끝낼지 확인

            System.out.println("더 계산하시겠습니까? (yes 입력 시 계속 / exit 입력 시 종료)");
            St = sc.next();
            if (St.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                cal.removeResult();
                break;
            } else if (St.equals("yes")) {
                while (true) {
                    System.out.println("가장 먼저 저장된 계산 결과를 삭제하시겠습니까? (yes 입력 시 삭제 후 계속 / no 입력 시 삭제하지 않고 계속)");
                    St = sc.next();
                    if (St.equals("yes")) {
                        cal.removeResult();
                        break;
                    } else if (cal.equals("no")) {
                        break;
                    } else {
                        System.out.println("다시 입력해주세요 (yes, no만 입력 가능)");
                    }
                }


            }


        }
    }
}
