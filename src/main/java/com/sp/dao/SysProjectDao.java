package com.sp.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sp.entity.SysProject;
/**
 * ****************************************************************
 *    http://blog.csdn.net/fenfenguai  
 *    Package: com.sp.dao
 *    Filename: SysProjectDao.java
 *    Description: 项目信息dao
 *    @author: Gaoxueyong
 *    @version: 1.0.0
 *    Create at: 2017年2月7日 上午10:51:52
 *    Revision:
 *    2017年2月7日 上午10:51:52- first revision
 *
 ****************************************************************
 */
@Repository
public interface SysProjectDao {
	
	/**
	 * 
	 * @Description 新增项目信息
	 * @param record
	 * @return
	 * @author: Gaoxueyong
	 * Create at: 2017年2月7日 上午10:55:04
	 */
    int insertSysProject(SysProject sysProject);

    /**
     * 
     * @Description 删除项目信息
     * @param id
     * @return
     * @author: Gaoxueyong
     * Create at: 2017年2月7日 下午4:19:55
     */
    int deleteSysProjectByPrimaryKey(String id);
    
    /**
     * 
     * @Description 修改项目信息
     * @param record
     * @return
     * @author: Gaoxueyong
     * Create at: 2017年2月7日 下午4:21:07
     */
    int updateSysProjectByPrimaryKey(SysProject sysProject);
    
    /**
     * 
     * @Description 根据主键id获取对象信息
     * @param id
     * @return
     * @author: Gaoxueyong
     * Create at: 2017年2月7日 下午4:20:13
     */
    SysProject selectSysProjectByPrimaryKey(String id);
    
    /**
     * 
     * @Description 根据条件获取项目信息
     * @param paramerMap
     * @return
     * @author: Gaoxueyong
     * Create at: 2017年2月7日 下午4:44:31
     */
    List<SysProject> querySysProjectList(Map<String, Object> paramerMap);

}