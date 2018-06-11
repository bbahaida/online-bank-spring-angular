package com.bahaida.userfront.endpoints.Controllers;

import com.bahaida.userfront.persistence.domain.User;
import com.bahaida.userfront.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(Model model, @ModelAttribute("user") User user){
        if (userService.checkUserExists(user.getUsername(),user.getEmail())){
            if (userService.checkEmailExists(user.getEmail()))
                model.addAttribute("emailExists",true);
            if (userService.checkUsernameExists(user.getUsername()))
                model.addAttribute("usernameExists",true);
            return "signup";
        }else{
            userService.saveUser(user);
            return "redirect:/";
        }

    }
}
