package com.hfut.erp.sxzx.dao;

import com.hfut.erp.sxzx.domain.New;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewDao {
  /**
   * 获取所有新闻
   * @return new List
   */
  List<New> selectNew();
}
