package com.entity.view;

import com.entity.YouxileibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
@TableName("youxileibie")
public class YouxileibieView  extends YouxileibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxileibieView(){
	}
 
 	public YouxileibieView(YouxileibieEntity youxileibieEntity){
 	try {
			BeanUtils.copyProperties(this, youxileibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
