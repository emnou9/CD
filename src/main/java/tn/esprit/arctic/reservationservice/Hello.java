package tn.esprit.arctic.reservationservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class Hello {

@RequestMapping("/hello")
@ResponseBody
public String sayHello() {
return "Hello i am Khalfa Emna ";
}


}
