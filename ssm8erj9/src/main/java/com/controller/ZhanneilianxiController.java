package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhanneilianxiEntity;
import com.entity.view.ZhanneilianxiView;

import com.service.ZhanneilianxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 站内联系
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
@RestController
@RequestMapping("/zhanneilianxi")
public class ZhanneilianxiController {
    @Autowired
    private ZhanneilianxiService zhanneilianxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhanneilianxiEntity zhanneilianxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			zhanneilianxi.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			zhanneilianxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhanneilianxiEntity> ew = new EntityWrapper<ZhanneilianxiEntity>();
		PageUtils page = zhanneilianxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhanneilianxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhanneilianxiEntity zhanneilianxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			zhanneilianxi.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			zhanneilianxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhanneilianxiEntity> ew = new EntityWrapper<ZhanneilianxiEntity>();
		PageUtils page = zhanneilianxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhanneilianxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhanneilianxiEntity zhanneilianxi){
       	EntityWrapper<ZhanneilianxiEntity> ew = new EntityWrapper<ZhanneilianxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhanneilianxi, "zhanneilianxi")); 
        return R.ok().put("data", zhanneilianxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhanneilianxiEntity zhanneilianxi){
        EntityWrapper< ZhanneilianxiEntity> ew = new EntityWrapper< ZhanneilianxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhanneilianxi, "zhanneilianxi")); 
		ZhanneilianxiView zhanneilianxiView =  zhanneilianxiService.selectView(ew);
		return R.ok("查询站内联系成功").put("data", zhanneilianxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhanneilianxiEntity zhanneilianxi = zhanneilianxiService.selectById(id);
        return R.ok().put("data", zhanneilianxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhanneilianxiEntity zhanneilianxi = zhanneilianxiService.selectById(id);
        return R.ok().put("data", zhanneilianxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhanneilianxiEntity zhanneilianxi, HttpServletRequest request){
    	zhanneilianxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhanneilianxi);

        zhanneilianxiService.insert(zhanneilianxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhanneilianxiEntity zhanneilianxi, HttpServletRequest request){
    	zhanneilianxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhanneilianxi);
    	zhanneilianxi.setUserid((Long)request.getSession().getAttribute("userId"));

        zhanneilianxiService.insert(zhanneilianxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhanneilianxiEntity zhanneilianxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhanneilianxi);
        zhanneilianxiService.updateById(zhanneilianxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhanneilianxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhanneilianxiEntity> wrapper = new EntityWrapper<ZhanneilianxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			wrapper.eq("maijiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhanneilianxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
