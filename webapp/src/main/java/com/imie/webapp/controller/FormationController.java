package com.imie.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.imie.webapp.model.Formation;
import com.imie.webapp.service.FormationService;

@Controller
public class FormationController {

    @Autowired
    private FormationService service;

    @GetMapping("/formations")
    public String getFormations(Model model) {
        Iterable<Formation> listFormation = service.getAllFormations();
        model.addAttribute("formations", listFormation);
        return "formations";
    }

    @GetMapping("/formations/create")
    public String createFormation(Model model) {
        Formation f = new Formation();
        model.addAttribute("formation", f);
        return "formNewFormation";
    }

    @GetMapping("/formations/update/{id}")
    public String updateFormation(@PathVariable("id") final long id, Model model) {
        Formation f = service.getFormation(id);
        model.addAttribute("formation", f);
        return "formUpdateFormation";
    }

    @GetMapping("/formations/delete/{id}")
    public ModelAndView deleteFormation(@PathVariable("id") final long id) {
        service.deleteFormation(id);
        return new ModelAndView("redirect:/formations");
    }

    @PostMapping("/formations/save")
    public ModelAndView saveFormation(@ModelAttribute Formation formation) {
        service.saveFormation(formation);
        return new ModelAndView("redirect:/formations");
    }

}
