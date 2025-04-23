package Lv2;

import java.util.List;
import java.util.ArrayList;

public class calculator2 {

    // 속성
    private int a;
    private int b;
    private List<Double> result1 = new ArrayList<>();

    // 생성자
    public calculator2() {}

    // 기능
    double calculate(char c) {

        double result = 0;
        switch (c){
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
                    throw new ArithmeticException("0으로 나눗셈할 수 없습니다.");
                }
                result = (double) a / b;
                break;

        }
        result1.add(result);
        return result;
    }


    //게터: 저장된 계산 결과를 읽어오기
    public List<Double> printResult(){
        return result1;
    }

    //세터: 값 저장하고 변경하기
    public void setA (int a){
        this.a = a;
    }

    public void setB (int b){
        this.b = b;
    }

    public void removeResult(){
        result1.remove(0);
    }


}
