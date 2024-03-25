package com.pac.paint.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pac.paint.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
