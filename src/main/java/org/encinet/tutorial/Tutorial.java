package org.encinet.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // 插件启用时执行的代码
        // System.out.println("Hello World");
        getLogger().info("这是一个普通的日志");
        getLogger().warning("这是一个警告的日志");
        if (Bukkit.getPluginCommand("tutorial") != null) {
            Objects.requireNonNull(Bukkit.getPluginCommand("tutorial")).setExecutor(this);
        }
    }

    @Override
    public void onDisable() {
        // 插件卸载时执行的代码
        getLogger().info("这是一个普通的日志");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("tutorial.main")) {
                    player.sendMessage("因为你拥有tutorial.main权限，所以你收到了这条消息");
                    return true;
                } else { player.sendMessage("你没有权限执行此命令!"); return false;}
            } else { sender.sendMessage("只有玩家才能执行此命令"); return false;}
        }
}
