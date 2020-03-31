package com.mps.mybatisplus.common.service.impl;

import com.mps.mybatisplus.common.entity.MpsUser;
import com.mps.mybatisplus.common.mapper.MpsUserMapper;
import com.mps.mybatisplus.common.service.IMpsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
