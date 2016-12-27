package cm.wolerek;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	
	public void onEnable(){
		getCommand("chat").setExecutor(new ChatCommand());
		getCommand("voucher").setExecutor(new ChatCommand());
		Bukkit.getPluginManager().registerEvents(new OnChat(), this);
		
	}
	
	
	public void onDisable(){
		
	}
	
}
