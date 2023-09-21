package es.hyrex.hyrexanimations.api.exception;

/**
 * This exception is thrown when the animation is not found.
 */
public class AnimationNotFoundException extends Exception {

    /**
     * Creates a new exception with the animation name.
     * @param animationName The animation name.
     */
    public AnimationNotFoundException(String animationName) {
        super("The animation \"" + animationName + "\" was not found.");
    }
}
