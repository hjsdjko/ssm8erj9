package com.dao;

import com.entity.ZhanghaotuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanghaotuihuoVO;
import com.entity.view.ZhanghaotuihuoView;


/**
 * 账号退货
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface ZhanghaotuihuoDao extends BaseMapper<ZhanghaotuihuoEntity> {
	
	List<ZhanghaotuihuoVO> selectListVO(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
	
	ZhanghaotuihuoVO selectVO(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
	
	List<ZhanghaotuihuoView> selectListView(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);

	List<ZhanghaotuihuoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
	
	ZhanghaotuihuoView selectView(@Param("ew") Wrapper<ZhanghaotuihuoEntity> wrapper);
	

}
