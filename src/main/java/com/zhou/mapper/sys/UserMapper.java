package com.zhou.mapper.sys;

import com.zhou.entity.sys.SysUser;
import com.zhou.mapper.SqlMapper.CommonMapper;
import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 2017/12/25 0025.
 */
@Repository
public interface UserMapper<T extends SysUser> extends CommonMapper<T> {
}
