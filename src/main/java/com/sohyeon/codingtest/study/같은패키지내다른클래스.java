package com.sohyeon.codingtest.study;

public class 같은패키지내다른클래스 {

    public static void main(String[] args) {


        //Outer클래스 객체 생성
        나는Outer클래스 OuterClass = new 나는Outer클래스();

        //해당 Outer클래스 내에 있는 중첩 클래스 객체 생성
//        나는Outer클래스.나는첫번째Inner클래스 InnerClass = new 나는Outer클래스().나는첫번째Inner클래스();

        /* 에러 나는 이유?
         *  '나는첫번째Inner클래스'는 static class가 아니기 때문에 외부 클래스의 인스턴스가 필요하다!
         */

        /* 에러 해결하는 방법?
         *  1. static 붙여준다
         */

        /*  2. '나는Outer클래스' 나 '나는첫번째Inner클래스'의 인스턴스를 만들어서 사용한다
         * */
        나는Outer클래스.나는첫번째Inner클래스 inner = OuterClass.new 나는첫번째Inner클래스();

    }
}
