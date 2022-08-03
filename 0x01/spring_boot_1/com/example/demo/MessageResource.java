import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
          return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";

    }

    @GetMapping("/login/{user}/{password}")
    public String login(@PathVariable ("user") String user, @PathVariable ("password") String password) {
        if(user == null || user.isEmpty() || password.isEmpty() || password == null){
            System.out.println("USUÁRIO E SENHA NÃO INFORMADOS");
        } else if (user.length() > 15 || password.length() > 15) {
            System.out.println("USUÁRIO E SENHA INVÁLIDOS");
            
        }
           return "LOGIN EFETUADO COM SUCESSO !!!";
            
        }

    }








