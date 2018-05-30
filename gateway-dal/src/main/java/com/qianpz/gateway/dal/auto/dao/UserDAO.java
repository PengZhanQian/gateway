package com.qianpz.gateway.dal.auto.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.qianpz.gateway.dal.auto.dataobject.UserDO;
import java.util.List;
import com.qianpz.gateway.dal.auto.mapper.UserDOMapper;

/**
* The Table TEST_USER.
* 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
* TEST_USER
*/
@Repository
public class UserDAO{

    @Autowired
    private UserDOMapper userDOMapper;

    /**
     * desc:插入表:TEST_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TEST_USER( USERNAME ,PASSWORD ,MOBILE_NO ,DELETE_FLAG ,CREATE_TIME ,CREATED_BY ,MODIFY_TIME ,MODIFIED_BY )VALUES( #{username,jdbcType=VARCHAR} ,#{password,jdbcType=VARCHAR} ,#{mobileNo,jdbcType=VARCHAR} ,#{deleteFlag,jdbcType=BIT} ,#{createTime,jdbcType=TIMESTAMP} ,#{createdBy,jdbcType=BIGINT} ,#{modifyTime,jdbcType=TIMESTAMP} ,#{modifiedBy,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(UserDO entity){
        return userDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TEST_USER.<br/>
     * descSql =  UPDATE TEST_USER SET USERNAME = #{username,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,MOBILE_NO = #{mobileNo,jdbcType=VARCHAR} ,DELETE_FLAG = #{deleteFlag,jdbcType=BIT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CREATED_BY = #{createdBy,jdbcType=BIGINT} ,MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP} ,MODIFIED_BY = #{modifiedBy,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(UserDO entity){
        return userDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TEST_USER.<br/>
     * descSql =  DELETE FROM TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return userDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TEST_USER.<br/>
     * descSql =  SELECT * FROM TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return UserDO
     */
    public UserDO getByPrimary(Long id){
        return userDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键ID动态更新表:TEST_USER.<br/>
     * descSql =  UPDATE TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateBySelective(UserDO entity){
        return userDOMapper.updateBySelective(entity);
    }
    /**
     * desc:根据传入条件获取数据:TEST_USER.<br/>
     * descSql =  SELECT * FROM TEST_USER AND ID = #{id,jdbcType=BIGINT} AND USERNAME = #{username,jdbcType=VARCHAR} AND PASSWORD = #{password,jdbcType=VARCHAR} AND MOBILE_NO = #{mobileNo,jdbcType=VARCHAR} AND DELETE_FLAG = #{deleteFlag,jdbcType=BIT} AND CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} AND CREATED_BY = #{createdBy,jdbcType=BIGINT} AND MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP} AND MODIFIED_BY = #{modifiedBy,jdbcType=BIGINT} 
     * @param entity entity
     * @return List<UserDO>
     */
    public List<UserDO> getBySelective(UserDO entity){
        return userDOMapper.getBySelective(entity);
    }
    /**
     * desc:动态插入表:TEST_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TEST_USER( USERNAME, PASSWORD, MOBILE_NO, DELETE_FLAG, CREATE_TIME, CREATED_BY, MODIFY_TIME, MODIFIED_BY, )VALUES( #{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, #{mobileNo,jdbcType=VARCHAR}, #{deleteFlag,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, #{modifiedBy,jdbcType=BIGINT}, )
     * @param entity entity
     * @return Long
     */
    public Long insertBySelective(UserDO entity){
        return userDOMapper.insertBySelective(entity);
    }
}
