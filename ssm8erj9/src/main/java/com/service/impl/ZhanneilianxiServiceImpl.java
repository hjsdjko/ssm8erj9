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


import com.dao.ZhanneilianxiDao;
import com.entity.ZhanneilianxiEntity;
import com.service.ZhanneilianxiService;
import com.entity.vo.ZhanneilianxiVO;
import com.entity.view.ZhanneilianxiView;

@Service("zhanneilianxiService")
public class ZhanneilianxiServiceImpl extends ServiceImpl<ZhanneilianxiDao, ZhanneilianxiEntity> implements ZhanneilianxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanneilianxiEntity> page = this.selectPage(
                new Query<ZhanneilianxiEntity>(params).getPage(),
                new EntityWrapper<ZhanneilianxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanneilianxiEntity> wrapper) {
		  Page<ZhanneilianxiView> page =new Query<ZhanneilianxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanneilianxiVO> selectListVO(Wrapper<ZhanneilianxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanneilianxiVO selectVO(Wrapper<ZhanneilianxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanneilianxiView> selectListView(Wrapper<ZhanneilianxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanneilianxiView selectView(Wrapper<ZhanneilianxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
