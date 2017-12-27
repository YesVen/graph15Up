package sweat.like.a.pro.rawmaterial;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RawMaterialController {

	@RequestMapping("/rawmaterials")
	public List<RawMaterial> getRawMaterials(){
		return Arrays.asList(
			new RawMaterial("1", "Test1","test 1 item description","dollar"),
			new RawMaterial("2", "Test2","test 2 item description","euro"),
			new RawMaterial("3", "Test3","test 3 item description","rupee"),
			new RawMaterial("4", "Test4","test 4 item description","dollar"),
			new RawMaterial("5", "Test5","test 5 item description","rupee")
		);
	}
}
