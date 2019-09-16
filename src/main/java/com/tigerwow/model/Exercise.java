package com.tigerwow.model;

/**
 * @author Created by wanhu 2019-08-30 10:51
 */
public class Exercise {
    public static void main(String[] args) {

        char[] english = {'a', ' ', 'd', ' ', ' ', 'u', 't', 'e'};

        int sum = 0;

        int startIndex = 0;
        int lastIndex = english.length;

        for (int i = 0; i < lastIndex; i++) {

            int minIndex = (startIndex + lastIndex) / 2;

            if (i < minIndex) {
                switch (english[i]) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        sum++;
                        break;
                    default:
                        break;
                }
            }

            if (i > minIndex) {
                switch (english[i]) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        sum++;
                        break;
                    default:
                        break;
                }
            }

        }
        System.out.println(sum);
//        System.out.println('a' < 'u');
    }
}
