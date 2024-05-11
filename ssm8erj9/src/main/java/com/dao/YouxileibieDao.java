package com.dao;

import com.entity.YouxileibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxileibieVO;
import com.entity.view.YouxileibieView;


/**
 * 游戏类别
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:19:54
 */
public interface YouxileibieDao extends BaseMapper<YouxileibieEntity> {
	
	List<YouxileibieVO> selectListVO(@Param("ew") Wrapper<YouxileibieEntity> wrapper);
	
	YouxileibieVO selectVO(@Param("ew") Wrapper<YouxileibieEntity> wrapper);
	
	List<YouxileibieView> selectListView(@Param("ew") Wrapper<YouxileibieEntity> wrapper);

	List<YouxileibieView> selectListView(Pagination page,@Param("ew") Wrapper<YouxileibieEntity> wrapper);
	
	YouxileibieView selectView(@Param("ew") Wrapper<YouxileibieEntity> wrapper);
	

}
