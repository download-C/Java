package chapter13_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// 480쪽 reduce() 사용하기

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        }
        return s2;
    }
}

public class ReduceTest{
    public static void main(String[] args) {
        String[] greeting = {"안녕하세요~~~","hello","Good morning", "반갑습니다^^"};
        System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
            if(s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            }
            return s2;
        }));
        // 위의 greeting 배열을 CompareString 클래스에 있는 함수형 메서드를 가져와서 
        String str = Arrays.stream(greeting).reduce(new CompareString()).get();
        // 위에서 처리한 str을 출력.
        System.out.println(str);
    }
}
