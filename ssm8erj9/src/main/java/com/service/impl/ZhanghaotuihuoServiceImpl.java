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


import com.dao.ZhanghaotuihuoDao;
import com.entity.ZhanghaotuihuoEntity;
import com.service.ZhanghaotuihuoService;
import com.entity.vo.ZhanghaotuihuoVO;
import com.entity.view.ZhanghaotuihuoView;

@Service("zhanghaotuihuoService")
public class ZhanghaotuihuoServiceImpl extends ServiceImpl<ZhanghaotuihuoDao, ZhanghaotuihuoEntity> implements ZhanghaotuihuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanghaotuihuoEntity> page = this.selectPage(
                new Query<ZhanghaotuihuoEntity>(params).getPage(),
                new EntityWrapper<ZhanghaotuihuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanghaotuihuoEntity> wrapper) {
		  Page<ZhanghaotuihuoView> page =new Query<ZhanghaotuihuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanghaotuihuoVO> selectListVO(Wrapper<ZhanghaotuihuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanghaotuihuoVO selectVO(Wrapper<ZhanghaotuihuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanghaotuihuoView> selectListView(Wrapper<ZhanghaotuihuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanghaotuihuoView selectView(Wrapper<ZhanghaotuihuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
