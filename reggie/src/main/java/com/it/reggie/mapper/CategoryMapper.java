package com.it.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/23 17:33
 **/

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
