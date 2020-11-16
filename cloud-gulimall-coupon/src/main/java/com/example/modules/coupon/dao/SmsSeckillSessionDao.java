package com.example.modules.coupon.dao;

import com.example.modules.coupon.entity.SmsSeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-16 15:04:22
 */
@Mapper
public interface SmsSeckillSessionDao extends BaseMapper<SmsSeckillSessionEntity> {
	
}
