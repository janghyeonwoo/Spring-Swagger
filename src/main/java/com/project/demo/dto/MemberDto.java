package com.project.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.GetMapping;

@Setter
@Getter
@ToString
public class MemberDto {
    @ApiModelProperty(name = "id", value = "아이디", required = true)
    private String id;
    @ApiModelProperty(name = "userName", value = "이름", required = true)
    private String userName;
}
