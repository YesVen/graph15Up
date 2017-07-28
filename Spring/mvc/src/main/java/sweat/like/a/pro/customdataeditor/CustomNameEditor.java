package sweat.like.a.pro.customdataeditor;

import java.beans.PropertyEditorSupport;

/*
 * This custom editor will edit the field "Name" from bean and prepend "part-" to it 
 */
public class CustomNameEditor extends PropertyEditorSupport{
	
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException 
	{
		 if(name.startsWith("part-"))
		 {
			 setValue(name);
		 }
		 else
		 {
			 setValue("part-"+ name);
		 }
	}
	
	
}
