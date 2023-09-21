package es.hyrex.hyrexanimations.api.animation;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Represents a command to execute in the animation.
 *
 * @since 1.1.0
 */
public class AnimationCommand {
    private final @NotNull Type type;
    private final @NotNull String command;

    /**
     * @param type    The command type.
     * @param command The command to execute.
     */
    public AnimationCommand(@NotNull Type type, @NotNull String command) {
        this.type = type;
        this.command = command;
    }

    /**
     * Gets the command type.
     * @return The command type.
     */
    public @NotNull Type getType() {
        return type;
    }

    /**
     * Gets the command to execute.
     * @return The command to execute.
     */
    public @NotNull String getCommand() {
        return command;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (AnimationCommand) obj;
        return Objects.equals(this.type, that.type) &&
                Objects.equals(this.command, that.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, command);
    }

    @Override
    public String toString() {
        return "AnimationCommand[" +
                "type=" + type + ", " +
                "command=" + command + ']';
    }


    /**
     * Represents a command type.
     *
     * @since 1.1.0
     */
    public enum Type {
        /**
         * Sends a message to the player using <a href="https://docs.advntr.dev/minimessage/format.html">MiniMessage format</a>.
         */
        MESSAGE,
        /**
         * Sends a console command.
         */
        CONSOLE,
        /**
         * Executes the command as the player.
         */
        PLAYER
    }
}
