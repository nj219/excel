package com.nj.excledemo.dao;


import com.nj.excledemo.domain.CostCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CostCenterMapper extends JpaRepository<CostCenter, Integer>, JpaSpecificationExecutor<CostCenter> {

}
