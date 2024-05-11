package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanghaotuihuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanghaotuihuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanghaotuihuoView;


/**
 * 账号退货
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface ZhanghaotuihuoService extends IService<ZhanghaotuihuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanghaotuihuoVO> selectListVO(Wrapper<ZhanghaotuihuoEntity> wrapper);
   	
   	ZhanghaotuihuoVO selectVO(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
   	
   	List<ZhanghaotuihuoView> selectListView(Wrapper<ZhanghaotuihuoEntity> wrapper);
   	
   	ZhanghaotuihuoView selectView(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanghaotuihuoEntity> wrapper);
   	

}

