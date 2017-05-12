package com.java.knowhows.eg.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author DBE1
 *
 */
public class JavscriptInJS 
{

	public static void main(String[] args) throws ScriptException 
	{
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		System.out.println(engine.getClass().getName());
		
		System.out.println(engine.eval("function getVal(val){ return val*2} getVal(19)"));
		
		
		ScriptEngine nashornEngine = manager.getEngineByName("nashorn");
		
		String script = "var welcomeMsg = 'Hello World'; welcomeMsg;";
		Object result =  nashornEngine.eval(script);
		
		
		System.out.println(result);
	}

}
