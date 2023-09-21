package es.hyrex.hyrexanimations.api.events;

import es.hyrex.hyrexanimations.api.animation.AnimationType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Called when an animation finishes.
 *
 * @since 1.1.0
 */
public class AnimationFinishEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final String animationName;
    private final AnimationType type;
    private final List<Player> players;

    public AnimationFinishEvent(String animationName, AnimationType type, Collection<Player> players) {
        this.animationName = animationName;
        this.type = type;
        this.players = new ArrayList<>(players);
    }

    /**
     * Gets the animation name.
     * @return The animation name.
     */
    public String getAnimationName() {
        return animationName;
    }

    /**
     * Gets the animation type.
     * @return The animation type.
     */
    public AnimationType getType() {
        return type;
    }

    /**
     * Gets the players who saw the animation.
     * <p>
     * <i>(If any player disconnected while showing the animation and didn't reconnect, will not appear in this list</i>
     * @return The players who saw the animation.
     */
    public List<Player> getPlayers() {
        return players;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
