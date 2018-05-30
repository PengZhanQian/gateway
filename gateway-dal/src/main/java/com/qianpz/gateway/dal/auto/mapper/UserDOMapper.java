package com.qianpz.gateway.dal.auto.mapper;

import com.qianpz.gateway.dal.auto.dataobject.UserDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 * The Table TEST_USER.
 * TEST_USER
 */
public interface UserDOMapper{

    /**
     * desc:插入表:TEST_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TEST_USER( USERNAME ,PASSWORD ,MOBILE_NO ,DELETE_FLAG ,CREATE_TIME ,CREATED_BY ,MODIFY_TIME ,MODIFIED_BY )VALUES( #{username,jdbcType=VARCHAR} ,#{password,jdbcType=VARCHAR} ,#{mobileNo,jdbcType=VARCHAR} ,#{deleteFlag,jdbcType=BIT} ,#{createTime,jdbcType=TIMESTAMP} ,#{createdBy,jdbcType=BIGINT} ,#{modifyTime,jdbcType=TIMESTAMP} ,#{modifiedBy,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(UserDO entity);
    /**
     * desc:更新表:TEST_USER.<br/>
     * descSql =  UPDATE TEST_USER SET USERNAME = #{username,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,MOBILE_NO = #{mobileNo,jdbcType=VARCHAR} ,DELETE_FLAG = #{deleteFlag,jdbcType=BIT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CREATED_BY = #{createdBy,jdbcType=BIGINT} ,MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP} ,MODIFIED_BY = #{modifiedBy,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(UserDO entity);
    /**
     * desc:根据主键删除数据:TEST_USER.<br/>
     * descSql =  DELETE FROM TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TEST_USER.<br/>
     * descSql =  SELECT * FROM TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return UserDO
     */
    UserDO getByPrimary(Long id);
    /**
     * desc:根据主键ID动态更新表:TEST_USER.<br/>
     * descSql =  UPDATE TEST_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateBySelective(UserDO entity);
    /**
     * desc:根据传入条件获取数据:TEST_USER.<br/>
     * descSql =  SELECT * FROM TEST_USER AND ID = #{id,jdbcType=BIGINT} AND USERNAME = #{username,jdbcType=VARCHAR} AND PASSWORD = #{password,jdbcType=VARCHAR} AND MOBILE_NO = #{mobileNo,jdbcType=VARCHAR} AND DELETE_FLAG = #{deleteFlag,jdbcType=BIT} AND CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} AND CREATED_BY = #{createdBy,jdbcType=BIGINT} AND MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP} AND MODIFIED_BY = #{modifiedBy,jdbcType=BIGINT} 
     * @param entity entity
     * @return List<UserDO>
     */
    List<UserDO> getBySelective(UserDO entity);
    /**
     * desc:动态插入表:TEST_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TEST_USER( USERNAME, PASSWORD, MOBILE_NO, DELETE_FLAG, CREATE_TIME, CREATED_BY, MODIFY_TIME, MODIFIED_BY, )VALUES( #{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, #{mobileNo,jdbcType=VARCHAR}, #{deleteFlag,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, #{createdBy,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, #{modifiedBy,jdbcType=BIGINT}, )
     * @param entity entity
     * @return Long
     */
    Long insertBySelective(UserDO entity);
}
