package com.lingdong.logback.service.impl;

import com.lingdong.logback.dao.entity.LogbackUser;
import com.lingdong.logback.dao.mapper.LogbackUserMapper;
import com.lingdong.logback.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogServiceImpl implements LogService {

    @Autowired
    LogbackUserMapper logbackUserMapper;

    @Override
    public LogbackUser getById(int id) {
        log.trace("service trace");
        log.debug("service debug");
        log.info("service info");
        log.warn("service warn");
        log.error("service error");
        return logbackUserMapper.selectById(id);
    }
}
