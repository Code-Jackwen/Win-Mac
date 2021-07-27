package study;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-28 17:07
 **/
public interface Jiekou {



    static int jingtai(int a){
        return  a+1;
    }
    default int moren(int b){
        return  b+3;
    }

}
