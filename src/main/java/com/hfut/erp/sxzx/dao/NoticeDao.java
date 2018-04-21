package com.hfut.erp.sxzx.dao;

import com.hfut.erp.sxzx.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDao {
  List<Notice> selectNotice();
}
