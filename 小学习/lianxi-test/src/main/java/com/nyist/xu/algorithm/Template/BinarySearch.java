package com.nyist.xu.algorithm.Template;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-22 18:07
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] base = {5,7,7,8,8,8,8,9,10};
        System.out.println(left_bound(base,8));//3
        System.out.println(right_bound(base,8));//6

        System.out.println(binary_search(base,8));//4
    }

    //查找一个数是否存在，不找边界。和左闭右开一样，这里为了形成对比。
    public static int binary_search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if(nums[mid] == target) {
                // 直接返回
                return mid;
            }
        }
        // 直接返回
        return -1;
    }

    //寻找左侧边界的二分搜索
    public static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {//这里后两种情况可以缩到一个里，不过不熟练就不要缩了。
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 最左就最后要检查 left 越界的情况：超出了边界或者最边界也不是目标值。
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }

    //寻找右侧边界的二分查找
    public static int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {//这里和最后一种情况可以缩到一个里，不过不熟练就不要缩了。
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }
        // 最右就最后要检查 right 越界的情况：超出了边界或者最边界也不是目标值。
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }
}
