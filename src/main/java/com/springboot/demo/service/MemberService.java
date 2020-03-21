package com.springboot.demo.service;

import com.springboot.demo.dao.MemberMapper;
import com.springboot.demo.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {
    /***
     * 注入DAO层的实例对象
     */
    @Autowired
    private MemberMapper memberMapper;

    /**
     * 方法名：getMemberById()
     * 入参：Integer id
     * 返回值：Member的实例对象
     * 方法体：Dao层相关实例调用getMemberById
     */
    public Member getMemberById(Integer id){
        return memberMapper.getMemberById(id);
    }
}
