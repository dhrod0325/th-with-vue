package test;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloVueController {
    @GetMapping("/")
    public String showHelloPage(ModelMap model) {
        model.addAttribute("title", "Hello Vue!");
        model.addAttribute("chartData", Arrays.asList(7, 6, 5, 4, 3, 2, 1));

        return "hello-vue";
    }
}
