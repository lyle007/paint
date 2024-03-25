package com.pac.paint.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class Inventory {

    @TableId(type = IdType.AUTO)
    private int colorid;

    private String name;

    private int left;


    public int getColorid() {
        return colorid;
    }

    public void setColorid(int colorid) {
        this.colorid = colorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}
