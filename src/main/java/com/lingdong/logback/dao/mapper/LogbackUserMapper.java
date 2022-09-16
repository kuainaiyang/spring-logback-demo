package com.lingdong.logback.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lingdong.logback.dao.entity.LogbackUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogbackUserMapper extends BaseMapper<LogbackUser> {

}
