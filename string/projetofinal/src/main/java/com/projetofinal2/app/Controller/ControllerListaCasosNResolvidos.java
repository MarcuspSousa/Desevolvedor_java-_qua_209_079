package com.projetofinal2.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControllerListaCasosNResolvidos {
     @RequestMapping("/")
    public String index(){
        return "index";
    } 
    @RequestMapping("/listadecasos")
    public String listadecasos() {
        return "listadecasos";
    }
     @RequestMapping(value = "/alterarUsuario/{idPessoa} " , method = RequestMethod.GET)
    public ModelAndView alterarUsuario(@PathVariable("idPessoa")long idPessoa) {
        Pessoa usuario = csr.findByIdPessoa(idPessoa);
        ModelAndView mv = new ModelAndView("alterarUsuario");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping(value = "alterarUsuario/(idPessoa)" , method = RequestMethod.POST)
    public String alterarUsuario(@Validated Pessoa usuario, BindingResult result , RedirectAttributes attributes){
        csr.save(usuario);
        return "redirect:/listarUsuarios";
    }

    @RequestMapping("/confirmaresclusão/(idPessoa)")
    public ModelAndView confirmarExclusão(@PathVariable("idPessoa") long idPessoa) {
        Pessoa usuario = csr.findByIdPessoa(idPessoa);
        ModelAndView mv = new ModelAndView("excluirUsuario");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping("/excluirUsuario")
    public String excluirUsuario(long idPessoa) {
        Pessoa usuario = csr.findByIdPessoa(idPessoa);
        csr.delete(usuario);
        return "redirect:/listarUsuarios";
    }



}
