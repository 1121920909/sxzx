package com.hfut.erp.sxzx.service;

import com.hfut.erp.sxzx.dao.ChairDao;
import com.hfut.erp.sxzx.dao.NewDao;
import com.hfut.erp.sxzx.dao.NoticeDao;
import com.hfut.erp.sxzx.domain.Chair;
import com.hfut.erp.sxzx.domain.New;
import com.hfut.erp.sxzx.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZYP
 */
@Service
public class IndexService {
  private final NewDao newDao;
  private final NoticeDao noticeDao;
  private final ChairDao chairDao;

  @Autowired
  public IndexService(NewDao newDao, NoticeDao noticeDao, ChairDao chairDao) {
    this.newDao = newDao;
    this.noticeDao = noticeDao;
    this.chairDao = chairDao;
  }
  public List<New> getNews() {
    return newDao.selectNew();
  }

  public List<Notice> getNotices() {
    return noticeDao.selectNotice();
  }

  public List<Chair> getChairs() {
    return chairDao.selectChair();
  }
}
