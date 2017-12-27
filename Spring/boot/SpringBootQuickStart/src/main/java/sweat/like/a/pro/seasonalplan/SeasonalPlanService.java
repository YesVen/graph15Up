package sweat.like.a.pro.seasonalplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class SeasonalPlanService {

	List<SeasonalPlan> seasonalPlans = new ArrayList<SeasonalPlan>(Arrays.asList(
			new SeasonalPlan("Winter","1", "10 Million", "23%" ),
			new SeasonalPlan("Summer","2", "20 Million", "23%" ),
			new SeasonalPlan("Autumn","3", "50 Million", "23%" )
			));
	
	 public List<SeasonalPlan> getSeasonalPlans(){
		 return seasonalPlans;
	 }
	 
	 
	 public SeasonalPlan getSeasonalPlan(String id){
		 return seasonalPlans.stream().filter(plan -> plan.getId().equals(id)).findFirst().get();
	 }


	public String addSeasonalPlan(SeasonalPlan plan) {
		seasonalPlans.add(plan);
		return "Seasonal Plan with id "+ plan.getId() +" added successfully";
	}
	
	public String updateSeasonalPlan(SeasonalPlan plan, String id){
		
	/*
	 * How to perform replace operation on streams????	
	 */
		//seasonalPlans.stream().map( input -> input.getId().equals(id) ? plan : input).collect(Collectors.toList());
		
		for(int i=0; i< seasonalPlans.size(); i++){
			SeasonalPlan sp = seasonalPlans.get(i);
			if(id.equals(sp.getId())){
				seasonalPlans.set(i, plan);
			}
		}
		
		return "Seasonal Plan with id "+ id +" updated successfully";
	}


	public String deleteSeasonalPlan(String id) {
		seasonalPlans = seasonalPlans.stream().filter( p -> ! p.getId().equals(id)).collect(Collectors.toList());
		return "Seasonal Plan with id "+ id +" deleted successfully";
	}
}
