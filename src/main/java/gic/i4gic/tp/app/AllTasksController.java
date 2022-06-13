package gic.i4gic.tp.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllTasksController {

	@GetMapping("/")
	public String task1() {

		return """
				<center>
				<a href="http://localhost:8080/tp14/task1"><h1> Task1 </h1><a>
				<a href="http://localhost:8080/tp14/task2"><h1> Task2 </h1><a>
				<a href="http://localhost:8080/tp14/task3"><h1> Task3 </h1><a>
				<a href="http://localhost:8080/tp14/task4"><h1> Task4 </h1><a>
				<a href="http://localhost:8080/tp14/task5?username=Gest"><h1> Task5 </h1><a>
				<br>
				<h2 style="color:Red"> Noted: Before go to Task5, Please login in Task2 first!</h2>
				<h3>Username: Vichea and Password: 123456</h3>
				
				<center>
				""";
	}
}

@RestController
class Task_01Controller {
	@GetMapping("/tp14/task1")
	public String task1() {

		return "<h1> Welcome to TP14 Task1 </h1>";
	}
}

@Controller
class Task_02Controller {
	@GetMapping("/tp14/task2")
	public String task2() {

		return "task02";
	}
}

@Controller
class Task_03Controller {
	@GetMapping("/tp14/task3")
	public String task3() {

		return "task03";
	}
}


@Controller
@RequestMapping(path="/tp14/task5")
class Task_05Controller{
	
	@RequestMapping(method=RequestMethod.GET)
	public String task4(Model model,@RequestParam("username") String username) {
		model.addAttribute("name_user",username);
		return "task05";
	}
}


