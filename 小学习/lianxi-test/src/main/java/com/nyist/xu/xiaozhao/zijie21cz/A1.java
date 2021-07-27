package com.nyist.xu.xiaozhao.zijie21cz;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-12 00:02
 **/
public class A1 {

    //测开 tm当时30分钟没搞出。
    //总结：逻辑都基本相似，先弄出大的if框架，完善一个，然后复制粘贴小修改就可以了。

    public static void main(String[] args) {

        int[] n09 ={0,1,2,3,4,5,6,7,8,9};
        char[] az = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] n26 ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

//        测试用例
//        LX.91
//        XJ.13

//        %123
//        %234

//        123A
//        234B

//        char x = 'L';
//        String str="LX.91";
        char x = '%';
        String str="%123";
//        char x = '1';
//        String str="123A";
        char[] cs = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        if(x>='0'&&x<='9'){
            int r = x-'0';
            for (int i = 0; i < cs.length; i++) {
                if(cs[i]>='0'&&cs[i]<='9'){
                    sb.append(n09[ (cs[i]-'0' +r)%10]);
                }else if(cs[i]>='A'&&cs[i]<='Z'){
                    sb.append( az[n26[ (cs[i]-'A' +r-1)%26]] );
                }else{
                    sb.append(cs[i]);
                }
            }
        }else if(x>='A'&&x<='Z'){
            int r = n26[x-'A'];
            for (int i = 0; i < cs.length; i++) {
                if(cs[i]>='0'&&cs[i]<='9'){
                    sb.append(n09[ (cs[i]-'0' +r)%10]);
                }else if(cs[i]>='A'&&cs[i]<='Z'){
                    sb.append( az[n26[ (cs[i]-'A' +r-1)%26]] );
                }else{
                    sb.append(cs[i]);
                }
            }
        }else {
            int r = 1;
            for (int i = 0; i < cs.length; i++) {
                if(cs[i]>='0'&&cs[i]<='9'){
                    sb.append(n09[ (cs[i]-'0' +r)%10]);
                }else if(cs[i]>='A'&&cs[i]<='Z'){
                    sb.append( az[n26[ (cs[i]-'A' +r-1)%26]] );
                }else{
                    sb.append(cs[i]);
                }
            }

        }
        System.out.println(sb.toString());
    }
}
