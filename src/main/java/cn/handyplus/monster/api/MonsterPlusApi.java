package cn.handyplus.monster.api;

import org.bukkit.entity.LivingEntity;

/**
 * API
 *
 * @author handy
 * @since 1.0.6
 */
public class MonsterPlusApi {

    private MonsterPlusApi() {
    }

    private static final MonsterPlusApi INSTANCE = new MonsterPlusApi();

    public static MonsterPlusApi getInstance() {
        return INSTANCE;
    }

    /**
     * 获取怪物等级
     *
     * @param entity 怪物
     */
    public int getLevel(LivingEntity entity) {
        return 0;
    }

    /**
     * 获取是否本插件怪物
     *
     * @param entity 怪物
     */
    public boolean isMonsterPlus(LivingEntity entity) {
        return true;
    }

    /**
     * 获取本插件怪物名称
     *
     * @param entity 怪物
     * @return 怪物名称
     */
    public String getMonsterName(LivingEntity entity) {
        return null;
    }

}
