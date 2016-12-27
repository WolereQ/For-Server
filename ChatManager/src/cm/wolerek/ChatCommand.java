package cm.wolerek;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChatCommand implements CommandExecutor{

	public static int chat = 0;
	
	public boolean onCommand(CommandSender snd, Command cmd, String l, String[] args) {

		if(snd.isOp()){
		
		if(cmd.getName().equalsIgnoreCase("voucher")){
			
			
			Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "VOUNCHER" + ChatColor.DARK_GRAY + "»" + 
			ChatColor.RED + args[0]  + " wpisz ten kod na stronie:http://www.97328.enmc.pl/ w zak³adce z ranga i trybem vouncher");
			
			
		}
		
		}
		
		if(snd.isOp()){
		
		if(cmd.getName().equalsIgnoreCase("chat")){
			
			
		
				
				
				if(args[0].equalsIgnoreCase("on")){
					
					if(chat == 1){
						
						snd.sendMessage(ChatColor.DARK_RED + "Chat jest juz wlaczony!");
						
					}else{
						chat = 1;
						Bukkit.broadcastMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Chat zostal wlaczony!");
					}
					
				}
				
				if(args[0].equalsIgnoreCase("off")){
					
					if(chat == 0){
						
						snd.sendMessage(ChatColor.DARK_RED + "Chat jest juz wylaczony!");
						
					}else{
						chat = 0;
						Bukkit.broadcastMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Chat zostal wylaczony!");
					}
					
				}
				
				if(args[0].equalsIgnoreCase("wyczysc")){
					
					for(int i = 0; i<100; i++){
						
						Bukkit.broadcastMessage("");
						
					}
					
					Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Wyczyszczono czat");
					
				}
				
				
			}
			
		
		
		}else{
			snd.sendMessage(ChatColor.DARK_RED + "Brak Uprawnien!");
			return true;
		}
		
		return true;
	}

}
