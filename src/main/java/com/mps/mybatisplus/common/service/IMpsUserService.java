package com.mps.mybatisplus.common.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mps.mybatisplus.common.entity.MpsUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mps.mybatisplus.common.entity.MpsUserRmb;
import com.mps.mybatisplus.common.vo.MpsUserVO;

/**
 * <p>
 * 员工信息 服务类
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
public interface IMpsUserService extends IService<MpsUser> {

    Page<MpsUserRmb> selectPage(Page page, MpsUserVO mpsUserVO);
}
