package cn.handyplus.monster.event;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * MonsterPlus的怪物升级
 *
 * @author handy
 */
public class MonsterPlusUpLevelEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private final LivingEntity entity;
    private final Player player;
    private final int oldLevel;
    private final int newLevel;

    public MonsterPlusUpLevelEvent(LivingEntity entity, Player player, int oldLevel, int newLevel) {
        this.entity = entity;
        this.player = player;
        this.oldLevel = oldLevel;
        this.newLevel = newLevel;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * 获取怪物
     *
     * @return 怪物
     */
    public LivingEntity getEntity() {
        return this.entity;
    }

    /**
     * 获取攻击玩家
     *
     * @return 怪物
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * 获取之前等级
     *
     * @return 之前等级
     */
    public int getOldLevel() {
        return this.oldLevel;
    }

    /**
     * 获取现在等级
     *
     * @return 现在等级
     */
    public int getNewLevel() {
        return this.newLevel;
    }

}