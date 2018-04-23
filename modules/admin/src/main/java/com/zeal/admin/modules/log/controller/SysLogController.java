/** 
 * Copyright ® 2016-2018 zeal  zhangleifor@163.com.
 * All right reserved. 
 */
package com.zeal.admin.modules.log.controller;


import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysLog;
import com.zeal.admin.modules.log.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zeal.zealsay.common.exception.ZealException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sys_logRest服务接口
 *
 * @author zeal
 * @date 2018-04-23 13:56:11
 */
@RestController
@RequestMapping(value="sysLog")
public class SysLogController {

    @Autowired
    SysLogService sysLogService;

    /**
     * 通过ID查找对象
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id,HttpServletRequest request,
                                            HttpServletResponse response){
        try{
            return new Result(sysLogService.findById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class查找对象
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/findByClass",method = RequestMethod.POST)
    public Result findByClass(@RequestBody SysLog sysLog,
                                            HttpServletRequest request,HttpServletResponse response){
        try{
            return new Result(sysLogService.findByClass(sysLog));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }




    /**
     * 新增记录
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public Result insert(@RequestBody SysLog sysLog,HttpServletRequest request,
                       HttpServletResponse response){
        try{
              return  new Result(sysLogService.insert(sysLog));
        }
        catch(Exception er) {
              throw new ZealException("系统异常");
        }
    }

    /**
     * 更新数据
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public Result update(@RequestBody SysLog sysLog,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysLogService.update(sysLog));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }

    /**
     * 通过Class删除信息
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public Result delete(@RequestBody SysLog sysLog,HttpServletRequest request,
                       HttpServletResponse response){
        try{
             return new Result(sysLogService.delete(sysLog));
        }
        catch(Exception er) {
             throw new ZealException("系统异常");
        }
    }

    /**
     * 通过ID删除信息
     * @author zeal
     * @date 2018-04-23 13:56:11
     */
    @RequestMapping(value="/deleteById/{id}",method = RequestMethod.POST)
    public Result deleteById(@PathVariable String id,HttpServletRequest request,
                       HttpServletResponse response){
        try{
            return new Result(sysLogService.deleteById(id));
        }
        catch(Exception er) {
            throw new ZealException("系统异常");
        }
    }
}