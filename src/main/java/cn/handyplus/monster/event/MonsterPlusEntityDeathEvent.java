package cn.handyplus.monster.event;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * MonsterPlus的怪物死亡
 *
 * @author handy
 */
public class MonsterPlusEntityDeathEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private final LivingEntity entity;
    private final List<ItemStack> drops;
    private int dropExp;

    public MonsterPlusEntityDeathEvent(LivingEntity entity, List<ItemStack> drops, int dropExp) {
        this.entity = entity;
        this.drops = drops;
        this.dropExp = dropExp;
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
     * 获取掉落经验
     *
     * @return 掉落经验
     */
    public int getDroppedExp() {
        return this.dropExp;
    }

    /**
     * 设置掉落经验
     *
     * @param exp 掉落经验
     */
    public void setDroppedExp(int exp) {
        this.dropExp = exp;
    }

    /**
     * 获取掉落物
     *
     * @return 掉落物
     */
    public List<ItemStack> getDrops() {
        return this.drops;
    }

}