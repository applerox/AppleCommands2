package com.applerox.AppleCommands;

@SuppressWarnings("unused")
public class Settings {
	static AppleCommands plugin;
	
	static String debugMode;
	static String primaryFormatCode;
	static String secondaryFormatCode;
		
	public static void loadMain(AppleCommands p) {
		Settings.plugin = p;
		
		String configFile = AppleCommands.configFile.getAbsolutePath();
		ACProperties properties = new ACProperties(configFile);
		properties.loadFile();
		
		debugMode = properties.getProperty("debugMode", "false");
		primaryFormatCode = properties.getProperty("primaryFormatCode", "§9");
		
	}
	
}
