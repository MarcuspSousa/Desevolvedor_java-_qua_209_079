package com.projetofinal2.app.Controller;

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
    @Autowired
    private AppRepository csr;

     @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/listadecasos")
    public ModelAndView listadecasos() {
        ModelAndView mv = new ModelAndView("listar");
        Iterable<Caso> usuarios = csr.findAll();
        mv.addObject("usuarios", usuarios);
        return mv;
    }
      @RequestMapping("/cadastro")
      public String cadastro(){
        return "cadastro";
      }

          @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public String cadastrar(Caso usuario){
        csr.save(usuario);
        return "redirect:/";
    }      

    @RequestMapping(value = "alterarUsuario/(idPessoa)" , method = RequestMethod.POST)
    public String alterarUsuario(@Validated Caso usuario, BindingResult result , RedirectAttributes attributes){
        csr.save(usuario);
        return "redrect;/cadastro";
    }
     @RequestMapping(value = "/alterarUsuario/{idPessoa} " , method = RequestMethod.GET)
    public ModelAndView alterarUsuario(@PathVariable("idcaso")long idCaso) {
        Caso usuario = csr.findByIdCaso(idCaso);
        ModelAndView mv = new ModelAndView("alterarUsuario");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping("/confirmaresclusão/(idPessoa)")
    public ModelAndView confirmarExclusão(@PathVariable("idcaso") long idCaso) {
        Caso usuario = csr.findByIdCaso(idCaso);
        ModelAndView mv = new ModelAndView("excluirUsuario");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping("/excluirUsuario")
    public String excluirUsuario(long idCaso) {
        Caso usuario = csr.findByIdCaso(idCaso);
        csr.delete(usuario);
        return "redirect:/listar";
    }



}
