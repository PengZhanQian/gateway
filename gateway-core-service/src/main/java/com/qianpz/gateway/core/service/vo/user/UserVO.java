package com.qianpz.gateway.core.service.vo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qianpengzhan
 * @DESC ${DESCRIPTION}
 * @create 2018-05-31 10:40
 * @email qianpz@jcgroup.com.cn
 **/
public class UserVO implements Serializable {

    /**
     * id ID.
     */
    private Long id;
    /**
     * username 用户名.
     */
    private String username;
    /**
     * password 密码.
     */
    private String password;
    /**
     * mobileNo 手机号码.
     */
    private String mobileNo;
    /**
     * deleteFlag 逻辑删除标识 1删除 0 未删除 默认0 .
     */
    private Boolean deleteFlag;
    /**
     * createTime 创建时间.
     */
    private Date createTime;
    /**
     * createdBy 创建人ID.
     */
    private Long createdBy;
    /**
     * modifyTime 修改时间.
     */
    private Date modifyTime;
    /**
     * modifiedBy 修改人ID.
     */
    private Long modifiedBy;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set username 用户名.
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Get username 用户名.
     *
     * @return the string
     */
    public String getUsername(){
        return username;
    }

    /**
     * Set password 密码.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Get password 密码.
     *
     * @return the string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set mobileNo 手机号码.
     */
    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }

    /**
     * Get mobileNo 手机号码.
     *
     * @return the string
     */
    public String getMobileNo(){
        return mobileNo;
    }

    /**
     * Set deleteFlag 逻辑删除标识 1删除 0 未删除 默认0 .
     */
    public void setDeleteFlag(Boolean deleteFlag){
        this.deleteFlag = deleteFlag;
    }

    /**
     * Get deleteFlag 逻辑删除标识 1删除 0 未删除 默认0 .
     *
     * @return the string
     */
    public Boolean getDeleteFlag(){
        return deleteFlag;
    }

    /**
     * Set createTime 创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set createdBy 创建人ID.
     */
    public void setCreatedBy(Long createdBy){
        this.createdBy = createdBy;
    }

    /**
     * Get createdBy 创建人ID.
     *
     * @return the string
     */
    public Long getCreatedBy(){
        return createdBy;
    }

    /**
     * Set modifyTime 修改时间.
     */
    public void setModifyTime(Date modifyTime){
        this.modifyTime = modifyTime;
    }

    /**
     * Get modifyTime 修改时间.
     *
     * @return the string
     */
    public Date getModifyTime(){
        return modifyTime;
    }

    /**
     * Set modifiedBy 修改人ID.
     */
    public void setModifiedBy(Long modifiedBy){
        this.modifiedBy = modifiedBy;
    }

    /**
     * Get modifiedBy 修改人ID.
     *
     * @return the string
     */
    public Long getModifiedBy(){
        return modifiedBy;
    }
}
