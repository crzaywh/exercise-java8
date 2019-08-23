package com.tigerwow;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * lambda收集器
 *
 * @author Created by wanhu 2019-08-22 14:39
 */
public class LambdaCollectors {

    public static void main(String[] args) {
        // 元素顺序
        List<Integer> integers = Lists.newArrayList(1, 2, 4, 5, 6, 3);

        //
        List<Integer> collect = integers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
