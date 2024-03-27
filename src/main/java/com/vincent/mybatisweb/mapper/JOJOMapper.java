package com.vincent.mybatisweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vincent.mybatisweb.entity.jojo;
import org.apache.ibatis.annotations.Select;

public interface JOJOMapper extends BaseMapper<jojo> {

    @Select("select * from jojo where name like 'di%'; ")
    jojo select2();
}
