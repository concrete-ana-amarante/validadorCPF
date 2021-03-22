package com.validar.cpf.validadorCPF.controllers;

import com.validar.cpf.validadorCPF.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @PostMapping("/valida-cpf")
    public String validarCpf(Cliente cliente, Model model){
        model.addAttribute("cliente", cliente);
        model.addAttribute("validade", cliente.validarCPF());
        System.out.println("========");
        System.out.println(cliente.getCpf());
        System.out.println("========");
        System.out.println(cliente.validarCPF());
        System.out.println("========");
        return "home/cpfValidado";
    }

}
