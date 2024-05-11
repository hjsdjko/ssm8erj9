package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YouxileibieDao;
import com.entity.YouxileibieEntity;
import com.service.YouxileibieService;
import com.entity.vo.YouxileibieVO;
import com.entity.view.YouxileibieView;

@Service("youxileibieService")
public class YouxileibieServiceImpl extends ServiceImpl<YouxileibieDao, YouxileibieEntity> implements YouxileibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxileibieEntity> page = this.selectPage(
                new Query<YouxileibieEntity>(params).getPage(),
                new EntityWrapper<YouxileibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxileibieEntity> wrapper) {
		  Page<YouxileibieView> page =new Query<YouxileibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxileibieVO> selectListVO(Wrapper<YouxileibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxileibieVO selectVO(Wrapper<YouxileibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxileibieView> selectListView(Wrapper<YouxileibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxileibieView selectView(Wrapper<YouxileibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
