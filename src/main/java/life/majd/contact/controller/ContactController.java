package life.majd.contact.controller;

import life.majd.contact.entities.Contact;
import life.majd.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/contact")
public class ContactController {

  @Autowired
  private ContactRepository contactRepository;


  @GetMapping("/list")
  public String listContact(Model model) {
    model.addAttribute("listContact", contactRepository.findAll());
    model.addAttribute("contact", new Contact());
    return "contact";
  }


  @PostMapping("/add")
  public String addContact(Contact contact, Model model) {
    contactRepository.save(contact);
    model.addAttribute("contact", new Contact());
    model.addAttribute("listContact", contactRepository.findAll());
    return "contact";
  }


  @GetMapping("/show-edit")
  public String showEdit(Long id, Model model) {
    model.addAttribute("contact", contactRepository.findById(id));
    model.addAttribute("listContact", contactRepository.findAll());
    return "contact";
  }

  @GetMapping("/delete")
  public String delete(Long id, Model model) {
    contactRepository.deleteById(id);
    model.addAttribute("contact", new Contact());
    model.addAttribute("listContact", contactRepository.findAll());
    return "contact";
  }

}
