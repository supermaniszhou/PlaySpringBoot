package com.example.demo.zhou;

import com.example.demo.util.DbUtil;
import com.example.demo.util.TableInfo;

import java.sql.*;

public class MyGeneratorMain {
    public static void main(String[] args) {
        Connection connection = DbUtil.getConn();
        String inTableName = "sys_menu";
        TableInfo.getTables(connection, inTableName);
    }
}
