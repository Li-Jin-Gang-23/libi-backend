package com.ljg.springbootinit.model.vo;

import lombok.Data;

/**
 * + Bi 的返回结果
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2023/11/10 0010 20:33
 */
@Data
public class BiResponse {

    private String genChart;

    private String genResult;
    // 新生成的图标id
    private Long chartId;
}
