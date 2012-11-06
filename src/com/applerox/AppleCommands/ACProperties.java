package com.applerox.AppleCommands;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ACProperties extends Properties {
	static final long serialUID = 0L;
	private String fileName;
	
	public ACProperties(String file) {
		this.fileName = file;
	}
	
	public void loadFile() {
		File file = new File(this.fileName);
		if (file.exists()) {
			try {
				load(new FileInputStream(this.fileName));
			} catch (IOException e) {
				AppleCommands.logger.severe("[AppleCommands] Error loading file " + this.fileName + "!");
				e.printStackTrace();
			}
		}
	}
	
	public void saveFile() {
		
	}
	
}
