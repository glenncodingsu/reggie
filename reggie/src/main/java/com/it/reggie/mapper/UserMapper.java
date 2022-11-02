package com.it.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/31 23:54
 **/

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
