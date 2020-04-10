package com.mps.mybatisplus.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.core.enums.IEnum;

public enum UserEnum implements IEnum<String> {
    A_TO("2","这个是A"),B("6","这个是B");

    private String code;

    private String  desc;

    UserEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return this.desc;
    }
}
