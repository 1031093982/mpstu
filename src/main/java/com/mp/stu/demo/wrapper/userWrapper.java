package com.mp.stu.demo.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mp.stu.demo.dao.student;
import com.mp.stu.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userWrapper {
    @Autowired
    UserMapper userMapper;
    public  void querywrapper(int sno){
        QueryWrapper<student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex","男").eq("age",19);
        student stu = userMapper.selectOne(queryWrapper);
        System.out.println(stu.toString());
    }
}
