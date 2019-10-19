import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
     
    @RequestMapping(value="/", produces = "plain/text")
    public String getBook() {
        return "Hello World!";
    }
}