package com.zhou.util;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/23.
 */

public class PathUtil {

    public static   String getClassRootPath() {
        String path = PathUtil.class.getResource("/").getPath();
        return path;
    }

}
