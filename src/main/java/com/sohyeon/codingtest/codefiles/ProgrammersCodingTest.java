package com.sohyeon.codingtest.codefiles;
import java.lang.Math;

public class ProgrammersCodingTest {

    //전역설정때문에 저렇게 올라가는데 다시 바꿔서 해야겠다 어휴,,

    class 프로그래머스_난이도0_옹알이문제 {
        //TODO 어려워서 보류

    }

    class 프로그래머스_난이도0_다음에올숫자 {

        class Solution {
            public int solution(int[] common) {

                int answer = 0;

                //등차
                int arithmeticSequence;
                //등비
                int geometricSequence;

                if(common[1] - common[0] == common[2] - common[1]) {
                    //등차
                    arithmeticSequence = common[2] - common[1];
                    answer = common[common.length - 1] + arithmeticSequence;
                } else {
                    //등비
                    geometricSequence = common[1]/common[0];
                    answer = common[common.length - 1] * geometricSequence;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_연속된수의합 {
        class Solution {
            public int[] solution(int num, int total) {
                //num = 1 ~ 100
                //total = 0 ~ 1000
                //num수 만큼 더해서 total값이 되는 answer나오게하기
                int[] answer = {}; //정수배열, 오름차순

                int tmpTotal = 0;
                //12 -> 될 수 있는 경우의 수 따져서
                //total만큼 1부터 1,2,3(num개수만큼) ->x [i = 1]
                //2,3,4 ->x [i = 2]
                //3,4,5 ->o [i = 3] => 찾으면 answer에 .add하고 종료 return false;

                //금 5번은 어카지
                //total만큼 1부터 1,2,3,4,5(num개수만큼) -> num다 안했는데 total넘어버리면 i에서 -1더하도록?

                //3   [1,2,3]
                for(int i = 1; i <= num; i++) { //1,2,3
                    tmpTotal += i; //1+2+3 =
//                    answer.add(i);

                    //total = 12
                    if(tmpTotal == total) { //딱 일치하는 경우
                        return answer;
                    }
                }
                return answer;
            }
        }
    }


}
