package org.encinet.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // 插件启用时执行的代码
        // System.out.println("Hello World");
        getLogger().info("这是一个普通的日志");
        getLogger().warning("这是一个警告的日志");
    }

    @Override
    public void onDisable() {
        // 插件卸载时执行的代码
        getLogger().info("这是一个普通的日志");
    }
}
