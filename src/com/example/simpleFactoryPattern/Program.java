package com.example.simpleFactoryPattern;

import java.util.Scanner;

/**
 * 计算器
 *
 * @author pengdh
 * @date: 2017-02-28 23:34
 */
public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入数字A：");
        String strNumberA = s.next();
        System.out.println("请选择运算符号(+、-、*、/):");
        String strOperate = s.next();
        System.out.println("请输入数字B：");
        String strNumberB = s.next();
        String result = null;
        switch (strOperate)
        {
            case "+":
                result = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                break;
            case "/":
                result = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                break;
        }
        System.out.println("-----------pengdh-----------result值=" + result + "," + "当前类=Program.main()");
    }
}



