package fr.julesdeveloppeur.PluginJHG;

import org.bukkit.plugin.java.JavaPlugin;

import fr.julesdeveloppeur.PluginJHG.commands.CommmandTest;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Le plugin est prêt !");
		getCommand("test").setExecutor(new CommmandTest());
	}
	
	@Override
	public void onDisable() {
		System.out.println("Le plugin vient de s'éteidre !");
	}

}
