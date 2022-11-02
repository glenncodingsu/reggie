package com.it.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.reggie.entity.DishFlavor;
import com.it.reggie.mapper.DishFlavorMapper;
import com.it.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/27 16:58
 **/

@Service
public class DishFlavorServicempl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
