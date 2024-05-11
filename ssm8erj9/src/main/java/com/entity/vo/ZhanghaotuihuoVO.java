package com.entity.vo;

import com.entity.ZhanghaotuihuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 账号退货
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public class ZhanghaotuihuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏名称
	 */
	
	private String youximingcheng;
		
	/**
	 * 游戏类别
	 */
	
	private String youxileibie;
		
	/**
	 * 账号名称
	 */
	
	private String zhanghaomingcheng;
		
	/**
	 * 出售价格
	 */
	
	private Integer chushoujiage;
		
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
	 * 退货说明
	 */
	
	private String tuihuoshuoming;
		
	/**
	 * 退货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuihuoshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：游戏名称
	 */
	 
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
				
	
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
				
	
	/**
	 * 设置：退货说明
	 */
	 
	public void setTuihuoshuoming(String tuihuoshuoming) {
		this.tuihuoshuoming = tuihuoshuoming;
	}
	
	/**
	 * 获取：退货说明
	 */
	public String getTuihuoshuoming() {
		return tuihuoshuoming;
	}
				
	
	/**
	 * 设置：退货时间
	 */
	 
	public void setTuihuoshijian(Date tuihuoshijian) {
		this.tuihuoshijian = tuihuoshijian;
	}
	
	/**
	 * 获取：退货时间
	 */
	public Date getTuihuoshijian() {
		return tuihuoshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
