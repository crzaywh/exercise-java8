package com.tigerwow.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 乐队成员
 *
 * @author Created by wanhu 2019-08-21 21:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BandMember {

    /**
     * 乐队成员
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 是否是主唱
     */
    private Boolean magorSinger;
}
