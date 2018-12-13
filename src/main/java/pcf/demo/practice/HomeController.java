package pcf.demo.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping(value = "/")
    public String index() {
        System.out.println("test");
        return "index.html";
    }
}
