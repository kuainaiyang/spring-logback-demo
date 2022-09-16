package com.lingdong.logback.service;

import com.lingdong.logback.dao.entity.LogbackUser;

public interface LogService {

    LogbackUser getById(int i);
}
