/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.controller;


import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysRole;
import com.zeal.admin.modules.authority.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zeal.zealsay.common.exception.ZealException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sys_roleRest服务接口
 *
 * @author zeal
 * @date 2018-04-23 16:41:14
 */
@RestController
@RequestMapping(value="sysRole")
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    /**
     * 通过ID查找对象
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id,HttpServletRequest request,
                                            HttpServletResponse response){
        try{
            return new Result(sysRoleService.findById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class查找对象
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/findByClass",method = RequestMethod.POST)
    public Result findByClass(@RequestBody SysRole sysRole,
                                            HttpServletRequest request,HttpServletResponse response){
        try{
            return new Result(sysRoleService.findByClass(sysRole));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }




    /**
     * 新增记录
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public Result insert(@RequestBody SysRole sysRole,HttpServletRequest request,
                       HttpServletResponse response){
        try{
              return  new Result(sysRoleService.insert(sysRole));
        }
        catch(Exception er) {
              throw new ZealException("系统异常");
        }
    }

    /**
     * 更新数据
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public Result update(@RequestBody SysRole sysRole,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysRoleService.update(sysRole));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class删除信息
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public Result delete(@RequestBody SysRole sysRole,HttpServletRequest request,
                       HttpServletResponse response){
        try{
             return new Result(sysRoleService.delete(sysRole));
        }
        catch(Exception er) {
             throw new ZealException("系统异常");
        }
    }

    /**
     * 通过ID删除信息
     * @author zeal
     * @date 2018-04-23 16:41:14
     */
    @RequestMapping(value="/deleteById/{id}",method = RequestMethod.POST)
    public Result deleteById(@PathVariable String id,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysRoleService.deleteById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }
}