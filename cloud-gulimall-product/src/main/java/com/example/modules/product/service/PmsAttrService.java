package com.example.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-16 09:45:58
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

