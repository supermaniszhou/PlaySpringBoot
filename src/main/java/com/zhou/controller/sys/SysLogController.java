package com.zhou.controller.sys;

import com.github.pagehelper.PageHelper;
import com.zhou.base.BaseController;
import com.zhou.entity.sys.SysLog;
import com.zhou.service.sys.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/25 0025.
 */
@RestController
@RequestMapping("/sysLog")
public class SysLogController extends BaseController {
    @Autowired
    private SysLogService sysLogService;


    @RequestMapping(value = "/toSysLogList")
    public ModelAndView toSysLogList(Model model) {
        return new ModelAndView(VIEW_PATH + "sysLog/SysLog_list");
    }

    @RequestMapping("/getSysLogData")
    @ResponseBody
    public Map<String, Object> getSysLogData(@RequestParam(value = "pageSize", required = false) int pageSize,
                                           @RequestParam(value = "pageIndex", required = false) int pageIndex) {

        Map<String, Object> map = new HashedMap();
        SysLog sysLog = new SysLog();
        int count = sysLogService.queryCount(sysLog);
        List<SysLog> list = sysLogService.queryList(sysLog, pageIndex, pageSize);

        map.put("total", count);
        map.put("rows", list);
        return map;
    }


    @RequestMapping(value = "/toAddSyslogPage")
    public ModelAndView toAddSyslogPage(){
        return new ModelAndView(VIEW_PATH + "sysLog/SysLog_add");
    }

    @RequestMapping(value = "/doAdd")
    @ResponseBody
    public Map<String, Object> doAdd(SysLog sysLog) {
        try {
            sysLogService.addObj(sysLog);
        } catch (Exception e) {
            e.printStackTrace();
            return error();
        }
        return success();
    }

    @RequestMapping(value = "toEdit")
    @ResponseBody
    public Map<String, Object> toEdit(@RequestParam(value = "id") String id, @RequestParam("flag") String flag) {
        SysLog sysLog = null;
        try {
            SysLog obj = new SysLog();
            obj.setId(Integer.parseInt(id));
            sysLog = (SysLog) sysLogService.queryObj(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseTo(SUCCESS_FLAG, SUCCESS_MSG, sysLog, flag);
    }

    @RequestMapping(value = "doEdit")
    @ResponseBody
    public Map<String, Object> doEdit(SysLog sysLog) {
        try {
            sysLogService.updateObj(sysLog);
        } catch (Exception e) {
            e.printStackTrace();
            return error();
        }
        return success();
    }

    @RequestMapping(value = "doDel")
    @ResponseBody
    public Map<String, Object> doDel(@RequestParam(value = "id", required = true) Integer id) {
        try {
            SysLog sysLog = new SysLog();
            sysLog.setId(id);
            sysLogService.deleteObj(sysLog);
        } catch (Exception e) {
            e.printStackTrace();
            return error();
        }
        return success();
    }
}
