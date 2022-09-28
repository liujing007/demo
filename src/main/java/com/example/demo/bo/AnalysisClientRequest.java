package com.example.demo.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @author woshijing
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年09月28日 10:49:00
 */

@Setter
@Getter
@ToString
@ApiModel("分析client请求信息")
public class AnalysisClientRequest {

    @ApiModelProperty(value = "analysisId")
    private Long analysisId;

    @ApiModelProperty(value = "cubeId")
    private Long cubeId;

    @ApiModelProperty(value = "分析名称")
    @NotBlank(message = "分析名称不能为空")
    private String analysisName;
}
