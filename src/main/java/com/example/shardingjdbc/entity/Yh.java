package com.example.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_yh")
public class Yh {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
}
