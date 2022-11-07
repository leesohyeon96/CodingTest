package com.sohyeon.codingtest.study;

public class 나는Outer클래스 {

    private int 변수다이말이야 = 1;

    public static void main(String[] args) {
    }

    public class 나는첫번째Inner클래스 {

        int 그냥변수 = 1;

        public void test() {
            System.out.println(변수다이말이야);
        }

    }

    public class 나는두번째Inner클래스 {

        나는첫번째Inner클래스 inerr = new 나는첫번째Inner클래스();

        public void setInerr(나는첫번째Inner클래스 inerr) {
            this.inerr = inerr;
        }

        public 나는첫번째Inner클래스 getInerr() {
            return inerr;
        }

    }

    public class 나는세번째Inner클래스 {

    }


}
