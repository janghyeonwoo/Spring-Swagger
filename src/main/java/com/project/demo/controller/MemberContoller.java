package com.project.demo.controller;

import com.project.demo.dto.MemberDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

@RestController
@RequestMapping("member")
@Api(tags = { "Swagger2 사용하기"})
public class MemberContoller {

    @ApiOperation(value = "회원 목록 조회", notes = "회원 정보 조회" , response = String.class)
    @GetMapping("getList")
    public ResponseEntity<String> getList(
            HttpServletRequest request,
            @ApiParam(value = "회원타입", required = true)  @RequestParam("memberType") Integer memberType,
            @ApiParam(value = "회원이름", required = true)  @RequestParam("memberName") String memberName){
        return new ResponseEntity<>("Pooney입니다.", HttpStatus.OK);
    }

    @ApiOperation(value = "회원 상세 조회", notes = "회원 상세 조회" , response = String.class)
    @PostMapping("getDetail")
    public ResponseEntity<MemberDto> getDetail(HttpServletRequest request, @RequestBody MemberDto body){
        MemberDto member = new MemberDto();
        member.setId(body.getId());
        member.setUserName(body.getUserName());

        return new ResponseEntity<>(member, HttpStatus.OK);
    }
}
