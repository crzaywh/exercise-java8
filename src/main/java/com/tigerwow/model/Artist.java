package com.tigerwow.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 乐队
 *
 * @author Created by wanhu 2019-08-21 21:28
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    /**
     * 乐队名称
     */
    private String name;

    /**
     * 乐队成员
     */
    private List<BandMember> bandMemberList;

    /**
     * 乐队来自哪里
     */
    private String origin;


}
