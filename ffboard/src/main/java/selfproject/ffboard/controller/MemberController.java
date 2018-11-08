package selfproject.ffboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selfproject.ffboard.service.MemberSerivce;

@Controller
public class MemberController {
    private MemberSerivce memberSerivce;

    public MemberController(MemberSerivce memberSerivce) {
        this.memberSerivce = memberSerivce;
    }

    @GetMapping
    public String signUpForm(ModelMap modelMap,
                             @RequestParam(value = "email", defaultValue = "") String email,
                             @RequestParam(value = "nickName", defaultValue = "") String nickName,
                             @RequestParam(value = "duplication", defaultValue = "") String duplication) {
        modelMap.addAttribute("email", email);
        modelMap.addAttribute("nickName", nickName);
        modelMap.addAttribute("duplication", duplication);

        return "signup";
    }
}

