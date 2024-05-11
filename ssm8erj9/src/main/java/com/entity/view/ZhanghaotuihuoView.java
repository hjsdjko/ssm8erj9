package com.entity.view;

import com.entity.ZhanghaotuihuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 账号退货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
@TableName("zhanghaotuihuo")
public class ZhanghaotuihuoView  extends ZhanghaotuihuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanghaotuihuoView(){
	}
 
 	public ZhanghaotuihuoView(ZhanghaotuihuoEntity zhanghaotuihuoEntity){
 	try {
			BeanUtils.copyProperties(this, zhanghaotuihuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
