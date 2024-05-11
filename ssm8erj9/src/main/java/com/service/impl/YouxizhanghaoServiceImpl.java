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


import com.dao.YouxizhanghaoDao;
import com.entity.YouxizhanghaoEntity;
import com.service.YouxizhanghaoService;
import com.entity.vo.YouxizhanghaoVO;
import com.entity.view.YouxizhanghaoView;

@Service("youxizhanghaoService")
public class YouxizhanghaoServiceImpl extends ServiceImpl<YouxizhanghaoDao, YouxizhanghaoEntity> implements YouxizhanghaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxizhanghaoEntity> page = this.selectPage(
                new Query<YouxizhanghaoEntity>(params).getPage(),
                new EntityWrapper<YouxizhanghaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxizhanghaoEntity> wrapper) {
		  Page<YouxizhanghaoView> page =new Query<YouxizhanghaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxizhanghaoVO> selectListVO(Wrapper<YouxizhanghaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxizhanghaoVO selectVO(Wrapper<YouxizhanghaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxizhanghaoView> selectListView(Wrapper<YouxizhanghaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxizhanghaoView selectView(Wrapper<YouxizhanghaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
