package com.zx.bt.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * author:ZhengXing
 * datetime:2018-03-06 23:01
 * metadata实体 type 字段
 */
@Getter
@AllArgsConstructor
public enum MetadataTypeEnum implements CodeEnum<Integer> {

    PEER(0, "从peer处获取"),
    ZHONGZISOU(1, "从www.zhongzidi.com获取"),
    BTWHAT(2, "从http://www.btwhat.info获取"),
    ;
    private Integer code;
    private String message;
}
