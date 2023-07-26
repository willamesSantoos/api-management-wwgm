package wwgm.api.management.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import wwgm.api.management.stock.general.launch.LaunchService;

@Controller
@RequestMapping("/api/management-stock/v1/launch")
public class LaunchController {

	@Autowired
	LaunchService service;
	
}
