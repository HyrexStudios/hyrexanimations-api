package es.hyrex.hyrexanimations.api.animation;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Represents a sound to play in the animation. Learn about this in <a href="https://docs.hyrex.es/hyrex-animations/playing-sounds">Sounds</a>.
 *
 * @since 1.1.0
 */
public class AnimationSound {
    private final @NotNull String namespace;
    private final @NotNull String value;
    private final @NotNull String source;
    private final float pitch;

    /**
     * @param namespace The namespace of the sound. (Minecraft default: "minecraft")
     * @param value     The sound name.
     * @param source    The sound source. (See <a href="https://javadoc.io/doc/net.kyori/adventure-api/latest/net/kyori/adventure/sound/Sound.Source.html">Sounds Sources</a>)
     * @param pitch     A number from 0 to 2 determining the pitch the sound will be played at.
     */
    public AnimationSound(
            @NotNull String namespace,
            @NotNull String value,
            @NotNull String source,
            float pitch
    ) {
        this.namespace = namespace;
        this.value = value;
        this.source = source;
        this.pitch = pitch;
    }

    /**
     * Gets the sound namespace.
     * @return The sound namespace.
     */
    public @NotNull String getNamespace() {
        return namespace;
    }

    /**
     * Gets the sound name.
     * @return The sound name.
     */
    public @NotNull String getValue() {
        return value;
    }

    /**
     * Gets the sound source.
     * @return The sound source.
     */
    public @NotNull String getSource() {
        return source;
    }

    /**
     * Gets the sound pitch.
     * @return The sound pitch.
     */
    public float getPitch() {
        return pitch;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (AnimationSound) obj;
        return Objects.equals(this.namespace, that.namespace) &&
                Objects.equals(this.value, that.value) &&
                Objects.equals(this.source, that.source) &&
                Float.floatToIntBits(this.pitch) == Float.floatToIntBits(that.pitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, value, source, pitch);
    }

    @Override
    public String toString() {
        return "AnimationSound[" +
                "namespace=" + namespace + ", " +
                "value=" + value + ", " +
                "source=" + source + ", " +
                "pitch=" + pitch + ']';
    }
}
