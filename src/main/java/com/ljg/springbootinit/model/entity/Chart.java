package com.ljg.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 图表信息表
 *
 * @TableName chart
 */
@TableName(value = "chart")
@Data
public class Chart implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 图标名称
     */
    private String name;
    /**
     * 分析目标
     */
    private String goal;
    /**
     * 图表数据
     */
    private String chartData;
    /**
     * 图表类型
     */
    private String chartType;
    /**
     * 生成的图表数据
     */
    private String genChart;
    /**
     * 生成的分析结论
     */
    private String genResult;
    /**
     * 任务状态
     */
    private String status;
    /**
     * 执行信息
     */
    private String execMessage;
    /**
     * 创建用户 id
     */
    private Long userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除
     */
    @TableLogic  // 识别逻辑删除字段
    private Integer isDelete;
}