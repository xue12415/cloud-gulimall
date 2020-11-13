package com.example.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-13 17:44:14
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

