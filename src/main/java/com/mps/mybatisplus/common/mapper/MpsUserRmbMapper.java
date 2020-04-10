package com.mps.mybatisplus.common.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mps.mybatisplus.common.entity.MpsUserRmb;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 员工、工资信息 Mapper 接口
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
@Component
public interface MpsUserRmbMapper extends BaseMapper<MpsUserRmb> {
    String querySql = "select * from (SELECT a.*,b.MONEY from MPS_USER a left join MPS_RMB b on a.ID = b.USER_ID) ${ew.customSqlSegment}";

    @Select(querySql)
    Page<MpsUserRmb> selectPageCustom(Page page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
