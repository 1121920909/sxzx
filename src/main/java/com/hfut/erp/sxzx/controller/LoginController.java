package com.hfut.erp.sxzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZYP
 */
@Controller
public class LoginController {
  @RequestMapping("/login")
  public String login(ModelMap map) {
    return "login/login";
  }
}
