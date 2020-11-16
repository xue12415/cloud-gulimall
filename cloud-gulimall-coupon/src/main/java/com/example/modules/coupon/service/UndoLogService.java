package com.example.modules.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-16 15:04:21
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

