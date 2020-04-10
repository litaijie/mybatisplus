package com.mps.mybatisplus.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mps.mybatisplus.common.entity.MpsUser;
import com.mps.mybatisplus.common.entity.MpsUserRmb;
import com.mps.mybatisplus.common.mapper.MpsUserRmbMapper;
import com.mps.mybatisplus.common.vo.MpsUserVO;
import com.mps.mybatisplus.common.mapper.MpsUserMapper;
import com.mps.mybatisplus.common.service.IMpsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息 服务实现类
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
@Service
public class MpsUserServiceImpl extends ServiceImpl<MpsUserMapper, MpsUser> implements IMpsUserService {
    @Autowired
    private MpsUserMapper mpsUserMapper;

    @Autowired
    private MpsUserRmbMapper mpsUserRmbMapper;

    @Override
    public Page<MpsUserRmb> selectPage(Page page, MpsUserVO mpsUserVO){
//        QueryWrapper ss =new QueryWrapper();
//        ss.eq(StringUtils.isNotEmpty(mpsUserVO.getName()),"NAME",mpsUserVO.getName());
        LambdaQueryWrapper<MpsUserRmb> lambdaQueryWrapper = new QueryWrapper<MpsUserRmb>().lambda();
        lambdaQueryWrapper.eq(StringUtils.isNotEmpty(mpsUserVO.getName()),MpsUserRmb::getName,mpsUserVO.getName())
                .ge(mpsUserVO.getStartCreateDate()!=null,MpsUserRmb::getCreateDate,mpsUserVO.getStartCreateDate())
                .le(mpsUserVO.getEndCreateDate()!=null,MpsUserRmb::getCreateDate,mpsUserVO.getEndCreateDate())
                .ge(mpsUserVO.getStartMoney()!=null,MpsUserRmb::getMoney,mpsUserVO.getStartMoney())
                .le(mpsUserVO.getEndMoney()!=null,MpsUserRmb::getMoney,mpsUserVO.getEndMoney());
//        .nested(i -> i.ne(MpsUserRmb::getId,"1").eq(MpsUserRmb::getId,"2"));
        return mpsUserRmbMapper.selectPageCustom(page,lambdaQueryWrapper);
    }
}
