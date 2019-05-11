package com.nj.excledemo.servive;

import com.nj.excledemo.dao.CostCenterMapper;
import com.nj.excledemo.domain.CostCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CostCenterService
 * @Author shangpinyuan06
 * @Date 2019/5/11 9:32
 **/
@Service
public class CostCenterService {
    @Autowired
    private CostCenterMapper costCenterMapper;

    public List<CostCenter> costList() {
        List<CostCenter> costCenters = costCenterMapper.findAll();
        return costCenters;
    }
}
