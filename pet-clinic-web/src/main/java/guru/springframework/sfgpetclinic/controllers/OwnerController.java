package guru.springframework.sfgpetclinic.controllers;

import guru.springframeworkguru.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/", "/index"})
    public String list(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/list";
    }
}
