package chapter13_stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int sumVal = Arrays.stream(arr).sum(); // sum()연산으로 arr 배열된 저장값을 모두 더함
        int count = (int)Arrays.stream(arr).count(); // count() 연산은 반환형이 long이므로 int로 수동 형변환 하여 arr 안의 배열 개수 반환

        System.out.println(sumVal);
        System.out.println(count);
    }
}
