package com.mps.mybatisplus.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 员工信息
 * </p>
 *
 * @author ken
 * @since 2020-03-31
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(discriminator = "员工工资查询VO")
public class MpsUserVO {
    @ApiModelProperty(name = "name",value = "姓名")
    private String name;

    @ApiModelProperty(name = "startCreateDate",value = "创建时间起始值")
    private Date startCreateDate;

    @ApiModelProperty(name = "endCreateDate",value = "创建时间结束值")
    private Date endCreateDate;

    @ApiModelProperty(name = "startMoney",value = "工资起始值")
    private BigDecimal startMoney;

    @ApiModelProperty(name = "endMoney",value = "工资结束值")
    private BigDecimal endMoney;

    @ApiModelProperty(name = "pageNum",value = "第几页")
    private int pageNum;

    @ApiModelProperty(name = "pageSize",value = "每页显示多少条记录")
    private int pageSize;
}
