package onboarding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {

    public static int solution(int number) {
        int answer = 0;
        int digit = 1; // 현재자리수
        int progressNumber = 1; // 현재 자리수의 숫자
        int leftNumber = 1; // 현재 자리수 기준 오른쪽
        int rightNumber = 1; // 현재 자리수 기준 왼쪽


        while(number / digit != 0){
            leftNumber = number / (digit * 10);
            rightNumber= number % digit;
            progressNumber = (number/digit) % 10;

            if(progressNumber > 3){
                answer += (leftNumber + 1) * digit;
            }else if(progressNumber == 3){
                answer += leftNumber * digit + rightNumber + 1;
            }else{
                answer += leftNumber * digit;
            }

            if(progressNumber > 6){
                answer += (leftNumber + 1) * digit;
            }else if(progressNumber == 6){
                answer += leftNumber * digit + rightNumber + 1;
            }else{
                answer += leftNumber * digit;
            }

            if(progressNumber == 9){
                answer += leftNumber * digit + rightNumber + 1;
            }else{
                answer += leftNumber  * digit;
            }

            digit *= 10;

        }

        return answer;
    }
}
