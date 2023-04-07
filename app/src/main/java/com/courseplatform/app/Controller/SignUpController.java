import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SignUpController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}
