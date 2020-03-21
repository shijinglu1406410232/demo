package com.springboot.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.demo.model.Member;
import com.springboot.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    /***
     *注入service层的相关实例
     */
    @Autowired
    MemberService memberService;

    /**
     * 页面跳转
     */
    @RequestMapping("member")
    public String goMemberSearch(){
        return "memberSearch";
    }

    /***
     * 返回json数据给ajax
     */
    @ResponseBody
    @RequestMapping("/searchById")
    public String getMemberById(@RequestParam("memberId") Integer memberId){
        System.out.println(memberId);
        Member member=memberService.getMemberById(memberId);
        System.out.println("member实例对象的值:"+member);
        JSONObject result=new JSONObject();
        if (member!=null){
            System.out.println(member.getMemberName());
            result.put("status","success");
            result.put("member",member);
        }else{
            result.put("status","fail");
        }
        return result.toJSONString();
    }
}
