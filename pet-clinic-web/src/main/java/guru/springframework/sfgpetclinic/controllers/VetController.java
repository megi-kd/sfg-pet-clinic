package guru.springframework.sfgpetclinic.controllers;

import guru.springframeworkguru.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets"})
    public String list(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/list";
    }
}
