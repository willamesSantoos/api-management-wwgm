package wwgm.api.management.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wwgm.api.management.stock.user.UserRepository;

@RestController
@RequestMapping("/api/management-stock/v1/user")
public class UserController {

	@Autowired
	UserRepository user;
	
	@GetMapping
	public void getAll () {
			
	}
}

