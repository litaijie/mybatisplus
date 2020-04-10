package com.mps.mybatisplus.common.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mps.mybatisplus.common.entity.MpsUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mps.mybatisplus.common.entity.MpsUserRmb;
import com.mps.mybatisplus.common.vo.MpsUserVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
@Component
public interface MpsUserMapper extends BaseMapper<MpsUser> {

}
