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
                boolean isArithmeticSequence = false;
                int arithmeticSequence = 0;

                //등비
                boolean isGeometricSequence = false;
                int geometricSequence = 0;

                //1. 등차,등비 구분하고 공비,공차 구하기

                //[1, 3, 5]인 경우 -> 공비가0인건 없으니까 common[0] = 1인 경우는 다 등차!
                if(common[0] == 1) {
                    isArithmeticSequence = true;
                    arithmeticSequence = common[2] - common[1];
                }

                if(common[0] != 1) {
                    if(common[1] - common[0] == common[2] - common[1]) {
                        //등차
                        isArithmeticSequence = true;
                        arithmeticSequence = common[2] - common[1];
                    } else {
                        //등비
                        isGeometricSequence = true;
                        geometricSequence = common[1]/common[0];
                    }
                }

                //2. 등차,등비 구했으니까 등차인경우, 등비인경우 나눠서 해보자


                //등차인 경우
                if(isArithmeticSequence) {
                    answer = common[common.length - 1] + arithmeticSequence;
                }

                //등비인 경우
                if(isGeometricSequence) {
                    // Math.pow(5, 2);
                    System.out.println(geometricSequence);
                    // answer = (int)Math.pow(common[0], common[common.length]);
                    answer = common[common.length - 1] * geometricSequence;
                    System.out.println(answer);
                }

                return answer;
            }
        }
    }


}
