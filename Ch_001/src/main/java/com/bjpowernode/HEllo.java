package com.bjpowernode;

/**
 * @Program: Maven_Test
 * @PACKAGE_NAME: com.bjpowernode
 * @ClassName HEllo
 * @Description 测试
 * @Author: 散人
 * @Create: 2023-01-12 20:54
 **/
public class HEllo {
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        HEllo hEllo = new HEllo();
        System.out.println(hEllo.add(3, 2));
        System.out.println("push test");
    }
}
