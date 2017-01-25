package de.tomahawk;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/products/{id}")
    String hello(@PathVariable String id) {
        return "Hello, " + id + "!";
    }
	
}
