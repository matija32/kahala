package nl.fungames.kahala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
