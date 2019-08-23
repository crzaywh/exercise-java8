package com.tigerwow.model;

import java.util.List;

/**
 * 专辑
 *
 * @author Created by wanhu 2019-08-22 14:30
 */
public class Album {

    /**
     * 专辑名称
     */
    private String name;

    /**
     * 专辑曲目列表
     */
    private List<String> trackList;

    /**
     * 参与本专辑创作的艺术家列表
     */
    private List<String> musicianList;
}
