package com.hfut.erp.sxzx.controller;

import com.hfut.erp.sxzx.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZYP
 */
@Controller
public class IndexController {


  private final IndexService indexService;

  @Autowired
  public IndexController(IndexService indexService) {
    this.indexService = indexService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(ModelMap map) {
    map.addAttribute("newList", indexService.getNews());
    map.addAttribute("noticeList", indexService.getNotices());
    map.addAttribute("chairList", indexService.getChairs());
    return "index";
  }
}
