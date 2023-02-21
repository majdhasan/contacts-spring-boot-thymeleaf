package life.majd.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping(value = "/")
  public String index() {
    return "redirect:/contact/list";
  }
}
