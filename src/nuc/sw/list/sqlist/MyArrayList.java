package nuc.sw.list.sqlist;

import java.util.Scanner;

/**
 * @author wzk
 * @version 1.0
 * @description 课程融合之线性表（顺序线性表）
 * 定义一个类MyArrayList，用数组模拟实现数据结构中线性表的基本功能，该类中最少包含的属性有：data（String[]）、size（int）、CAPACITY（int）;
 * 该类中方法最少包括线性表的初始化、插入 、查找、遍历线性表、删除、返回线性表长度、线性表判空、清空线性表、替换、获取元素、判断线性表中是否包含某个元素、反向查找、末尾插入元素；
 * 定义一个主类，在主方法中创建线性表类对象并调用上述方法、完成功能演示。
 */
public class MyArrayList {
    private String[] data;
    private final int CAPACITY = 100;        //初始空间分配的大小
    private int size = 0;      //实际大小
    Scanner sc = new Scanner(System.in);

    // 1.初始化
    public MyArrayList() {
        data = new String[CAPACITY];
    }

    // 2.初始化
    public MyArrayList(String[] data) {
        this.data = data;
    }

    //3.添加元素（末尾）
    public void add(String s) {
        // 判断线性表size--扩容
        if (size == CAPACITY - 1) {
            String[] newData = new String[data.length + 10];
            data = newData;
        }
        add(size, s);
    }

    // 4. 添加元素
    public void add(int index, String s) {
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = s;
        size++;
    }

    // 5.遍历
    public void printAll() {
        // [中国,美国,日本]
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // 6.查询元素
    public void indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                int index = i + 1;
                System.out.println("查询成功，该元素在线性表的第" + index + "个索引位置(从1开始)");
                return;
            }
        }
        System.out.println("未查询到该元素");
    }

    public String remove(int index) {
        index--;
        String[] newData = new String[data.length - 1];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newData[i] = data[i];
            } else {
                newData[i] = data[i + 1];
            }
        }
        data = newData;
        size--;
        return data[index-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (data != null) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        data = null;
    }

    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    public void lastIndexOf(String element) {
        for (int i = size - 1; i >= 0; i--) {
            if (element.equals(data[i])) {
                int index = i + 1;
                int lastIndex = size - index + 1;
                System.out.println("查询成功，该元素在线性表的倒数第" + lastIndex + "个位置");
                return;
            }
        }
        System.out.println("未查询到该元素");
    }

    public void set(int index, String element) {
        data[index] = element;
        System.out.println("修改成功");
    }
    public String get(int index) {
        return data[index];
    }
}
