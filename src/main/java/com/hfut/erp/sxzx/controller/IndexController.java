package com.hfut.erp.sxzx.controller;

import com.hfut.erp.sxzx.service.IndexService;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZYP
 */
@Controller
@RequestMapping("/index")
public class IndexController {
  private final IndexService indexService;

  @Autowired
  public IndexController(IndexService indexService) {
    this.indexService = indexService;
  }
  @RequestMapping( method = RequestMethod.GET)
  public String index(ModelMap map) {
    map.addAttribute("newList", indexService.getNews());
    map.addAttribute("noticeList", indexService.getNotices());
    map.addAttribute("chairList", indexService.getChairs());
    return "index";
  }

  @RequestMapping(value = "device", method = RequestMethod.GET)
  public String device(ModelMap map) {
    return "/index/device/device";
  }

  @RequestMapping(value = "intro", method = RequestMethod.GET)
  public String intro(ModelMap map) {
    return "/index/intro/intro";
  }

  @RequestMapping(value = "rule", method = RequestMethod.GET)
  public String rule(ModelMap map) {
    return "/index/rule/rule";
  }

  @RequestMapping(value = "rule/plat", method = RequestMethod.GET)
  public String plat(ModelMap map) {
    return "/index/rule/plat";
  }

  @RequestMapping(value = "rule/run", method = RequestMethod.GET)
  public String run(ModelMap map) {
    return "/index/rule/run";
  }

  @RequestMapping(value = "teach", method = RequestMethod.GET)
  public String teach(ModelMap map) {
    return "/index/teach/teach";
  }

  @RequestMapping(value = "teach/book", method = RequestMethod.GET)
  public String book(ModelMap map) {
    return "/index/teach/book";
  }

  @RequestMapping(value = "teach/sys", method = RequestMethod.GET)
  public String sys(ModelMap map) {
    return "/index/teach/sys";
  }

  @RequestMapping(value = "teach/way", method = RequestMethod.GET)
  public String way(ModelMap map) {
    return "/index/teach/way";
  }

  @RequestMapping(value = "team", method = RequestMethod.GET)
  public String team(ModelMap map) {
    return "/index/team/team";
  }

  @RequestMapping(value = "team/train", method = RequestMethod.GET)
  public String train(ModelMap map) {
    return "/index/team/train";
  }
}
