package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    static final Logger log = LoggerFactory.getLogger(HelloController.class);
    
    @RequestMapping("/")
    public String index() {
        log.info("#########################################", "test");
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/file/export")
    public void export() {
        //Document doc = Jsoup.get
    }
    
}
