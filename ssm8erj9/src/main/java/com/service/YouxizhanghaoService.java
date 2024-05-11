package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxizhanghaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxizhanghaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxizhanghaoView;


/**
 * 游戏账号
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface YouxizhanghaoService extends IService<YouxizhanghaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxizhanghaoVO> selectListVO(Wrapper<YouxizhanghaoEntity> wrapper);
   	
   	YouxizhanghaoVO selectVO(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
   	
   	List<YouxizhanghaoView> selectListView(Wrapper<YouxizhanghaoEntity> wrapper);
   	
   	YouxizhanghaoView selectView(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxizhanghaoEntity> wrapper);
   	

}

