package com.hfut.erp.sxzx.dao;

import com.hfut.erp.sxzx.domain.Chair;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChairDao {
  List<Chair> selectChair();
}
