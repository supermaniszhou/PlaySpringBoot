package com.zhou.entity.sys;
import java.lang.*;
import java.math.*;
import java.io.*;

public class SysMenu implements Serializable{
    private Integer id;//
    private String menuName;//菜单名称
    private Integer menuLevel;//等级
    private Integer menuParent;//父级
    private String menuOrder;//排序
    private String menuChild;//子级
    private String memo;//描述
    private String menuUrl;//地址
    private String menuIcon;//图标
    private Integer yesNo;//是否启用
    public SysMenu(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }
    public Integer getMenuParent() {
        return menuParent;
    }

    public void setMenuParent(Integer menuParent) {
        this.menuParent = menuParent;
    }
    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }
    public String getMenuChild() {
        return menuChild;
    }

    public void setMenuChild(String menuChild) {
        this.menuChild = menuChild;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }
    public Integer getYesNo() {
        return yesNo;
    }

    public void setYesNo(Integer yesNo) {
        this.yesNo = yesNo;
    }

}

