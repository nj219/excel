/*
package com.nj.excledemo.controller;

import com.nj.excledemo.domain.CostCenter;
import com.nj.excledemo.servive.CostCenterService;
import com.nj.excledemo.util.ExportExcel;
import com.nj.excledemo.util.UrlToMultipartFileUtil;
import com.nj.excledemo.util.downimage;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.*;

*/
/**
 * @ClassName test
 * @Author shangpinyuan06
 * @Date 2019/5/11 9:59
 **//*

@Controller
public class test {
    @Autowired
    private CostCenterService costCenterService;

    @RequestMapping
    public void test() throws Exception {
        //图片处理



        //1. 导出Excel的路径
        String filePath = "F:\\export.xls";
        OutputStream os = new FileOutputStream(filePath);

        //List<CostCenter> list = costCenterService.costList();

        Collection collection = new ArrayList();
        Map<String,Object> map = new HashMap();
        for (CostCenter costCenter : list) {
            map = new HashMap();
            map.put("type",costCenter.getType());
            map.put("emission",costCenter.getEmission());
            map.put("series",costCenter.getSeries());
            map.put("model",costCenter.getModel());
            map.put("cost",costCenter.getCost());
            URL url = new URL(costCenter.getUrl());
            map.put("url", url);

            ((ArrayList) collection).add(map);
        }

        ExportExcel exportExcel = new ExportExcel();

        String[] arr = {"type","emission","series","model","cost","url"};
        exportExcel.exportXSExcelByColumn("零件数据",arr,arr,collection,os,"");
    }
}
*/
