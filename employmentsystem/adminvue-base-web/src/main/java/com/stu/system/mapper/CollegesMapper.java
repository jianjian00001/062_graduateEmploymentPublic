package com.stu.system.mapper;

import com.stu.system.entity.Colleges;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CollegesMapper extends BaseMapper<Colleges> {

    IPage<Colleges> findCollegesPage(Page<Colleges> page, @Param(Constants.WRAPPER) QueryWrapper<Colleges> wrapper);
    List<Colleges> findCollegesByCbianhao(String cbianhao);
    List<Colleges> getColleges();
}
