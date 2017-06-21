package PotLuckWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value="/uniform", method=RequestMethod.GET)
	public String foodTypo(Model model){
		model.addAttribute(new Student());
		System.out.println("GET");
		return "uniform";
	}
	
	@RequestMapping(value = "/uniform", method = RequestMethod.POST)
	public String foodTypo(@ModelAttribute Student student, Model model){
		model.addAttribute(student);
		System.out.println("POST");
		return "result";
	}
}
