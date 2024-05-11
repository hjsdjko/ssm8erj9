package com.entity.view;

import com.entity.YouxizhanghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏账号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
@TableName("youxizhanghao")
public class YouxizhanghaoView  extends YouxizhanghaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxizhanghaoView(){
	}
 
 	public YouxizhanghaoView(YouxizhanghaoEntity youxizhanghaoEntity){
 	try {
			BeanUtils.copyProperties(this, youxizhanghaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
