package ever;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-13 09:32
 **/
//17. 打印从 1 到最大的 n 位数       刷的jz吧
public class Solution3 {
    //静态都是自己加的

    static StringBuilder res;
    static int nine = 0, start, n;//nine代表9在递归循环中出现的次数，start是控制subString截取的，n是 代表输出结果到几位数
    static char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


    public static void main(String[] args) {
        System.out.println(printNumbers(2));
    }

    public static String printNumbers(int n) {
        Solution3.n = n;//原本是this.
        res = new StringBuilder();
        num = new char[n];
        start = n - 1;//n为3的话， 代表3位数。start为2，控制一次递减。
        dfs(0);
        res.deleteCharAt(res.length() - 1);//删除最后一个逗号
        return res.toString();
    }

    //long也不行，用的字符串全排列
    //删除高位多余的 0，比如001，找start的规律...
    //时间空间都是O 10的n次方
    static void dfs(int x) {
        if (x == n) {
            String s = String.valueOf(num).substring(start);
            if (!s.equals("0")) {
                res.append(s + ",");//这个判断的生效，也就0生效一次
            }//关系式
            if (n - start == nine) start--;// 9 到 10，要进位，要减少substring的 长度
            return;
        }
        for (char i : loop) {
            if (i == '9') nine++;//nine代表 9出现的次数。  两位数的话最多出现的是两次，9,99,
            num[x] = i;
            dfs(x + 1);
//            nine--;//  这俩位置的不同.............这里就是最后一层10个中每个return都会减，减到-100
//            System.out.print("MMM"+nine);
        }
        nine--;//回溯时候，处理。  这个位置 的代码 代表：最底层每10个出来减一次。
    }
}
