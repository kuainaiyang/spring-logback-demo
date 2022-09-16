package com.lingdong.logback.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class LogbackUser {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
}
