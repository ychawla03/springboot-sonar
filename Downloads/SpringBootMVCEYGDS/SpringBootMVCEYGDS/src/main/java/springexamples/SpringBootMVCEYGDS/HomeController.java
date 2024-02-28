package springexamples.SpringBootMVCEYGDS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // / here is called as url-pattern
    public String showIndexPage(){
        System.out.println("We are in Home Controller Class.");
        //this returns the name of a jsp
        //
        return "index";
    }
}
