package com.zhang;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)throws InterruptedException{
        System.out.println("创建Set集合对象");  //输出提示信息
        Set set = new HashSet();//创建Set集合对象
        System.out.println("Set集合的isEmpty方法返回值是:"+set.isEmpty());  //判断集合是否为空
        System.out.println("Set集合的isEmpty方法返回值是:"+set.size());  //判断集合是否为空
        System.out.println("添加内容到Set集合");
        set.add("apple");//向集合中添加对象
        set.add("配置优良的计算机");
        set.add("book");
        System.out.println("Set集合的isEmpty方法返回值是:"+set.isEmpty());  //判断集合是否为空
        System.out.println("Set集合的isEmpty方法返回值是:"+set.size());  //判断集合是否为空
    }
}
