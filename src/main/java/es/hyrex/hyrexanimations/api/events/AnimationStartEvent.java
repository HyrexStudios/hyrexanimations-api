package es.hyrex.hyrexanimations.api.events;

import es.hyrex.hyrexanimations.api.animation.AnimationType;
import es.hyrex.hyrexanimations.api.animation.Condition;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Called when an animation starts.
 * <p>
 * You can cancel the event to prevent the animation from starting, or modify the players list.
 *
 * @since 1.1.0
 */
public class AnimationStartEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancel = false;

    private final String animationName;
    private final AnimationType type;
    private final List<Player> players;
    private final @Nullable Condition condition;

    public AnimationStartEvent(String animationName, AnimationType type, Collection<Player> players, @Nullable Condition condition) {
        this.animationName = animationName;
        this.type = type;
        this.players = new ArrayList<>(players);
        this.condition = condition;
    }

    public AnimationStartEvent(String animationName, AnimationType type, Collection<Player> players) {
        this(animationName, type, players, null);
    }

    /**
     * Gets the animation name.
     *
     * @return The animation name.
     */
    public String getAnimationName() {
        return animationName;
    }

    /**
     * Gets the animation type.
     *
     * @return The animation type.
     */
    public AnimationType getType() {
        return type;
    }

    /**
     * Gets the players who will see the animation.
     *
     * @return The players who will see the animation.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Gets the condition.
     *
     * @return The condition or null if there is no condition.
     */
    public @Nullable Condition getCondition() {
        return condition;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
