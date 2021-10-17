package nuc.sw.list.sqlist;

import java.util.Scanner;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------课程融合之线性表--------");
            System.out.println("1 线性表的初始化");
            System.out.println("2 插入元素");
            System.out.println("3 查找元素");
            System.out.println("4 遍历线性表");
            System.out.println("5 删除元素");
            System.out.println("6 返回线性表长度");
            System.out.println("7 线性表判空");
            System.out.println("8 清空线性表");
            System.out.println("9 判断线性表中是否包含某个元素");
            System.out.println("10 末尾插入元素");
            System.out.println("11 反向查找");
            System.out.println("请输入您的选择");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("初始化成功！");
                    break;
                case "2":
                    System.out.println("请输入要插入的元素的位置(从1开始)：");
                    int index = sc.nextInt();
                    index--;
                    System.out.println("请输入要插入的元素的值");
                    String value = sc.next();
                    myList.add(index,value);
                    break;
                case "3":
                    System.out.println("请输入要查询的元素：");
                    String element = sc.next();
                    myList.indexOf(element);
                    break;
                case "4":
                    myList.printAll();
                    break;
                case "5":
                    System.out.println("请输入要删除的元素的位置(从1开始)：");
                    index = sc.nextInt();
                    String delete = myList.remove(index);
                    System.out.println(delete + "已经删除成功");
                    break;
                case "6":
                    System.out.println("线性表长度为：" + myList.size());
                    break;
                case "7":
                    boolean b = myList.isEmpty();
                    if (b){
                        System.out.println("线性表不为空");
                    } else {
                        System.out.println("线性表为空");
                    }
                    break;
                case "8":
                    myList.clear();
                    break;
                case "9":
                    System.out.println("请输入要判断的元素：");
                    element = sc.next();
                    boolean contain = myList.contains(element);
                    if (contain) {
                        System.out.println("线性表中包含元素" + contain);
                    } else {
                        System.out.println("线性表中不包含该元素");
                    }
                    break;
                case "10":
                    System.out.println("请输入要插入的元素的值");
                    value = sc.next();
                    myList.add(value);
                    break;
                case "11":
                    System.out.println("请输入要查询的元素：");
                    element = sc.next();
                    myList.lastIndexOf(element);
                    break;
                default:
                    System.out.println("您的输入有误");
            }
        }
    }
}
