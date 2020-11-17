package com.example.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-16 15:05:53
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

