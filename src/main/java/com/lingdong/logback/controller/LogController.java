package com.lingdong.logback.controller;

import com.lingdong.logback.dao.entity.LogbackUser;
import com.lingdong.logback.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/test")
    public String test() {
        log.trace("controller trace");
        log.debug("controller debug");
        log.info("controller info");
        log.warn("controller warn");
        log.error("controller error");
        LogbackUser logbackUser = logService.getById(1);
        return logbackUser.getUsername();
    }

}
