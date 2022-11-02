package com.it.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.reggie.entity.Category;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/23 17:35
 **/
public interface CategoryService extends IService<Category> {
   void remove(Long id);
}
