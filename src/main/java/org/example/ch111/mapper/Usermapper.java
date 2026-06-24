package org.example.ch111.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.ch111.pojo.User;

@Mapper

public interface Usermapper extends BaseMapper<User> {

}
