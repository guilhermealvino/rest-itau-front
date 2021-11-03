package br.com.testiti.restitaufront.controller;

import br.com.testiti.restitaufront.model.UsuarioDTO;
import br.com.testiti.restitaufront.model.UsuarioDTOResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home/indexsenha");
    }

    @PostMapping(value = "/senha/valid", consumes = {"application/json" }, produces = {"application/json" })
    public ResponseEntity<UsuarioDTOResponse> valid(@RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTOResponse response = UsuarioDTOResponse.builder().build();
        String validaSenha = "SenhaValida";
        if("SenhaValida".equals(validaSenha)){
            response.setMessage("Senha validada com sucesso!");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else if((validaSenha) == "^(?=.[A-Za-z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{8,}$"){
            response.setMessage("A senha [AJUSTAR TEXTO]...!");
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else{
            response.setMessage("A senha não atende ao formato");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }


    public void valid() {

    }
}



