package com.dao;

import com.entity.ZhanneilianxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanneilianxiVO;
import com.entity.view.ZhanneilianxiView;


/**
 * 站内联系
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface ZhanneilianxiDao extends BaseMapper<ZhanneilianxiEntity> {
	
	List<ZhanneilianxiVO> selectListVO(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
	
	ZhanneilianxiVO selectVO(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
	
	List<ZhanneilianxiView> selectListView(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);

	List<ZhanneilianxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
	
	ZhanneilianxiView selectView(@Param("ew") Wrapper<ZhanneilianxiEntity> wrapper);
	

}
