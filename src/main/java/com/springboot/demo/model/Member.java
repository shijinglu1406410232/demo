package com.springboot.demo.model;

/***
 *根据数据库模型建一个实体类；
 */
public class Member {
    private Integer memberId;
    private String memberName;
    private String memberSex;
    private String memberTelephone;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public String getMemberTelephone() {
        return memberTelephone;
    }

    public void setMemberTelephone(String memberTelephone) {
        this.memberTelephone = memberTelephone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberSex='" + memberSex + '\'' +
                ", memberTelephone='" + memberTelephone + '\'' +
                '}';
    }
}
