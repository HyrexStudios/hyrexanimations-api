package es.hyrex.hyrexanimations.api.animation;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Conditions let you select to whom the animation will be shown. (See <a href="https://docs.hyrex.es/hyrex-animations/conditions">Conditions</a>)
 */
public class Condition {
    private final @NotNull String id;
    private final @NotNull Type type;
    private final @NotNull String value;

    /**
     * @param id    The id of the condition.
     * @param type  The type of the condition.
     * @param value The value of the condition.
     */
    public Condition(@NotNull String id, @NotNull Type type, @NotNull String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    /**
     * Creates a new condition with the id "custom". Useful for temporary conditions.
     *
     * @param type  The type of the condition.
     * @param value The value of the condition.
     */
    public Condition(@NotNull Type type, @NotNull String value) {
        this("custom", type, value);
    }

    /**
     * Gets the condition id.
     * @return The condition id.
     */
    public @NotNull String getId() {
        return id;
    }

    /**
     * Gets the condition type.
     * @return The condition type.
     */
    public @NotNull Type getType() {
        return type;
    }

    /**
     * Gets the condition value.
     * @return The condition value.
     */
    public @NotNull String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Condition) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.type, that.type) &&
                Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, value);
    }

    @Override
    public String toString() {
        return "Condition[" +
                "id=" + id + ", " +
                "type=" + type + ", " +
                "value=" + value + ']';
    }


    /**
     * Represents a condition type.
     *
     * @since 1.1.0
     */
    public enum Type {
        /**
         * Will be shown if the player has the permission.
         */
        HAS_PERMISSION,
        /**
         * Will be shown if the player does not have the permission.
         */
        NOT_HAVE_PERMISSION,
        /**
         * Will be shown if the player passes the expression. (See <a href="https://docs.hyrex.es/hyrex-animations/expressions">Expressions</a>)
         */
        EXPRESSION
    }
}