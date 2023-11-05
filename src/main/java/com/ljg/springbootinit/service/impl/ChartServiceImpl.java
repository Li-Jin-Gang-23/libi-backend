package com.ljg.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljg.springbootinit.model.entity.Chart;
import com.ljg.springbootinit.service.ChartService;
import com.ljg.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 86137
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-11-05 20:45:27
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




