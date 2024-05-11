package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxileibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxileibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxileibieView;


/**
 * 游戏类别
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface YouxileibieService extends IService<YouxileibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxileibieVO> selectListVO(Wrapper<YouxileibieEntity> wrapper);
   	
   	YouxileibieVO selectVO(@Param("ew") Wrapper<YouxileibieEntity> wrapper);
   	
   	List<YouxileibieView> selectListView(Wrapper<YouxileibieEntity> wrapper);
   	
   	YouxileibieView selectView(@Param("ew") Wrapper<YouxileibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxileibieEntity> wrapper);
   	

}

