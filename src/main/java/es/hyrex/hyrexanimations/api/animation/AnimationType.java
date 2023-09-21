package es.hyrex.hyrexanimations.api.animation;

/**
 * Represents the animation type.
 */
public enum AnimationType {
    /**
     * The animation was created with the API.
     */
    API,
    /**
     * The animation is registered in the plugin as plain text animation.
     */
    PLAIN_TEXT,
    /**
     * The animation is registered in the plugin as a texture pack animation.
     */
    TEXTURE
}
