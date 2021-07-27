import java.util.Arrays;

class System_Arrays {
    public static void main(String[] args) {
        //数组拷贝覆盖
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] ints = new int[15];
//        System.arraycopy(new int[10],0,nums, 1, 5);//[1, 0, 0, 0, 0, 0, 7, 8, 9, 10]

        //解释
        //无返回值方法，用ints[]的0开始，覆盖nums[]从1开始，覆盖个5位置长度。
        //受影响的是nums[]，也就是方法传递的第二个参数数组，也是dest数组。
        //System.arraycopy(ints,0,nums, 1, 5);


        System.arraycopy(ints,0,nums, 1, 5);//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

//        int[] ints = Arrays.copyOfRange(nums, 2, 7);
        System.out.println(Arrays.toString(ints));
    }
}