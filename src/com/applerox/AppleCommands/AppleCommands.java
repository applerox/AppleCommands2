package com.applerox.AppleCommands;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class AppleCommands extends JavaPlugin {
	
	public AppleCommands plugin;
	public static Logger logger = Logger.getLogger("Minecraft");
	
	public static File dataFolder;
	public static File configFile;
	public static File playerdataFile;
	public static File warpsFile;
	public static File backpacksFile;
	
	
	@Override
	public void onEnable() {
		
		dataFolder = this.getDataFolder();
		new File(dataFolder.getAbsolutePath()).mkdir();
		
		configFile = new File(dataFolder, "config.yml");
		playerdataFile = new File(dataFolder, "players.yml");
		warpsFile = new File(dataFolder, "warps.yml");
		backpacksFile = new File(dataFolder, "backpacks.dat");

		if (!configFile.exists())
			try {
				boolean cSuccess = configFile.createNewFile();
				if (!cSuccess) logger.severe("[AppleCommands] Error creating config file!");
				else logger.info("[AppleCommands] Created config file!");
			} catch (IOException e) {
				logger.severe("[AppleCommands] Error creating config file!");
				e.printStackTrace();
			};
		if (!playerdataFile.exists())
			try {
				boolean pdfSuccess = playerdataFile.createNewFile();
				if (!pdfSuccess) logger.severe("[AppleCommands] Error creating playerdata file!");
				else logger.info("[AppleCommands] Created playerdata file!");
			} catch (IOException e) {
				logger.severe("[AppleCommands] Error creating playerdata file!");
				e.printStackTrace();
			};
		if (!warpsFile.exists())
			try {
				boolean wSuccess = warpsFile.createNewFile();
				if (!wSuccess) logger.severe("[AppleCommands] Error creating warps file!");
				else logger.info("[AppleCommands] Created warps file!");
			} catch (IOException e) {
				logger.severe("[AppleCommands] Error creating warps file!");
				e.printStackTrace();
			};
		if (!backpacksFile.exists())
			try {
				boolean bSuccess = backpacksFile.createNewFile();
				if (!bSuccess) logger.severe("[AppleCommands] Error creating backpacks file!");
				else logger.info("[AppleCommands] Created backpacks file!");
			} catch (IOException e) {
				logger.severe("[AppleCommands] Error creating backpacks file!");
				e.printStackTrace();
			};
		
		Settings.loadMain(this);
		
		logger.info("[AppleCommands] Enabled plugin version " + this.getDescription().getVersion());
	}
	
}
