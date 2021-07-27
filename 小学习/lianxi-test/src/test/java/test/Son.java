package test;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-18 09:53
 **/
public class Son extends Father {

    public Son(String s) {
        super();
        System.out.println("s");
    }

    public static void main(String[] args) {
        new test.Son("s");
    }


    public void A() {
        System.out.println("A");
        B();
        this.B();
        new Son("??");
    }

    public void B() {
        System.out.println("B");
    }

}
