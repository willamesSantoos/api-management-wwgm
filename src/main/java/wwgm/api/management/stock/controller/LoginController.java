package wwgm.api.management.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wwgm.api.management.stock.user.UserRepository;

@RestController
@RequestMapping("/api/management-stock/v1/login")
public class LoginController {

	@Autowired
	UserRepository user;
	
    @PostMapping
    public boolean loginUser () {
    	return true;
    }
}
