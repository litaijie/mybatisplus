package com.mps.mybatisplus.common.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("MPS_USER")
@KeySequence(value = "MPS_USER_S")
public class MpsUser implements Serializable {

    private static final long serialVersionUID = 1L;

//    @TableId(value = "ID",type = IdType.INPUT)
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;
}
