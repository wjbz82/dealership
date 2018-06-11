package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="world") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/interests")
    public String getInterests(){
        return "interests";
    }

    @GetMapping("/school")
    public String getSchool(){
        return "school";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
