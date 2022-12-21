package com.Kiran.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Kiran.Model.AddMarks;
import com.Kiran.Model.RegisterStudent;
import com.Kiran.Repo.AddMarksRepo;
import com.Kiran.Repo.RegisterStudentRepo;

@Controller
public class RegisterStudentController {
	private static final Logger log=LoggerFactory.getLogger(RegisterStudentController.class);
	@Autowired
	private RegisterStudentRepo regRepo;
	@Autowired
	private AddMarksRepo addMarksRepo;
	@PostMapping("/add")
	public AddMarks addMarks(@ModelAttribute("addMarks") AddMarks addMarks) {
	    System.out.println("Hello");
	    log.info("Saving marks details");
	    addMarks.setTotal(addMarks.getMaths()+addMarks.getEnglish()+addMarks.getScience());
	    addMarks.setAverage(addMarks.getTotal()/3);
	    addMarks.setPercentage((addMarks.getAverage()*100)/300);
	     return addMarksRepo.save(addMarks);
	}
	@GetMapping("/")
	public String registerForm() {
		return "Register";
	}
	
    @PostMapping("/RegisterStudent")
	public String register(@ModelAttribute("/register") RegisterStudent stdRepo) {
		 regRepo.save(stdRepo);
		 return "AddMarks";
	}
    
    @GetMapping("/sem")
    public String report(Model m) {
    	m.addAttribute("top2ConsistentStudents",regRepo.top2ConsistentStudentsAcrossAllSemesters());
    	m.addAttribute("Marks",regRepo.avgMarksOfStudentsEachSubject());
    	return "Report";
    }
    @PostMapping("/avgPercentage")
    public String averagePercentage(@RequestParam("Sem") String sem,Model m) {
    	m.addAttribute("top2ConsistentStudents",regRepo.top2ConsistentStudentsAcrossAllSemesters());
    	m.addAttribute("avgPercentage",regRepo.avgPercentageFromRecentSem(sem));
    	m.addAttribute("Marks",regRepo.avgMarksOfStudentsEachSubject());
    	return "Report";
    }
}
