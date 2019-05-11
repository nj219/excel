package com.nj.excledemo;

import com.nj.excledemo.domain.CostCenter;
import com.nj.excledemo.servive.CostCenterService;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;

public class CumminsApplicationTests {
	@Autowired
	private CostCenterService costCenter;

	@Test
	public void contextLoads() {
	}

}
