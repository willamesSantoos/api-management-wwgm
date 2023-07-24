package wwgm.api.management.stock.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/management-stock/v1/login")
public class LoginController {

    @PostMapping
    public boolean loginUser () {
    	return true;
    }
}
