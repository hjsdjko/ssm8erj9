package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanneilianxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanneilianxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanneilianxiView;


/**
 * 站内联系
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface ZhanneilianxiService extends IService<ZhanneilianxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanneilianxiVO> selectListVO(Wrapper<ZhanneilianxiEntity> wrapper);
   	
   	ZhanneilianxiVO selectVO(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
   	
   	List<ZhanneilianxiView> selectListView(Wrapper<ZhanneilianxiEntity> wrapper);
   	
   	ZhanneilianxiView selectView(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanneilianxiEntity> wrapper);
   	

}

