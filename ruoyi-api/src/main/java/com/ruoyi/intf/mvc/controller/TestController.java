package com.ruoyi.intf.mvc.controller;

import com.google.common.collect.Maps;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.intf.sys.RespInfo;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.service.ISysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/test")
public class TestController {

    @Autowired
    private ISysDeptService deptService;

	@GetMapping("/a")
	@Log(title="123")
	@RepeatSubmit
	public RespInfo<SysDept> test() {


		SysDept a = new SysDept();
		a.setAncestors("1");
		StringUtils.isBlank("a");
		Map<String, String> map = Maps.newHashMap();
		deptService.selectDeptById(110L);
		return new RespInfo<SysDept>().setData(deptService.selectDeptById(110L)).setRespCode("1").setRespDesc("1");
	}

}
