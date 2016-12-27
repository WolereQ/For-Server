package cm.wolerek;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnChat implements Listener{

	
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent evt){
		
		if(ChatCommand.chat == 0){
			if(!evt.getPlayer().isOp()){
	
			evt.setMessage("");
			evt.setCancelled(true);
			evt.getPlayer().sendMessage(ChatColor.DARK_RED + "Czat jest wylaczony!");
			return;
			}
			
		}
		
		
		
	}
}
