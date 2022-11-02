package com.it.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/24 10:49
 **/

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
