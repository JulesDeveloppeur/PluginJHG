package fr.julesdeveloppeur.PluginJHG;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Le plugin est pr�t !");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Le plugin vient de s'�teidre !");
	}

}
