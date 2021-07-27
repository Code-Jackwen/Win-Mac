package com.nyist.xu.lambda.lambda1;

import com.nyist.xu.service.lambda1.Item;
import com.nyist.xu.service.lambda1.ItemCreatorBlankConstruct;
import com.nyist.xu.service.lambda1.ItemCreatorParamContruct;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 18:14
 **/
public class Exe2 {

    //构造方法的引用
    //一般我们需要声明接口，该接口作为对象的生成器，
    //通过 类名::new 的方式来实例化对象，然后调用方法返回对象。
    public static void main(String[] args) {
        ItemCreatorBlankConstruct creator = () -> new Item();
        Item item = creator.getItem();

        ItemCreatorBlankConstruct creator2 = Item::new;
        Item item2 = creator2.getItem();

        // 我自己 创建 了 构造函数后不报错了，不理解这样操作的 含义。
        ItemCreatorParamContruct creator3 = Item::new;
        Item item3 = creator3.getItem(112, "鼠标", 135.99);
        System.out.println(item3);
    }

}
