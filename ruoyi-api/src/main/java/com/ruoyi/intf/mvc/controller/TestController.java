package com.ruoyi.intf.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.intf.sys.RespInfo;
import com.ruoyi.system.domain.SysDept;

@RestController
@RequestMapping("api/test")
public class TestController {

	@GetMapping("/a")
	public RespInfo<SysDept> test() {

		SysDept a = new SysDept();
		a.setAncestors("1");
		
		return new RespInfo<SysDept>().setData(a).setRespCode("1").setRespDesc("1");
	}

}
