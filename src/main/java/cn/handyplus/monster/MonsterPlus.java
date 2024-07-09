package cn.handyplus.monster;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 */
public class MonsterPlus extends JavaPlugin {
    public static MonsterPlus INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

}