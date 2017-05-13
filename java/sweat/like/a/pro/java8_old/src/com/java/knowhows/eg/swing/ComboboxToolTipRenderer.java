package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.swing;

import java.awt.Component;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ComboboxToolTipRenderer extends DefaultListCellRenderer
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public Component getListCellRendererComponent(JList list, Object value,
                        int index, boolean isSelected, boolean cellHasFocus) 
	{

        JComponent comp = (JComponent) super.getListCellRendererComponent(list,
                value, index, isSelected, cellHasFocus);

        if (-1 < index && null != value)
        {
        	if(comp instanceof JComboBox)
        	{
        		list.setToolTipText("No operations to display at this time. No operations to display at this time.");
        	}
        }
        return comp;
    }
	
	public static void main(String[] args) 
	{
		final List<String> list = new ArrayList<String>(){{
			add("dnyanesh");
			//System.out.println(list); ----this wont compile
		}};
		
		
	}
}
