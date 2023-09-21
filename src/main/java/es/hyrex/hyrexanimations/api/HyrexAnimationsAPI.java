package es.hyrex.hyrexanimations.api;

import es.hyrex.hyrexanimations.api.animation.Animation;
import es.hyrex.hyrexanimations.api.animation.Condition;
import es.hyrex.hyrexanimations.api.animation.DisplayType;
import es.hyrex.hyrexanimations.api.exception.AnimationNotFoundException;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

/**
 * With the <b>HyrexAnimations API</b> you can show animations to your users from your plugin.
 * <br>
 * <b>ALL METHODS IN THIS API MUST BE CALLED SYNCHRONOUSLY!!!</b>
 * <br>
 * <h2>How to get it</h2>
 * <pre>{@code
 * // When the plugin is enabled, the instance of the API will be registered in the Bukkit Services Manager.
 * RegisteredServiceProvider<HyrexAnimationsAPI> provider = Bukkit.getServicesManager().getRegistration(HyrexAnimationsAPI.class);
 *
 * if (provider != null) {
 *     HyrexAnimationsAPI api = provider.getProvider();
 * }
 * }
 * </pre>
 */
public interface HyrexAnimationsAPI {

    /**
     * Gets the animations that are registered in the plugin.
     *
     * @return A set with the animations names.
     * @since 1.1.0
     */
    Set<String> getAnimations();

    /**
     * Shows a registered animation to all the players in the server.
     *
     * @param animationName The animation name.
     * @param displayType The display type.
     * @throws AnimationNotFoundException If the animation was not found.
     * @return True if the animation will be shown.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull String animationName, @NotNull DisplayType displayType) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to all the players in the server who pass the condition.
     *
     * @param animationName The animation name.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull String animationName, @NotNull DisplayType displayType, @NotNull Condition condition) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to a specific player.
     *
     * @param animationName The animation name.
     * @param player The player.
     * @param displayType The display type.
     * @throws AnimationNotFoundException If the animation was not found.
     * @return True if the animation will be shown.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull String animationName, @NotNull Player player, @NotNull DisplayType displayType) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to a specific player if pass the condition.
     *
     * @param animationName The animation name.
     * @param player The player.
     * @param displayType The display type.
     * @param condition The condition.
     * @return True if the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull String animationName, @NotNull Player player, @NotNull DisplayType displayType, @NotNull Condition condition) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to all the players in the world.
     *
     * @param animationName The animation name.
     * @param world The world.
     * @param displayType The display type.
     * @return A list with the players who are in the world and the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull String animationName, @NotNull World world, @NotNull DisplayType displayType) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to all the players in the world who pass the condition.
     *
     * @param animationName The animation name.
     * @param world The world.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull String animationName, @NotNull World world, @NotNull DisplayType displayType, @NotNull Condition condition) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to a list of players.
     *
     * @param animationName The animation name.
     * @param players The players list.
     * @param displayType The display type.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull String animationName, @NotNull Collection<Player> players, @NotNull DisplayType displayType) throws AnimationNotFoundException;

    /**
     * Shows a registered animation to a list of players who pass the condition.
     *
     * @param animationName The animation name.
     * @param players The players list.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @throws AnimationNotFoundException If the animation was not found.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull String animationName, @NotNull Collection<Player> players, @NotNull DisplayType displayType, @NotNull Condition condition) throws AnimationNotFoundException;

    /**
     * Shows an animation to all the players in the server.
     *
     * @param animation The animation.
     * @param displayType The display type.
     * @return True if the animation will be shown.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull Animation animation, @NotNull DisplayType displayType);

    /**
     * Shows an animation to all the players in the server who pass the condition.
     *
     * @param animation The animation.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull Animation animation, @NotNull DisplayType displayType, @NotNull Condition condition);

    /**
     * Shows an animation to a specific player.
     *
     * @param animation The animation.
     * @param player The player.
     * @param displayType The display type.
     * @return True if the animation will be shown.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull Animation animation, @NotNull Player player, @NotNull DisplayType displayType);

    /**
     * Shows an animation to a specific player if pass the condition.
     *
     * @param animation The animation.
     * @param player The player.
     * @param displayType The display type.
     * @param condition The condition.
     * @return True if the animation will be shown.
     * @since 1.1.0
     */
    boolean showAnimation(@NotNull Animation animation, @NotNull Player player, @NotNull DisplayType displayType, @NotNull Condition condition);

    /**
     * Shows an animation to all the players in the world.
     *
     * @param animation The animation.
     * @param world The world.
     * @param displayType The display type.
     * @return A list with the players who are in the world and the animation will be shown.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull Animation animation, @NotNull World world, @NotNull DisplayType displayType);

    /**
     * Shows an animation to all the players in the world who pass the condition.
     *
     * @param animation The animation.
     * @param world The world.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull Animation animation, @NotNull World world, @NotNull DisplayType displayType, @NotNull Condition condition);

    /**
     * Shows an animation to a list of players.
     *
     * @param animation The animation.
     * @param players The players list.
     * @param displayType The display type.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull Animation animation, @NotNull Collection<Player> players, @NotNull DisplayType displayType);

    /**
     * Shows an animation to a list of players who pass the condition.
     *
     * @param animation The animation.
     * @param players The players list.
     * @param displayType The display type.
     * @param condition The condition.
     * @return A list with the players who pass the condition and the animation will be shown.
     * @since 1.1.0
     */
    @NotNull Collection<Player> showAnimation(@NotNull Animation animation, @NotNull Collection<Player> players, @NotNull DisplayType displayType, @NotNull Condition condition);
}
