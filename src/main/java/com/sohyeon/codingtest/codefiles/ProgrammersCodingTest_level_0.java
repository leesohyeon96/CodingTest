package com.sohyeon.codingtest.codefiles;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    class 프로그래머스_난이도0_배열두배만들기 {
        class Solution {
            public int[] solution(int[] numbers) {
                int[] answer = new int[numbers.length];

                if(numbers.length >= 1 && numbers.length <= 1000) {
                    for(int i = 0; i < numbers.length; i++) {
                        answer[i] = numbers[i] * 2;
                    }
                }

                return answer;
            }
        }

    }
    
    class 프로그래머스_난이도0_문자반복출력하기 {
        class Solution {
            public String solution(String my_string, int n) {
                String answer = "";
                char[] ch = my_string.toCharArray();
                String[] strArray = new String[my_string.length()];

                if((my_string.length() >= 2 && my_string.length() <= 5)
                        && (n >= 2 && n <= 10)) {
                    for(int i = 0; i < ch.length; i++) {
                        String str = "";

                        for(int j = 0; j < n; j++) {
                            str += ch[i];
                        }
                        strArray[i] = str;

                    }

                    for(int i = 0; i < strArray.length; i++) {
                        answer += strArray[i];
                    }

                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_짝수는싫어요 {

//import java.util.ArrayList;
//import java.util.List;
        class Solution {
            public int[] solution(int n) {

                int anonymousNum = (n%2 == 0)? n/2: (n/2) + 1;
                int[] answer = new int[anonymousNum];
//                List<Integer> test = new ArrayList<>();

                if(n >= 1 && n <= 100) {
                    for(int i = 1; i <= n; i++) {
                        if(i%2 == 1) {
//                            test.add(i);
                        }
                    }

                    for(int i = 0; i < answer.length; i++) {
//                        answer[i] = test.get(i);
                    }
                }

                return answer;
            }
        }

        class 프로그래머스_난이도0_배열의유사도 {
            class Solution {
                public int solution(String[] s1, String[] s2) {
                    int answer = 0;

                    for(int i = 0; i < s1.length; i++) {
                        for(int j = 0; j < s2.length; j++) {
                            if(s1[i].equals(s2[j])) {
                                answer++;
                            }
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_제곱수판별하기 {

            /* 참고

            if (n % Math.sqrt(n) == 0) {
                return 1;
            } else {
                return 2;
            }

            */
            class Solution {
                public int solution(int n) {
                    double tmpDb = Math.sqrt(n);
                    String str = String.format("%.1f", tmpDb);

                    String afterDotNum = str.substring(str.indexOf(".") + 1);

                    int answer = (afterDotNum.equals("0"))? 1: 2;

                    return answer;
                }
            }

        }

        class 프로그래머스_난이도0_문자열안에문자열 {
            class Solution {
                public int solution(String str1, String str2) {

                    int answer = 0;

                    answer = (str1.indexOf(str2) != -1)? 1: 2;

                    return answer;
                }
            }

        }

        class 프로그래머스_난이도0_옷가게할인받기 {
            class Solution {
                public int solution(int price) {
                    int answer = 0;

                    if(price >= 10 && price <= 1000000) {

                        answer = (price < 100000)? price:
                                (price >= 100000 && price < 300000)? price - (int)(Math.round(price * 0.05)):
                                        (price >= 300000 && price < 500000)? price - (int)(Math.round(price * 0.1)):
                                                price - (int)(Math.round(price * 0.2));

                    }

                    return answer;
                }
            }

        }

        class 프로그래머스_난이도0_자릿수더하기 {

            /* 참고

            while(n>0){
                answer+=n%10;
                n/=10;
            }

            return answer;

            */

//            import java.util.stream.Stream;
            class Solution {
                public int solution(int n) {
                    int answer = 0;

//                    int[] intArray = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

//                    for(int i : intArray) {
//                        answer += i;
//                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_중앙값구하기 {
//            import java.util.Arrays;

            class Solution {
                public int solution(int[] array) {

//                    Arrays.sort(array);

                    return array[array.length/2];
                }
            }
        }

        class 프로그래머스_난이도0_순서쌍의개수 {

            /* 참고
                import java.util.stream.IntStream;
            *  return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
            * */
            class Solution {
                public int solution(int n) {
                    int answer = 0;

                    for(int i = 1; i <= n; i++) {
                        if(n%i == 0) {
                            answer++;
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_숨어있는숫자의덧셈1 {
            class Solution {
                public int solution(String my_string) {
                    int answer = 0;

                    char[] chArray = my_string.toCharArray();

                    for(int i = 0; i < chArray.length; i++) {
                        if(chArray[i] >= 48 && chArray[i] <= 57) {
                            answer += Integer.parseInt(String.valueOf(chArray[i]));
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_모음제거 {
            /* 참고
            * answer = my_string.replaceAll("[aeiou]", "");
            * */

//            import java.util.Arrays;
            class Solution {
                public String solution(String my_string) {
                    String answer = "";
                    String[] vowel = {"a","e","i","o","u"};
                    StringBuilder strb = new StringBuilder();


                    for(int i = 0; i < my_string.length(); i++) {
                        char tmpCh = my_string.charAt(i);
                        String tmpStr = String.valueOf(tmpCh);

//                        if(!Arrays.asList(vowel).contains(tmpStr)) {
//                            strb.append(my_string.charAt(i));
//                        }
                    }

                    return strb.toString();
                }
            }
        }

        class 프로그래머스_난이도0_개미군단 {
            class Solution {
                public int solution(int hp) {
                    int answer = 0;
                    int tmpHp = hp;

                    //for말고 while(hp > 0) 해서 반복시켰으면 좋았을 듯 하다
                    for(int i = 1; i <= tmpHp; i++) {

                        boolean isZero = (hp <= 0)? false: true;

                        if(isZero) {
                            int antKind = (hp/5 > 0)? 5: (hp/3 > 0)? 3: 1;

                            switch(antKind) {
                                case 3:
                                    answer += hp/3;
                                    hp -= hp/3*3;
                                    break;
                                case 5:
                                    answer += hp/5;
                                    hp -= hp/5*5;
                                    break;
                                case 1:
                                    answer += hp/1;
                                    hp -= hp/1*1;
                                    break;
                                default:
                                    break;

                            }
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_세균증식 {

            /*

            참고
            int answer = 0;
            answer = n << t;
            return answer;
            [풀이] 쉬프트 연산자(<<, >>) 
                -> x << n 인 경우 x * 2(n제곱)의 결과와 같고 
                -> x >> n 인 경우 x / 2(n제곱)의 결과와 같다
                가독성이 떨어지지만 덧셈/나눗셈 연산자보다 프로그램 실행속도가 빠름
            */

            class Solution {
                public int solution(int n, int t) {

                    for(int i = 1; i <= t; i++) {
                        n *= 2;
                    }

                    return n;
                }
            }
        }

        class 프로그래머스_난이도0_n의배수고르기 {
        //        import java.util.Arrays;
            class Solution {
                public int[] solution(int n, int[] numlist) {

                    int[] answer = {};

//                    answer = Arrays.stream(numlist).filter(i -> i%n == 0).toArray();


                    return answer;
                }
            }

            
        }

        class 프로그래머스_난이도0_문자열정렬하기1 {

            /* 참고
            * import java.util.*;
                class Solution {
                    public int[] solution(String myString) {
                        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
                    }
                }
            * */


            //import java.util.Arrays;
            //import java.util.stream.IntStream;
            //import java.util.stream.Stream;

            class Solution {
                public int[] solution(String my_string) {
                    int[] answer = {};

//                    IntStream intSt = my_string.chars();

//                    String str = intSt.filter(i -> (48 <= i && i <= 57)).collect(StringBuilder::new,
//                                    StringBuilder::appendCodePoint,
//                                    StringBuilder::append)
//                            .toString();
//
//                    answer = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
//
//                    Arrays.sort(answer);

                    return answer;


                }
            }
        }

        class 프로그래머스_난이도0_직삼각형출력하기 {

            /* 참고

            for(int i=1; i<=n; i++){
                System.out.println("*".repeat(i));
            }

            * */


//            import java.util.Scanner;

            public class Solution {
//                public static void main(String[] args) {
//                    Scanner sc = new Scanner(System.in);
//                    int n = sc.nextInt();

//                    for(int i = 1; i < n+1; i++) {
//                        for(int j = 0; j < i; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println("");
//                    }
//                }
            }
        }

        class 프로그래머스_난이도0_주사위의개수 {
            class Solution {
                public int solution(int[] box, int n) {
                    int answer = 0;
                    // 가로,세로,높이 -> box배열에 저장
                    // 주사위 모서리 길이 -> n

                    answer = (box[0]/n) * (box[1]/n) * (box[2]/n);


                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_가위바위보 {
            // 참고!!
            //return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
            class Solution {
                public String solution(String rsp) {

                    char[] ch = rsp.toCharArray();
                    char[] newCh = new char[ch.length];


                    for(int i = 0; i < ch.length; i++) {

                        if(ch[i] == '2') {
                            newCh[i] = '0';
                        }

                        if(ch[i] == '0') {
                            newCh[i] = '5';
                        }

                        if(ch[i] == '5') {
                            newCh[i] = '2';
                        }

                    }

                    return String.valueOf(newCh);
                }
            }
        }

        class 프로그래머스_난이도0_대문자와소문자 {

        //참고
        //return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());

        //import java.util.Arrays;
        //import java.util.stream.*;

            class Solution {
                public String solution(String my_string) {

                    IntStream inSt = my_string.chars();

                    String str = inSt.map(i -> (i >= 97 && i <= 122) ? (i - 32): (i + 32)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

                    return Stream.of(str.split("")).collect(Collectors.joining());

                }
            }
        }

        class 프로그래머스_난이도0_암호해독 {
            // TODO 나중에 Stream으로 바꾸기(어려웠음)
            // 참고
//            return IntStream.range(0, cipher.length())
//                    .filter(value -> value % code == code - 1)
//                    .mapToObj(c -> String.valueOf(cipher.charAt(c)))
//                    .collect(Collectors.joining());
            class Solution {
                public String solution(String cipher, int code) {
                    String answer = "";

                    char[] cipherCh = cipher.toCharArray();

                    for(int i = 0; i <= cipherCh.length; i++) {
                        if((i != 0) && (i%code == 0)) {
                            answer += Character.toString(cipherCh[i - 1]);
                        }
                    }

                    return answer;
                }
            }

        }

        class 프로그래머스_난이도0_약수구하기 {
            class Solution {
                public int[] solution(int n) {

                    return IntStream.rangeClosed(1, n).filter(i -> n%i == 0).toArray();
                }
            }
        }

        class 프로그래머스_난이도0_가장큰수찾기 {

            // 참고
            // List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
            // int max = list.stream().max(Integer::compareTo).orElse(0);
            // int index = list.indexOf(max);
            // return new int[] {max, index};
            public int[] solution(int[] array) {

//          이 코드는 되지만 통과 x
//         Arrays.sort(array);
//         int maxNum = array[array.length - 1];

//         int indexNum = IntStream.range(0, array.length)
//                 .filter(i -> maxNum == array[i])
//                 .findFirst()
//                 .orElse(-1);

//         int[] answer = {maxNum, indexNum - 1};

                int[] answer = new int[2];
                int maxNum = 0;
                int index = 0;

                for(int i = 0; i < array.length; i++) {
                    if( maxNum < array[i]) {
                        maxNum = array[i];
                        index = i;
                    }
                }

                answer[0] = maxNum;
                answer[1] = index;


                return answer;
            }
        }

        class 프로그래머스_난이도0_배열회전시키기 {
            // 참고
            //            List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
            //
            //        if (direction.equals("right")) {
            //                list.add(0, list.get(list.size() - 1));
            //                list.remove(list.size() - 1);
            //            } else {
            //                list.add(list.size(), list.get(0));
            //                list.remove(0);
            //            }
            //        return list.stream().mapToInt(Integer::intValue).toArray();
            class Solution {
                public int[] solution(int[] numbers, String direction) {
                    int[] answer = new int[numbers.length];

                    if(("right").equals(direction)) {
                        for(int i = 0; i < numbers.length; i++) {
                            if(i == 0) {
                                answer[i] = numbers[numbers.length - 1];
                            }
                            if(i > 0 && i <= numbers.length - 1) {
                                answer[i] = numbers[i-1];
                            }
                        }
                    } else {
                        for(int i = 0; i < numbers.length; i++) {
                            if(i < numbers.length - 1) {
                                answer[i] = numbers[i+1];
                            }
                            if(i == numbers.length - 1) {
                                answer[i] = numbers[0];
                            }
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_숫자찾기 {
            //참고1
            //return ("-" + num).indexOf(String.valueOf(k)); -> 와

            //참고2
            //        String numStr = String.valueOf(num);
            //        String kStr = String.valueOf(k);
            //
            //        int answer = numStr.indexOf(kStr);
            //        return answer < 0 ? -1 : answer + 1 ;
            class Solution {
                public int solution(int num, int k) {
                    int answer = 0;

                    int[] intArray = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

                    answer = IntStream.range(0, intArray.length).filter(i-> (intArray[i] == k)).map(i -> (i+1)).findFirst().orElse(-1);

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_외계행성의나이 {
            //참고
            //return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
            class Solution {
                public String solution(int age) {
                    int[] intArray = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
                    char[] ch = new char[intArray.length];

                    for(int i = 0; i < intArray.length; i++) {
                        intArray[i] += 97;
                        ch[i] = (char)intArray[i];
                    }



                    return String.valueOf(ch);
                }
            }
        }

        class 프로그래머스_난이도0_피자나눠먹기2 {
            class Solution {
                public int solution(int n) {
                    int answer = 0;
                    int num = 1;

                    for(;;) {
                        if((n * num) % 6 == 0) {
                            answer = (n * num)/6;
                            break;
                        } else {
                            num++;
                        }
                    }

                    return answer;
                }
            }
        }

        class 프로그래머스_난이도0_최댓값만들기2 {
            // 참고 - 오옴...
            //       Arrays.sort(numbers);
            //        return numbers[numbers.length-1] * numbers[numbers.length-2] < numbers[0] * numbers[1] ?
            //            numbers[0] * numbers[1] : numbers[numbers.length-1] * numbers[numbers.length-2];
            class Solution {
                public int solution(int[] numbers) {
                    int answer= -100000000;
                    for(int i=0; i<numbers.length-1; i++){
                        for(int j=i+1; j<numbers.length; j++){
                            if(answer<numbers[i]*numbers[j]){
                                answer=numbers[i]*numbers[j];
                            }
                        }
                    }
                    return answer;
                }
            }
        }
    }

    class 프로그래머스_난이도0_인덱스바꾸기 {
        //참고
        //List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
        //
        //        Collections.swap(list, num1, num2);
        //         swap -> list안에 있는 데이터를 변경할 때 쓰이는 메소드
        //        return String.join("", list);
        class Solution {
            public String solution(String my_string, int num1, int num2) {

                char[] ch = my_string.toCharArray();
                char tmpCh = ' ';

                for(int i = 0; i < ch.length; i++) {
                    if(i == num1) {
                        tmpCh = ch[i];
                        ch[i] = ch[num2];
                    }
                    if(i == num2) {
                        ch[i] = tmpCh;
                    }
                }

                return String.valueOf(ch);
            }
        }
    }

    class 프로그래머스_난이도0_369게임 {
        //참고
        //return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
        class Solution {
            public int solution(int order) {
                int answer = 0;

                int[] intArray = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
                answer = (int)IntStream.range(0, intArray.length).filter(i-> ((intArray[i] != 0) && (intArray[i] % 3 == 0))).count();

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_문자열정렬하기2 {
        //참고
        //char[] c = my_string.toLowerCase().toCharArray();
        //        Arrays.sort(c);
        //        return new String(c);

//        import java.util.*;
//import java.util.stream.*;
        class Solution {
            public String solution(String my_string) {
                String answer = "";

                answer = Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_합성수찾기 {
        //참고
        //return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
        class Solution {
            public int solution(int n) {
                int answer = 0;

                for(int i = 1; i <= n; i++) {
                    int key = i;
                    if((IntStream.rangeClosed(1, key).filter(j -> key%j == 0).count()) >= 3) {
                        answer++;
                    }
                }

                return answer;
            }
        }

    }

    class 프로그래머스_난이도0_중복된문자제거 {
        //참고
        //return my_string.chars()
        //                .mapToObj(Character::toString)
        //                .distinct()
        //                .collect(Collectors.joining());

        //참고2
        //       String[] answer = my_string.split("");
        //        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        //
        //        return String.join("", set);
        class Solution {
            public String solution(String my_string) {
                String answer = Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_팩토리얼 {
        //참고
        //int fac = 1;
        //        int i = 0;
        //
        //        while(true){
        //            if(fac <= n){
        //                fac *= i + 1;
        //                i++;
        //            }else break;
        //        }
        //
        //        return i-1;
        class Solution {
            public int solution(int n) {
                int answer = 0;

                for(int i = 1; i <= 10; i++) {
                    if(fact(i) > n) {
                        continue;
                    } else {
                        answer = i;
                    }
                }

                return answer;
            }

            public int fact(int n) {
                if(n <= 1)
                    return n;
                else
                    return fact(n-1)*n;
            }
        }
    }

    class 프로그래머스_난이도0_모스부호1 {
        //참고
        //Map<String, String> dictionary = new HashMap<>() {{
        //        put(".-", "a");
        //        put("-...", "b");
        //        put("-.-.", "c");
        //        put("-..", "d");
        //        put(".", "e");
        //        put("..-.", "f");
        //        put("--.", "g");
        //        put("....", "h");
        //        put("..", "i");
        //        put(".---", "j");
        //        put("-.-", "k");
        //        put(".-..", "l");
        //        put("--", "m");
        //        put("-.", "n");
        //        put("---", "o");
        //        put(".--.", "p");
        //        put("--.-", "q");
        //        put(".-.", "r");
        //        put("...", "s");
        //        put("-", "t");
        //        put("..-", "u");
        //        put("...-", "v");
        //        put(".--", "w");
        //        put("-..-", "x");
        //        put("-.--", "y");
        //        put("--..", "z");
        //    }};
        //
        //    public String solution(String letter) {
        //        return Arrays.stream(letter.split(" "))
        //            .map(dictionary::get)
        //            .collect(Collectors.joining());
        //    }

        class Solution {
            public String solution(String letter) {
                StringBuilder sb = new StringBuilder();

                String[] morse = {
                        ".-","-...","-.-.","-..",".","..-.",
                        "--.","....","..",".---","-.-",".-..",
                        "--","-.","---",".--.","--.-",".-.",
                        "...","-","..-","...-",".--","-..-",
                        "-.--","--.."
                };

                String[] mossAlpah = {
                        "a", "b", "c", "d", "e", "f", "g", "h",
                        "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w", "x", "y","z"
                };

                String[] letterArray = letter.split(" ");

                for(int i = 0; i < letterArray.length; i++) {
                    for(int j = 0; j < morse.length; j++) {
                        if(letterArray[i].equals(morse[j])) {
                            sb.append(mossAlpah[j]);
                        }
                    }
                }

                return sb.toString();
            }
        }
    }

    class 프로그래머스_난이도0_A로B만들기 {
        //참고
        //        char[] a = before.toCharArray();
        //        char[] b = after.toCharArray();
        //        Arrays.sort(a);
        //        Arrays.sort(b);
        //
        //        return new String(a).equals(new String(b)) ? 1 :0;

        //참고
        //       for(int i = 0; i < before.length(); i++){
        //            after = after.replaceFirst(before.substring(i,i+1),"");
        //        }
        //        return after.length() == 0? 1: 0;
        class Solution {
            public int solution(String before, String after) {

                int answer = 0;
                int beforeSum = 0;
                int afterSum = 0;

                for(int i = 0; i < before.length(); i++) {
                    beforeSum += before.charAt(i);
                    afterSum += after.charAt(i);
                }

                answer = (beforeSum == afterSum)? 1: 0;


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_2차원으로만들기 {
        //참고
        //       int[][] answer = {};
        //
        //        int length = num_list.length;
        //
        //        answer = new int[length/n][n];
        //
        //        for(int i=0; i<length; i++){
        //            answer[i/n][i%n]=num_list[i];
        //        }
        //
        //        return answer;
        class Solution {
            public int[][] solution(int[] num_list, int n) {
                int[][] answer = new int[num_list.length/n][n];
                int cnt = 0;

                for(int i = 0; i < answer.length; i++) {
                    for(int j = 0; j < answer[i].length; j++) {
                        answer[i][j] = num_list[cnt];
                        cnt++;
                    }
                }


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_k의개수 {
        //참고
        //String str = "";
        //        for(int a = i; a <= j; a++) {
        //            str += a+"";
        //        }
        //
        //        return str.length() - str.replace(k+"", "").length();
        class Solution {
            public int solution(int i, int j, int k) {

                int answer = 0;

                int[] intArray = IntStream.rangeClosed(i, j).toArray();
                String str = Arrays.toString(intArray).replaceAll("[^0-9]","");

                char[] ch = str.toCharArray();

                for(int z = 0; z < ch.length; z++) {
                    if(ch[z] - '0' == k) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_가까운수 {
        //참고
        //return Math.min(array[Arrays
        //                          .stream(array)
        //                          .map(operand -> Math.abs(n - operand))
        //                          .boxed()
        //                          .collect(Collectors.toList())
        //                          .indexOf(Arrays
        //                                      .stream(array)
        //                                      .map(operand -> Math.abs(n - operand))
        //                          .min()
        //                          .orElse(0))],
        //
        //           array[Arrays.stream(array)
        //                       .map(operand -> Math.abs(n - operand))
        //                       .boxed()
        //                       .collect(Collectors.toList())
        //                       .lastIndexOf(Arrays
        //                                      .stream(array)
        //                                      .map(operand -> Math.abs(n - operand))
        //                                      .min()
        //                                      .orElse(0))]);
        class Solution {
            public int solution(int[] array, int n) {
                int answer = 0;

                List<Integer> list = Arrays.stream(array)
                        .map(el -> Math.abs(el - n))
                        .boxed()
                        .collect(Collectors.toList());

                int a = Collections.min(list);

                List<Integer> reallist = Arrays.stream(array)
                        .sorted()
                        .filter(i -> Math.abs(n-i) == a)
                        .boxed()
                        .collect(Collectors.toList());

                answer = reallist.get(0);

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_진료순서정하기 {
        //참고
        //return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
        class Solution {
            public int[] solution(int[] emergency) {
                int[] answer = new int[emergency.length];

                for(int i = 0; i < emergency.length; i++) {
                    answer[i] = emergency.length;
                    for(int j = 0; j < emergency.length; j++) {
                        if(emergency[i] > emergency[j]) {
                            answer[i] -= 1;
                        }
                    }
                }
                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_한번만등장한문자 {

        //참고
        // Arrays.stream(s.split(""))
        //                .collect(Collectors.groupingBy(s1 -> s1))
        //                .entrySet()
        //                .stream()
        //                .filter(entry -> entry.getValue().size() <= 1)
        //                .map(Map.Entry::getKey)
        //                .sorted()
        //                .collect(Collectors.joining());
        class Solution {
            public String solution(String s) {
                String answer = "";
                char[] ch = s.toCharArray();
                List<String> list = new ArrayList();

                for(int i = 0; i < s.length(); i++) {
                    if(countChar(s, ch[i]) == 1) {
                        list.add(String.valueOf(ch[i]));
                    }
                }

                answer = list.stream().sorted()
                        .collect(Collectors.joining());

                return answer;
            }

            public int countChar(String str, char ch) {
                return str.length() - str.replace(String.valueOf(ch), "").length();
            }
        }
    }

    class 프로그래머스_난이도0_숨어있는숫자의덧셈2 {
        // \\D -> 대문자, 소문자
        // \\s+ -> 숫자인듯?

        // 참고
        //  int answer = 0;
        //
        //  String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        //
        //  for(String s : str){
        //    if(!s.equals("")) answer += Integer.valueOf(s);
        //  }
        //  return answer;

        // 참고
        // Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
        class Solution {
            public int solution(String my_string) {
                int answer = 0;
                my_string = my_string.replaceAll("\\D", " ").replaceAll("\\s+", " ").trim();

                if(my_string.equals("")) {
                    return 0;

                } else {
                    String[] str = my_string.split("\\s");

                    for (String s : str) {
                        s = s.trim();
                        answer += Integer.parseInt(s);
                    }

                    return answer;
                }
            }
        }
    }

    class 프로그래머스_난이도0_이진수더하기 {
        class Solution {
            public String solution(String bin1, String bin2) {
                int total = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);

                return Integer.toBinaryString(total);
            }
        }
    }

    class 프로그래머스_난이도0_평균구하기 {
        // 참고
        // Arrays.stream(arr).average().orElse(0);
        class Solution {
            public double solution(int[] arr) {
                return (double)(Arrays.stream(arr).sum()) / arr.length ;
            }
        }
    }

    class 프로그래머스_난이도0_7의개수 {
        //참고
        //(int) Arrays.stream(
        //                        Arrays.stream(array)
        //                                .mapToObj(String::valueOf)
        //                                .collect(Collectors.joining())
        //                                .split("")
        //                )
        //                .filter(s -> s.equals("7"))
        //                .count();
        class Solution {
            public int solution(int[] array) {
                int answer = 0;

                answer = Arrays
                .stream(array)
                .mapToLong(i -> Arrays.stream(Stream.of(String.valueOf(i).split(""))
                                        .mapToInt(Integer::parseInt).toArray())
                                        .filter(num -> num == 7).count())
                                        .mapToInt(num -> (int)num)
                                        .sum();


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_공던지기 {
        class Solution {
            public int solution(int[] numbers, int k) {
                int answer = 0;
                int index = k * 2;

                while(true) {
                    if(index < numbers.length) {
                        index -= k;
                        System.out.println("index : " + index);
                        break;
                    }

                    if(index >= numbers.length) {
                        int last = ((index / numbers.length) * numbers.length);

                        index -= last;
                        if(index - 2 < 0) {
                            index = numbers.length + (index - 2);
                        } else {
                            index -= 2;
                        }
                        break;
                    }
                }

                answer = numbers[index];

                return answer;
            }
        }

        class 프로그래머스_난이도0_소인수분해 {
            class Solution {
                public int[] solution(int n) {
                    int[] answer = {};

                    int localnum = n;

                    int cnt = (int) IntStream.rangeClosed(1, n)
                            .filter(i -> localnum % i == 0)
                            .count();
                    TreeSet<Integer> treeSet = new TreeSet<>();


                    if(cnt > 2) {
                        while(true) {
                            if(n % 2 == 0) {
                                treeSet.add(2);
                                n /= 2;
                            }

                            if(n % 2 == 1) {
                                for(int i = 1; i <= n; i++) {

                                    if(n % i == 0) {
                                        if(i == 1) {
                                            continue;
                                        }
                                        treeSet.add(i);
                                        n /= i;
                                    }
                                }
                            }

                            if(n == 1) {
                                answer = treeSet.stream()
                                        .mapToInt(Integer::intValue)
                                        .toArray();
                                break;
                            }
                        }
                    } else {
                        answer = new int[1];
                        answer[0] = n;
                    }

                    return answer;
                }
            }
            class 프로그래머스_난이도0_영어가싫어요 {
                // 참고
                //String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                //
                //            for (int i = 0; i < numbers_arr.length; i++) {
                //                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
                //            }
                //
                //            long answer = Long.parseLong(numbers);
                //            return answer;
                class Solution {
                    public long solution(String numbers) {

                        String[] numArray = { "zero", "one", "two", "three", "four", "five", "six", "seven"
                                , "eight", "nine"};
                        String[] intArray = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

                        for(int i = 0; i < numArray.length; i++) {
                            if(numbers.contains(numArray[i])) {
                                numbers = numbers.replaceAll(numArray[i], intArray[i]);
                            }
                        }


                        return Long.parseLong(numbers);
                    }
                }

                class 프로그래머스_난이도0_잘라서배열로저장하기 {
//                     참고
//                     Double cnt = (double) Math.ceil((double) my_str.length() / n) ;
//                            String[] answer = new String[cnt.intValue()];
//                            int j = 0;
//
//                            for(int i=0; i < cnt.intValue(); i++) {
//                                if(my_str.length() % n == 0) {
//                                    answer[i] = my_str.substring(j, j+n);
//                                }else {
//                                    if(i == cnt - 1) {
//                                        answer[i] = my_str.substring(j);
//                                    }else {
//                                        answer[i] = my_str.substring(j, j+n);
//                                    }
//                                }
//
//                                j = j + n ;
//                            }
//                            return answer;
//
//                    참고
//                    int resultCnt = (my_str.length() + n - 1) / n;
//                            String[] answer = new String[resultCnt];
//
//                            for (int i = 0; i < resultCnt; i++) {
//                                int start = n * i;
//                                int end = start + n >= my_str.length()? my_str.length(): start + n;
//                                answer[i] = my_str.substring(start, end);
//                            }
//
//                            return answer;
//
//                     내가 작성한 코드
                    class Solution {
                        public String[] solution(String my_str, int n) {
                            String[] answer = {};
                            List<String> list = new ArrayList<>();

                            while(true) {
                                int strLength = my_str.length();

                                if(strLength > 0 && strLength >= n) {
                                    String shortStr = my_str.substring(0, n);

                                    list.add(shortStr);
                                    my_str = my_str.replace(shortStr, "");
                                    strLength -= n;

                                } else if(strLength > 0 && strLength < n) {
                                    String shortStr = my_str.substring(0);

                                    my_str = my_str.replace(shortStr, "");
                                    list.add(shortStr);
                                    strLength -= n;
                                } else {
                                    break;
                                }
                            }
                            Arrays.stream(list.toArray()).forEach(System.out::println);

                            answer = list.toArray(new String[list.size()]);

                            return answer;
                        }
                    }
                }
                class 프로그래머스_난이도0_컨트롤제트 {
                    class Solution {
                        public int solution(String s) {
                            int answer = 0;

                            String[] strArray = s.split(" ");

                            for(int i = 0; i < strArray.length; i++) {
                                if(strArray[i].equals("Z")) {
                                    answer -= Integer.parseInt(strArray[i -1]);
                                    continue;
                                }
                                answer += Integer.parseInt(strArray[i]);
                            }
                            return answer;
                        }
                    }
                }

                class 프로그래머스_난이도0_문자열계산하기 {
                    //참고
                    //return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
                    class Solution {
                        public int solution(String my_string) {
                            int answer = 0;

                            String[] strArray = my_string.split(" ");
                            for(int i = 0; i < strArray.length; i++) {

                                if(i == 0) {
                                    answer = Integer.valueOf(strArray[i]);
                                }

                                if(strArray[i].equals("+") || strArray[i].equals("-")) {
                                    answer = (strArray[i].equals("+")) ? answer + Integer.parseInt(strArray[i + 1]) : answer - Integer.parseInt(strArray[i + 1]);
                                }


                            }

                            return answer;
                        }


                    }
                }

                class 프로그래머스_난이도0_구슬을나누는경우의수 {
                    class Solution {
                        public long solution(int balls, int share) {
                            long answer = 1L;
                            int cnt = 1;

                            while(cnt <= share) {
                                answer *= balls--;
                                answer /= cnt++;
                            }

                            return answer;
                        }
                    }
                }

                class 프로그래머스_난이도0_삼각형의완성조건2 {
                    class Solution {
                        public int solution(int[] sides) {
                            int answer = 0;

                            sides = Arrays.stream(sides).sorted().toArray();

                            int longSide = (int) IntStream.rangeClosed((sides[1] - sides[0] + 1), sides[1]).count();
                            int notLongSide = (int)IntStream.range((sides[1] + 1), (sides[0] + sides[1])).count();
                            return longSide + notLongSide;
                        }
                    }
                }

                class 프로그래머스_난이도0_외계어사전 {

                    class Solution {
                        public int solution(String[] spell, String[] dic) {
                            int answer = 2;

                            String spellStr = String.join("", spell);
                            String[] originLength = new String[dic.length];
                            String[] afterLength = new String[dic.length];

                            StringBuilder sb = new StringBuilder();

                            for(int i = 0; i < dic.length; i++) {
                                originLength[i] = dic[i];
                                sb.setLength(0);

                                dic[i] = sb.append(dic[i]).append(spellStr).toString();
                                dic[i] = Arrays.stream(dic[i].split("")).distinct().collect(Collectors.joining());

                                afterLength[i] = dic[i];

                                if(originLength[i].length() == afterLength[i].length()
                                        && originLength[i].equals(afterLength[i])) {
                                    answer = 1;
                                    break;
                                }
                            }

                            return answer;
                        }
                    }
                }
                class 프로그래머스_난이도0_캐릭터의좌표 {
                    // 참고
                    // 오.. int[] now = {0, 0};
                    //        for (int i = 0; i < keyinput.length; i++){
                    //            if(keyinput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
                    //            else if(keyinput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
                    //            else if(keyinput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
                    //            else if(keyinput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
                    //            }
                    //        return now;
                    class Solution {
                        public int[] solution(String[] keyinput, int[] board) {
                            int[] answer = new int[2];

                            int xNm = 0;
                            int yNm = 0;

                            for(int i = 0; i < keyinput.length; i++) {
                                String str = keyinput[i];
                                if("left".equals(str)) {
                                    xNm--;
                                    xNm = limitXBoard(xNm, board);
                                } else if("right".equals(str)) {
                                    xNm++;
                                    xNm = limitXBoard(xNm, board);
                                } else if("up".equals(str)) {
                                    yNm++;
                                    yNm = limitYBoard(yNm, board);
                                } else {
                                    yNm--;
                                    yNm = limitYBoard(yNm, board);
                                }
                            }

                            answer[0] = xNm;
                            answer[1] = yNm;

                            return answer;
                        }

                        public int limitXBoard(int x, int[] board) {
                            // x
                            if (Math.abs(x) > ((board[0] - 1) / 2)) {
                                int boardIntForX = board[0] - 1;

                                if (x > 0) {
                                    x = boardIntForX / 2;
                                } else {
                                    x = -(boardIntForX / 2);
                                }
                            }

                            return x;
                        }

                        public int limitYBoard(int y, int[] board) {
                            // y
                            if(Math.abs(y) > ((board[1] - 1) / 2)) {
                                int boardIntForY = board[1] - 1;

                                if(y > 0) {
                                    y = boardIntForY / 2;
                                } else {
                                    y = -(boardIntForY / 2);
                                }

                            }
                            return y;
                        }
                    }
                }

                class 프로그래머스_난이도0_종이자르기 {
                    class Solution {
                        public int solution(int M, int N) {
                            int answer = (M - 1) + ((N - 1) * M);

                            return answer;
                        }
                    }
                }

                class 프로그래머스_난이도0_직사각형넓이구하기 {
                    // 참고
                    //        int answer = 0;
                    //        int tmp = dots[0][0];
                    //        int tmp2 = 0;
                    //        int tmp3 = 0;
                    //        for(int i = 1; i<dots.length; i++){
                    //            if(dots[i][0] == tmp){
                    //                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
                    //            }else{
                    //                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
                    //            }
                    //        }
                    //        answer = tmp2 * tmp3;
                    //        return answer;
                    class Solution {
                        public int solution(int[][] dots) {
                            int answer = 0;
                            int topX = dots[0][0];
                            int topY = dots[0][1];
                            int bottomX = dots[0][0];
                            int bottomY = dots[0][1];

                            for(int i = 0; i < dots.length; i++) {
                                for(int j = 0; j < dots[i].length; j++) {
                                    if(dots[i][0] > topX) {
                                        topX = dots[i][0];
                                    }

                                    if(dots[i][0] <= bottomX) {
                                        bottomX = dots[i][0];
                                    }

                                    if(dots[i][1] > topY) {
                                        topY = dots[i][1];
                                    }

                                    if(dots[i][1] <= bottomY) {
                                        bottomY = dots[i][1];
                                    }
                                }
                            }

                            answer = Math.abs(topX - bottomX) * Math.abs(topY - bottomY);

                            // test 용 커밋
                            return answer;
                        }
                    }
                }

                class 프로그래머스_난이도0_로그인성공 {
                    // 참고
                    // public String solution(String[] idPw, String[][] db) {
                    //        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
                    //    }
                    //
                    //    private Map<String, String> getDb(String[][] db) {
                    //        Map<String, String> map = new HashMap<>();
                    //
                    //        for (String[] array : db) {
                    //            map.put(array[0], array[1]);
                    //        }
                    //        return map;
                    class Solution {
                        public String solution(String[] id_pw, String[][] db) {
                            String answer = "";
                            String id = id_pw[0];
                            String pwd = id_pw[1];
                            boolean IDandPwd = false;
                            boolean ID = false;

                            for(int i = 0; i < db.length; i++) {
                                if(db[i][0].equals(id)) {
                                    ID = true;
                                    if(db[i][1].equals(pwd)) {
                                        IDandPwd = true;
                                    }
                                }
                            }


                            if(IDandPwd) {
                                answer = "login";
                            } else if(ID) {
                                answer = "wrong pw";
                            } else {
                                answer = "fail";
                            }


                            return answer;
                        }
                    }
                }
            }
        }
    }
}
