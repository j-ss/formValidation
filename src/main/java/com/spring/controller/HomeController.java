package com.spring.controller;

import com.spring.entity.Details;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import javax.validation.Valid;

@Controller

public class HomeController {

    @Value("#{'${city}'.split(',')}")
    private List<String> list;

    @GetMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("details",new Details());
        model.addAttribute("list",list);
        return "home";
    }

    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public String checkPage(@Valid @ModelAttribute("details")Details detail,BindingResult result)
    {
        if (result.hasErrors()) {
            return "home";
        }
        else {
            return "success";
        }
    }

    @InitBinder
    public void initBInder(WebDataBinder binder)
    {
        StringTrimmerEditor editor=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,editor);
    }

}
