package lt.codeacademy.javau8.lunar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BarController {

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}

@RestController
class RestAPIController {

    @GetMapping("/api/data")
    public String getExampleData() {
        return "Example data";
    }
}
