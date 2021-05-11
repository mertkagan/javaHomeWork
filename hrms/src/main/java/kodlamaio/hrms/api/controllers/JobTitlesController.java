package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTİtleService;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/job-titles/")
public class JobTitlesController {
	
	private JobTİtleService jobTİtleService;

	@Autowired
	public JobTitlesController(JobTİtleService jobTİtleService) {
		super();
		this.jobTİtleService = jobTİtleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return jobTİtleService.getAll();
	}
	
	

}
