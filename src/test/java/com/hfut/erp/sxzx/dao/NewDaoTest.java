package com.hfut.erp.sxzx.dao;

import com.hfut.erp.sxzx.domain.New;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author ZYP
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewDaoTest {
  @Autowired
  private NewDao newDao;
  @Test
  public void selectNewTest() {
    List<New> newList = newDao.selectNew();
    for (New n : newList) {
      System.out.println(n);
    }
  }
}
