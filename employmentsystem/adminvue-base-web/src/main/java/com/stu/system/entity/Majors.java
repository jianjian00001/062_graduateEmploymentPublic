package com.stu.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("majors")
@ApiModel(value="Majors对象", description="专业表")
public class Majors implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "")
    private String cname;

    @ApiModelProperty(value = "")
    private String cbianhao;

    @ApiModelProperty(value = "")
    private String cintroduce;

    @ApiModelProperty(value = "")
    private int cnums;

    @ApiModelProperty(value = "")
    private int ctotalnums;

    @ApiModelProperty(value = "")
    private String crates;

}
