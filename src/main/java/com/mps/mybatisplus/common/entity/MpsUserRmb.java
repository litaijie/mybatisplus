package com.mps.mybatisplus.common.entity;

import com.mps.mybatisplus.common.enums.UserEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@ApiModel(value = "员工及工资信息PO")
public class MpsUserRmb {

    @ApiModelProperty(name = "id", value = "员工表id")
    private String id;

    @ApiModelProperty(name = "name", value = "姓名")
    private String name;

    @ApiModelProperty(name = "createDate", value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(name = "startMoney", value = "工资")
    private BigDecimal money;
}
