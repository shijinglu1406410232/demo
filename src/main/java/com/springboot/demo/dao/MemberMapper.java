package com.springboot.demo.dao;

import com.springboot.demo.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/***
 *写一个映射文件
 */
@Mapper
public interface MemberMapper {
    //通过人员id过滤查询所有人员信息
    @Select("select * from m_members where memberId=#{id}")
    Member getMemberById(Integer id);
}
