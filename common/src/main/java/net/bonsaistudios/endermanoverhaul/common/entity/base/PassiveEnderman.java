package net.bonsaistudios.endermanoverhaul.common.entity.base;

import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Supplier;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class PassiveEnderman extends BaseEnderman {
    private final EndermanType type;

    public PassiveEnderman(EntityType<? extends BaseEnderman> entityType, World level, EndermanType type) {
        super(entityType, level, type);
        this.type = type;
        this.stepHeight = 1.0F;
        this.setPathfindingPenalty(PathNodeType.WATER, -1.0F);
    }

    @Override
    public int getAngerTime() {
        return 0;
    }

    @Override
    public void setAngerTime(int i) {
    }

    @Nullable
    @Override
    public UUID getAngryAt() {
        return null;
    }

    @Override
    public void setAngryAt(@Nullable UUID uUID) {
    }

    @Override
    public void chooseRandomAngerTime() {
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D, 0.0F));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }
    public static Supplier<DefaultAttributeContainer.Builder> createAttributes() {
        return () -> createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.20000001192092896)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0.0)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 64.0);
    }
}
