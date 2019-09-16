package com.tigerwow;

import com.google.common.collect.Lists;
import com.tigerwow.model.BandMember;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Created by wanhu 2019-08-22 21:04
 */
public class LambdaSort {

    public static void main(String[] args) {
        // 元素顺序
        List<Integer> integers = Lists.newArrayList(1, 2, 4, 5, 6, 3);

        // 正序排序 result-> 1,2,3,4,5,6
//        integers.sort(Integer::compareTo);

        // 倒序排序 result-> 6,5,4,3,2,1
//        integers.sort(Comparator.reverseOrder());

        List<BandMember> bandMemberList = Lists.newArrayList();
        BandMember lin = BandMember.builder()
                .name("林俊杰")
                .age(20)
                .build();
        BandMember jay = BandMember.builder()
                .name("周杰伦")
                .age(30)
                .build();
        BandMember zhou = BandMember.builder()
                .name("www")
                .age(29)
                .build();
        bandMemberList.add(lin);
        bandMemberList.add(jay);
        bandMemberList.add(zhou);

        // 倒序直接排序
        bandMemberList.sort((b1, b2) -> b2.getAge().compareTo(b1.getAge()));



        System.out.println(bandMemberList);
        LinkedList<Object> objects = Lists.newLinkedList();
        objects.addAll(Collections.EMPTY_LIST);
        objects.addAll(bandMemberList);
        System.out.println(bandMemberList);
    }
}
