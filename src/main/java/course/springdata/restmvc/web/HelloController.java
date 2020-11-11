package course.springdata.restmvc.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name",required = false,defaultValue = "not input") String name){
        return String.format( "HELLO %s , From Spring MVC!",name);
    }

}
