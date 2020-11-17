package com.example.modules.order.dao;

import com.example.modules.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-11-16 15:07:02
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
