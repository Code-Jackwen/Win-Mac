package com.nyist.xu.algorithm.Template;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-02 09:20
 **/
public class BSoriginal  {
    //二分查找  模板

//    原文力扣 labuladong
//    https://leetcode-cn.com/problems/binary-search/solution/er-fen-cha-zhao-xiang-jie-by-labuladong/
//    改编cddn
//    https://blog.csdn.net/wolfGuiDao/article/details/104578209

//     ------------------------------------我的总结来自labuladong
//     ---二、三、是【）区间

    //一、寻找一个数（基本的二分搜索）
    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }

    //二、寻找左侧边界的二分搜索
    int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意

        while (left < right) { // 注意
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid; // 注意
            }
        }
        return left;
    }
    //三、寻找右侧边界的二分查找
    int right_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1; // 注意
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left - 1; // 注意
    }



//------------------------------------我不喜欢的【】全闭区间形式

    //最基本的二分查找算法：
//    int binary_search(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while(left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else if(nums[mid] == target) {
//                // 直接返回
//                return mid;
//            }
//        }
//        // 直接返回
//        return -1;
//    }

//    //寻找左侧边界的二分查找：
//    int left_bound(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] == target) {
//                // 别返回，锁定左侧边界
//                right = mid - 1;
//            }
//        }
//        // 最后要检查 left 越界的情况
//        if (left >= nums.length || nums[left] != target)
//            return -1;
//        return left;
//    }

//    //寻找右侧边界的二分查找：
//    int right_bound(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] == target) {
//                // 别返回，锁定右侧边界
//                left = mid + 1;
//            }
//        }
//        // 最后要检查 right 越界的情况
//        if (right < 0 || nums[right] != target)
//            return -1;
//        return right;
//    }


}
