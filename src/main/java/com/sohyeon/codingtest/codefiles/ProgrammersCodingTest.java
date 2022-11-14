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
            public int[] solution(int num, int total) { //둘다 정수
                //num = 1 ~ 100
                //total = 0 ~ 1000
                //num수 만큼 더해서 total값이 되는 answer나오게하기
                int[] answer = {}; //정수배열, 오름차순

                int tmpTotal = 0;

                //3
                for(int i = 1; i <= num; i++) {
                    for(int j = i; j <= i + num; j++) {
                        tmpTotal += j;
                    }
                    System.out.println("tmpTotal : " + tmpTotal);

                    if(tmpTotal != total || tmpTotal < total) { //맞지않는 경우
                        tmpTotal = 0; //초기화
                    }

                    if(tmpTotal == total) { //딱 일치하는 경우
                        System.out.println("?");
                        System.out.println(tmpTotal);
                    }

                    if(tmpTotal > total) { //넘는 경우
                        for(int j = 1; i <= num; j++) {
                            i--;
                        }
                        System.out.println(tmpTotal);
                    }


                    //1+2+3 =
                    //tmpTotal < total
                    //tmpTotal == total
                    // tmpTotal > total
                    //경우 다 따져서 미리 넘어버리면 i--

                    //total = 12
                }












                return answer;
            }
        }
    }


}
