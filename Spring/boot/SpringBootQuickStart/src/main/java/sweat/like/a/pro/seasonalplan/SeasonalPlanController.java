package sweat.like.a.pro.seasonalplan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeasonalPlanController {

	@Autowired
	private SeasonalPlanService planService;
	
	@RequestMapping("/seasonalplans")
	public List<SeasonalPlan> getSeasonalPlans(){
		return planService.getSeasonalPlans();
	}
	
	@RequestMapping("/seasonalplans/{id}")
	public SeasonalPlan getSeasonalPlan(@PathVariable String id){
		return planService.getSeasonalPlan(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/seasonalplans")
	public String addSeasonalPlan(@RequestBody SeasonalPlan plan){
		return planService.addSeasonalPlan(plan);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/seasonalplans/{id}")
	public String updateSeasonalPlan(@RequestBody SeasonalPlan plan, @PathVariable String id){
		return planService.updateSeasonalPlan(plan, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/seasonalplans/{id}")
	public String deleteSeasonalPlan(@PathVariable String id){
		return planService.deleteSeasonalPlan(id);
	}
	
}
