package es.hyrex.hyrexanimations.api.animation;

import es.hyrex.hyrexanimations.api.HyrexAnimationsAPI;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents an animation.
 * <p>
 * <b>Creating an animation here does not register it to the plugin, is just for {@link HyrexAnimationsAPI} usage!</b>
 *
 * @since 1.0.0
 */
public class Animation {
    private final @NotNull String name;
    private final @NotNull List<String> frameList;
    private final @NotNull Double framesPerSecond;
    private final boolean useMiniMessage;
    private final boolean usePlaceholderAPI;
    private final @NotNull Map<Integer, List<AnimationSound>> sounds;
    private final @NotNull Map<Integer, List<AnimationCommand>> commands;

    /**
     * @param name              The animation name.
     * @param frameList         The list with the frames.
     * @param framesPerSecond   The frames per second.
     * @param useMiniMessage    If the animation uses <a href="https://docs.advntr.dev/minimessage/format.html">MiniMessage</a>.
     * @param usePlaceholderAPI If the animation uses <a href="https://www.spigotmc.org/resources/placeholderapi.6245/">PlaceholderAPI placeholders</a>.
     * @param sounds            The sounds to play.
     * @param commands          The commands to execute.
     */
    public Animation(
            @NotNull String name,
            @NotNull List<String> frameList,
            @NotNull Double framesPerSecond,
            boolean useMiniMessage,
            boolean usePlaceholderAPI,
            @NotNull Map<Integer, List<AnimationSound>> sounds,
            @NotNull Map<Integer, List<AnimationCommand>> commands
    ) {
        this.name = name;
        this.frameList = frameList;
        this.framesPerSecond = framesPerSecond;
        this.useMiniMessage = useMiniMessage;
        this.usePlaceholderAPI = usePlaceholderAPI;
        this.sounds = sounds;
        this.commands = commands;
    }

    /**
     * Creates an animation without sounds and commands.
     *
     * @param name              The animation name.
     * @param frameList         The list with the frames.
     * @param framesPerSecond   The frames per second.
     * @param useMiniMessage    If the animation uses <a href="https://docs.advntr.dev/minimessage/format.html">MiniMessage</a>.
     * @param usePlaceholderAPI If the animation uses <a href="https://www.spigotmc.org/resources/placeholderapi.6245/">PlaceholderAPI placeholders</a>.
     * @since 1.1.0
     */
    public Animation(
            @NotNull String name,
            @NotNull List<String> frameList,
            @NotNull Double framesPerSecond,
            boolean useMiniMessage,
            boolean usePlaceholderAPI) {
        this(name, frameList, framesPerSecond, useMiniMessage, usePlaceholderAPI, Map.of(), Map.of());
    }

    /**
     * Gets the animation name.
     * @return The animation name.
     */
    public @NotNull String getName() {
        return name;
    }

    /**
     * Gets the frame list.
     * @return The frame list.
     */
    public @NotNull List<String> getFrameList() {
        return frameList;
    }

    /**
     * Gets the frames per second.
     * @return The frames per second.
     */
    public @NotNull Double getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     * Gets if the animation uses <a href="https://docs.advntr.dev/minimessage/format.html">MiniMessage</a>.
     * @return If the animation uses MiniMessage.
     */
    public boolean getUseMiniMessage() {
        return useMiniMessage;
    }

    /**
     * Gets if the animation uses <a href="https://www.spigotmc.org/resources/placeholderapi.6245/">PlaceholderAPI placeholders</a>.
     * @return If the animation uses PlaceholderAPI.
     */
    public boolean getUsePlaceholderAPI() {
        return usePlaceholderAPI;
    }

    /**
     * Gets the sounds to play.
     * @return The sounds to play.
     */
    public @NotNull Map<Integer, List<AnimationSound>> getSounds() {
        return sounds;
    }

    /**
     * Gets the commands to execute.
     * @return The commands to execute.
     */
    public @NotNull Map<Integer, List<AnimationCommand>> getCommands() {
        return commands;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Animation) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.frameList, that.frameList) &&
                Objects.equals(this.framesPerSecond, that.framesPerSecond) &&
                this.useMiniMessage == that.useMiniMessage &&
                this.usePlaceholderAPI == that.usePlaceholderAPI &&
                Objects.equals(this.sounds, that.sounds) &&
                Objects.equals(this.commands, that.commands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frameList, framesPerSecond, useMiniMessage, usePlaceholderAPI, sounds, commands);
    }

    @Override
    public String toString() {
        return "Animation[" +
                "name=" + name + ", " +
                "frameList=" + frameList + ", " +
                "framesPerSecond=" + framesPerSecond + ", " +
                "useMiniMessage=" + useMiniMessage + ", " +
                "usePlaceholderAPI=" + usePlaceholderAPI + ", " +
                "sounds=" + sounds + ", " +
                "commands=" + commands + ']';
    }

}
