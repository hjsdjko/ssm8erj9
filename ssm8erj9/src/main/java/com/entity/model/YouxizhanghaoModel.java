package com.entity.model;

import com.entity.YouxizhanghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 游戏账号
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public class YouxizhanghaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏类别
	 */
	
	private String youxileibie;
		
	/**
	 * 游戏区服
	 */
	
	private String youxiqufu;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 账号名称
	 */
	
	private String zhanghaomingcheng;
		
	/**
	 * 账号介绍
	 */
	
	private String zhanghaojieshao;
		
	/**
	 * 出售价格
	 */
	
	private Integer chushoujiage;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 卖家账号
	 */
	
	private String maijiazhanghao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 卖家邮箱
	 */
	
	private String maijiayouxiang;
				
	
	/**
	 * 设置：游戏类别
	 */
	 
	public void setYouxileibie(String youxileibie) {
		this.youxileibie = youxileibie;
	}
	
	/**
	 * 获取：游戏类别
	 */
	public String getYouxileibie() {
		return youxileibie;
	}
				
	
	/**
	 * 设置：游戏区服
	 */
	 
	public void setYouxiqufu(String youxiqufu) {
		this.youxiqufu = youxiqufu;
	}
	
	/**
	 * 获取：游戏区服
	 */
	public String getYouxiqufu() {
		return youxiqufu;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：账号名称
	 */
	 
	public void setZhanghaomingcheng(String zhanghaomingcheng) {
		this.zhanghaomingcheng = zhanghaomingcheng;
	}
	
	/**
	 * 获取：账号名称
	 */
	public String getZhanghaomingcheng() {
		return zhanghaomingcheng;
	}
				
	
	/**
	 * 设置：账号介绍
	 */
	 
	public void setZhanghaojieshao(String zhanghaojieshao) {
		this.zhanghaojieshao = zhanghaojieshao;
	}
	
	/**
	 * 获取：账号介绍
	 */
	public String getZhanghaojieshao() {
		return zhanghaojieshao;
	}
				
	
	/**
	 * 设置：出售价格
	 */
	 
	public void setChushoujiage(Integer chushoujiage) {
		this.chushoujiage = chushoujiage;
	}
	
	/**
	 * 获取：出售价格
	 */
	public Integer getChushoujiage() {
		return chushoujiage;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：卖家账号
	 */
	 
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	
	/**
	 * 获取：卖家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：卖家邮箱
	 */
	 
	public void setMaijiayouxiang(String maijiayouxiang) {
		this.maijiayouxiang = maijiayouxiang;
	}
	
	/**
	 * 获取：卖家邮箱
	 */
	public String getMaijiayouxiang() {
		return maijiayouxiang;
	}
			
}
