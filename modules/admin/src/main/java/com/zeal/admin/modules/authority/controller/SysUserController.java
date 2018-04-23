/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.controller;


import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysUser;
import com.zeal.admin.modules.authority.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zeal.zealsay.common.exception.ZealException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sys_userRest服务接口
 *
 * @author zeal
 * @date 2018-04-23 13:57:02
 */
@RestController
@RequestMapping(value="sysUser")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    /**
     * 通过ID查找对象
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id,HttpServletRequest request,
                                            HttpServletResponse response){
        try{
            return new Result(sysUserService.findById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class查找对象
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/findByClass",method = RequestMethod.POST)
    public Result findByClass(@RequestBody SysUser sysUser,
                                            HttpServletRequest request,HttpServletResponse response){
        try{
            return new Result(sysUserService.findByClass(sysUser));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }




    /**
     * 新增记录
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public Result insert(@RequestBody SysUser sysUser,HttpServletRequest request,
                       HttpServletResponse response){
        try{
              return  new Result(sysUserService.insert(sysUser));
        }
        catch(Exception er) {
              throw new ZealException("系统异常");
        }
    }

    /**
     * 更新数据
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public Result update(@RequestBody SysUser sysUser,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysUserService.update(sysUser));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class删除信息
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public Result delete(@RequestBody SysUser sysUser,HttpServletRequest request,
                       HttpServletResponse response){
        try{
             return new Result(sysUserService.delete(sysUser));
        }
        catch(Exception er) {
             throw new ZealException("系统异常");
        }
    }

    /**
     * 通过ID删除信息
     * @author zeal
     * @date 2018-04-23 13:57:02
     */
    @RequestMapping(value="/deleteById/{id}",method = RequestMethod.POST)
    public Result deleteById(@PathVariable String id,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysUserService.deleteById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }
    /**
     * 通过username查找对象
     * @author zeal
     * @date 2018-04-11 20:57:21
     */
    @RequestMapping(value="/findUserByUsername/{username}",method = RequestMethod.GET)
    public Result findUserByUsername(@PathVariable String username,HttpServletRequest request,
                                     HttpServletResponse response){
        try{
            return new Result(sysUserService.findUserByUsername(username));
        }
        catch(Exception er) {
            throw new RuntimeException(er.getMessage());
        }

    }
    /**
     * 通过phonenumber查找对象
     * @author zeal
     * @date 2018-04-11 20:57:21
     */
    @RequestMapping(value="/findUserByMobile/{mobile}",method = RequestMethod.GET)
    public Result findUserByPhoneNum(@PathVariable String mobile,HttpServletRequest request,
                                     HttpServletResponse response){
        try{
            return new Result(sysUserService.findUserByPhoneNum(mobile));
        }
        catch(Exception er) {
        }
        return null;
    }
    /**
     * 通过email查找对象
     * @author zeal
     * @date 2018-04-11 20:57:21
     */
    @RequestMapping(value="/findUserByEmali/{emali}",method = RequestMethod.GET)
    public Result findUserByEmail(@PathVariable String emali,HttpServletRequest request,
                                  HttpServletResponse response){
        try{
            return new Result(sysUserService.findUserByEmail(emali));
        }
        catch(Exception er) {
        }
        return null;
    }
}