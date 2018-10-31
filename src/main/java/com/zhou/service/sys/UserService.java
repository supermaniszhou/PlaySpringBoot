package com.zhou.service.sys;

import com.zhou.entity.sys.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService <T extends SysUser> extends CommonService<T> {

    SysUser query(SysUser sysUser);
}
