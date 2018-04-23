/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.authority.controller;


import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysMenu;
import com.zeal.admin.modules.authority.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zeal.zealsay.common.exception.ZealException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sys_menuRest服务接口
 *
 * @author zeal
 * @date 2018-04-23 16:41:35
 */
@RestController
@RequestMapping(value="sysMenu")
public class SysMenuController {

    @Autowired
    SysMenuService sysMenuService;

    /**
     * 通过ID查找对象
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id,HttpServletRequest request,
                                            HttpServletResponse response){
        try{
            return new Result(sysMenuService.findById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class查找对象
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/findByClass",method = RequestMethod.POST)
    public Result findByClass(@RequestBody SysMenu sysMenu,
                                            HttpServletRequest request,HttpServletResponse response){
        try{
            return new Result(sysMenuService.findByClass(sysMenu));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }




    /**
     * 新增记录
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public Result insert(@RequestBody SysMenu sysMenu,HttpServletRequest request,
                       HttpServletResponse response){
        try{
              return  new Result(sysMenuService.insert(sysMenu));
        }
        catch(Exception er) {
              throw new ZealException("系统异常");
        }
    }

    /**
     * 更新数据
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public Result update(@RequestBody SysMenu sysMenu,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysMenuService.update(sysMenu));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class删除信息
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public Result delete(@RequestBody SysMenu sysMenu,HttpServletRequest request,
                       HttpServletResponse response){
        try{
             return new Result(sysMenuService.delete(sysMenu));
        }
        catch(Exception er) {
             throw new ZealException("系统异常");
        }
    }

    /**
     * 通过ID删除信息
     * @author zeal
     * @date 2018-04-23 16:41:35
     */
    @RequestMapping(value="/deleteById/{id}",method = RequestMethod.POST)
    public Result deleteById(@PathVariable String id,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysMenuService.deleteById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }
}