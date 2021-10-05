package com.project.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("test")
@Api(tags = "test입니다..")
public class TestContoller {


    @ApiOperation(value = "TEST 목록 조회", notes = "TEST 목록 조회" , response = String.class)
    @GetMapping("list")
    public String getList(
            HttpServletRequest request,
            @ApiParam(value = "회원타입", required = true)  @RequestParam("memberType") Integer memberType,
            @ApiParam(value = "회원이름", required = true)  @RequestParam("memberName") String memberName){
        return "test pooney입니다.";
    }

}
