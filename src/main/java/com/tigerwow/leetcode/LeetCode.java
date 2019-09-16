package com.tigerwow.leetcode;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * leetCode
 *
 * @author Created by wanhu 2019-09-04 16:13
 */
public class LeetCode {

    public static void main(String[] args) {
        List<Test> testList = Lists.newArrayList();
        for (Test test: testList) {
            System.out.println(test);
        }
    }

    public interface Test {

        String TEST_ONE = "";

        String TEST_TWO = "";
    }
}
