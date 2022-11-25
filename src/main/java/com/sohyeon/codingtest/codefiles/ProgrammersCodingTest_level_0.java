package com.sohyeon.codingtest.codefiles;

public class ProgrammersCodingTest_level_0 {

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

    //TODO 투포인터 알고리즘 공부해보기 + 나중에 다시 풀어보기..
    class 프로그래머스_난이도0_연속된수의합 { 
        class Solution {
            public int[] solution(int num, int total) {
                int[] answer = new int[num];

                //생각해보기(원리)
                int sum = num * (num + 1) / 2;
                int offset = (total - sum) / num;

                System.out.println("sum" + sum);
                System.out.println("offset" + offset);

                for(int i = 1; i <= num; i++) {
                    answer[i - 1] = (i + offset);
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_몫구하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                answer = num1 / num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의곱 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                answer = num1 * num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_숫자비교하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;

                answer = num1 == num2? 1: -1;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_나머지구하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = num1 % num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의차 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = num1 - num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_나이출력 {
        class Solution {
            public int solution(int age) {
                int answer = 0;

                if(0 < age && age <= 120) {
                    answer = 2022 - age + 1;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의합 {
        class Solution {
            public int solution(int num1, int num2) {

                int answer = -1;

                if((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000)) {
                    answer = num1 + num2;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_각도기 {
        class Solution {
            public int solution(int angle) {
                int answer = 0;
                // 0 < 예각 < 90
                // 90 < 둔각 < 180
                // 평각 = 180

                if (angle <= 90) {
                    answer = (angle < 90) ? 1 : 2;
                } else {
                    answer = (angle == 180) ? 4 : 3;
                }


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의나눗셈 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                double result = (double)num1 / (double)num2;

                if((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)) {
                    answer = (int)(result * 1000);
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_짝수의합 {
        class Solution {
            public int solution(int n) {
                int answer = 0;

                if(0 < n && n <= 1000) {
                    for(int i = 0; i <= n; i++) {
                        answer += (i%2 == 0)? i: 0;
                    }
                }
                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_양꼬치 {
        class Solution {
            public int solution(int n, int k) {
                int answer = 0;
                int nTotalPrice = 0;
                int kTotalPrice = 0;

                if((0 < n && n < 1000) && (n/10 <= k && k < 1000)) {

                    if(n >= 10) {
                        kTotalPrice = (k >= 2)? (k - (n/10)) * 2000: 0; //10인분마다 1개씩 k++;
                        nTotalPrice = n * 12000;

                    } else {
                        kTotalPrice = k * 2000;
                        nTotalPrice = n * 12000;
                    }
                    answer = kTotalPrice + nTotalPrice;
                }

                return answer;
            }
            
            /*

            <객체 지향적 풀이 - 참고>

            class Solution {
                public int solution(int n, int k) {
                    int lambTotalPrice = totalPrice(Menu.LAMB, n);
                    int drinkTotalPrice = totalPrice(Menu.DRINK, k);
                    int discountPrice = discount(Menu.DRINK, n);

                    int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
                    return totalPay;
                }

                private int totalPrice(Menu menu, int quantity) {
                    return menu.getPrice() * quantity;
                }

                private int discount(Menu menu, int lambQuantity) {
                    // 양꼬치 10인분에 음료수 하나
                    int point = lambQuantity / 10;

                    return menu.getPrice() * point;
                }
            }

            enum Menu {

                LAMB("양꼬치", 12000),
                DRINK("음료수", 2000);

                private final String name;
                private final int price;

                Menu(String name, int price) {
                    this.name = name;
                    this.price = price;
                }

                public String getName() {
                    return name;
                }

                public int getPrice() {
                    return price;
                }
            }

            */

        }
    }

    class 프로그래머스_난이도0_배열의평균값 {
        class Solution {
            public double solution(int[] numbers) {
                double answer = 0;
                double tempTotal = 0;
                boolean isLimit = false;

                for(int i = 0;  i < numbers.length; i++) {
                    if((numbers[i] >= 0 && numbers[i] <= 1000) &&
                            (numbers.length >= 1 && numbers.length <= 100)) {

                        isLimit = true;
                    }
                }

                if(isLimit) {
                    for(int j = 0; j < numbers.length; j++) {
                        tempTotal += numbers[j];
                    }

                    answer = tempTotal / numbers.length;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_머쓱이보다키큰애들 {
        class Solution {
            public int solution(int[] array, int height) {
                int answer = 0;
                boolean isWithinRange = false;

                for(int i = 0; i < array.length; i++) {
                    if((array.length >= 1 && array.length <= 100)
                            && (height >= 1 && height <= 200)
                            && (array[i] >= 1 && array[i] <= 200)) {
                        isWithinRange = true;
                    }
                }

                if(isWithinRange) {
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] > height) {
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_중복된숫자개수 {
        class Solution {
            public int solution(int[] array, int n) {
                int answer = 0;
                boolean isWithinRange = false;

                for(int i = 0; i < array.length; i++) {
                    if((array[i] >= 0 && array[i] <= 1000) &&
                            (array.length >= 1 && array.length <= 100) &&
                            (0 <= n && n <= 1000)) {
                        isWithinRange = true;
                    }
                }

                if(isWithinRange) {
                    for(int i = 0; i < array.length; i++) {
                        if(n == array[i]) {
                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_피자나눠먹기1 {
        class Solution {
            public int solution(int n) {
                int answer = 0;

                if(n >= 1 && n <= 100) {
                    answer = ((n - 1) / 7) + 1;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_피자나눠먹기3 {
        class Solution {
            public int solution(int slice, int n) {
                int answer = 0;

                if((slice >= 2 && slice <= 10)
                        && (n >= 1 && n <= 100)) {
                    answer = (n%slice == 0)? n/slice: n/slice + 1;

                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_문자열뒤집기 {

    /*
        이렇게 StringBuilder사용하면 간편히도 가능..wow

        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    */
        class Solution {
            public String solution(String my_string) {
                String answer = "";

                if(my_string.length() >= 1 && my_string.length() <= 1000) {

                    char[] my_string_char = my_string.toCharArray();
                    char[] temp_char_list = new char[my_string_char.length];

                    for(int i = my_string_char.length - 1; i >= 0; i--) {
                        temp_char_list[my_string_char.length - (i + 1)] = my_string_char[i];
                    }

                    answer = String.valueOf(temp_char_list);

                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_배열뒤집기 {
        class Solution {
            public int[] solution(int[] num_list) {
                int[] answer = new int[num_list.length];

                for (int i = num_list.length - 1; i >= 0; i--) {
                    answer[(num_list.length - 1) - i] = num_list[i];
                }


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_짝수홀수개수 {
        class Solution {
            public int[] solution(int[] num_list) {
                int numListLength = num_list.length;
                int[] answer = new int[2];
                int evenNm = 0;
                int oddNm = 0;

                for(int i = 0; i < numListLength; i++) {
                    if(num_list[i]%2 == 0) {
                        evenNm++;
                    } else {
                        oddNm++;
                    }
                }

                answer[0] = evenNm;
                answer[1] = oddNm;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_삼각형의완성조건1 {
//        import java.util.Arrays;

        class Solution {
            public int solution(int[] sides) {
                int answer = 0;
                int theOtherValue = 0;

//                Arrays.sort(sides);

                for(int i = 0; i < sides.length - 1; i++) {
                    theOtherValue += sides[i];
                }

                for(int i : sides) {
                    answer = (sides[sides.length - 1] < theOtherValue) ? 1 : 2;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_최댓값만들기1 {
//        import java.util.Arrays;

        class Solution {
            public int solution(int[] numbers) {
                int answer = 0;
//                Arrays.sort(numbers);

                answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_배열자르기 {
//      import java.util.Arrays;

        class Solution {
            public int[] solution(int[] numbers, int num1, int num2) {

                int[] answer = {};

//                answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

                return answer;

            }
        }
    }

    class 프로그래머스_난이도0_점의위치구하기 {
        class Solution {
            public int solution(int[] dot) {
                int answer = 0;

                answer = (dot[0] > 0 && dot[1] > 0) ? 1: (dot[0] < 0 && dot[1] > 0) ? 2 :
                        (dot[0] < 0 && dot[1] < 0) ? 3 : 4;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_편지 {
        class Solution {
            public int solution(String message) {
                int answer = 0;

                //1글자 = 가로2cm
                if(message.length() >= 1 && message.length() <= 50) {
                    answer = message.length() * 2;
                }


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_배열원소의길이 {

        /*
            풀이 참고
            return Arrays.stream(strList).mapToInt(String::length).toArray();
        */
        class Solution {
            public int[] solution(String[] strlist) {
                int[] answer = new int[strlist.length];

                if(strlist.length >= 1 && strlist.length <= 100) {
                    for(int i = 0; i < strlist.length; i++) {
                        answer[i] = strlist[i].lastIndexOf("") - strlist[i].indexOf("");
                    }
                }

                return answer;
            }
        }

    }

    class 프로그래머스_난이도0_아이스아메리카노 {
        class Solution {
            public int[] solution(int money) {
                int[] answer = new int[2];

                if(money > 0 && money <= 1000000) {
                    answer[0] = (money < 5500) ? 0: (money/5500);

                    answer[1] = money - (answer[0] * 5500);
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_특정문자제거하기 {
        class Solution {
            public String solution(String my_string, String letter) {
                String answer = "";

                if(my_string.length() >= 1 && my_string.length() <= 100) {
                    answer = my_string.replaceAll(letter, "");
                }

                return answer;
            }
        }

    }

}
