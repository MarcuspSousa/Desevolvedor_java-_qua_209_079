package com.projetofinal2.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.projetofinal2.app.models.Caso;
import com.projetofinal2.app.repository.AppRepository;

@Controller
public class ControllerListaCasosNResolvidos {
    @RequestMapping(value = "/detalhescasos/{idcaso}", method = RequestMethod.GET)
    public ModelAndView detalhescasos(@PathVariable("idcaso") long idcaso) {
        Caso caso = csr.findByIdCaso(idcaso);
        ModelAndView mv = new ModelAndView("detalhescasos");
        mv.addObject("caso", caso);
        return mv;
    }
    @Autowired
    private AppRepository csr;

     @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/cadastro" , method = RequestMethod.GET)
    public String cadastro(){
        return "cadastro";
    }
   
    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public String cadastro(Caso caso){
        csr.save(caso);
        return "redirect:/listadecasos";
    }

    //  @RequestMapping(value = "/listadecasos", method = RequestMethod.GET)
    // public String listadecasos(){
    //     return "listadecasos";
    // }
    //lsita de casos 
    @RequestMapping(value= "/listadecasos",method = RequestMethod.GET)
    public ModelAndView listadecasos(){
        ModelAndView mv = new ModelAndView("listadecasos");
        Iterable<Caso> casos = csr.findAll();
        mv.addObject("casos", casos);
        return mv;
    }
    //alterar caso
    @RequestMapping(value = "/alterarcaso/{idcaso}", method = RequestMethod.GET)
    public ModelAndView alterarcaso(@PathVariable("idcaso")long idcaso){
        Caso caso = csr.findByIdCaso(idcaso);
        ModelAndView mv = new ModelAndView("alterarcaso");
        mv.addObject("caso", caso);
        return mv;
    }
    @RequestMapping (value = "/alterarcaso/{id_caso}",
    method = RequestMethod.POST)
    public String alterarcaso(@Validated Caso caso, 
    BindingResult result, RedirectAttributes atriAttributes){
        csr.save(caso);
        return "redirect:/listadecasos";
    }

    //excluir caso 
    @RequestMapping(value = "/confirmarExclusao/{idcaso}")
    public ModelAndView confirmarExclusao(@PathVariable ("idcaso") long idcaso){
        Caso caso = csr.findByIdCaso(idcaso);
        ModelAndView mv = new ModelAndView("excluircaso");
        mv.addObject("caso", caso);
        return mv;
    }
    @RequestMapping(value = "/excluircaso", method = RequestMethod.POST)
    public String excluircaso(long idcaso) {
        csr.deleteById(idcaso);
        return "redirect:/listadecasos";
    }


}
