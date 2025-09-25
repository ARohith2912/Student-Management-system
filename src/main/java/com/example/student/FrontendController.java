
package com.example.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    // Forward all routes (except files like .js, .css) to index.html
    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/index.html";
    }
}
