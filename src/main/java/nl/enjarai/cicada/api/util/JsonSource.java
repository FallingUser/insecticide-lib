package nl.enjarai.cicada.api.util;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;

/**
 * A source of json data to be decoded. May return an {@link Optional#empty()} or
 * throw an {@link IOException}, {@link JsonSyntaxException} or {@link JsonIOException}.
 * <p>
 * Several static methods are provided to create a JsonSource from a file, url or string.
 * </p>
 */
public interface JsonSource {
    JsonSource EMPTY = Optional::empty;

    /**
     * Creates a JsonSource from a String, attempting to parse it as json.
     */
    static JsonSource fromString(String string) {
        return EMPTY;
    }

    /**
     * Creates a JsonSource from a file path given as a string, shortcut for {@link #fromFile(Path)}.
     */
    static JsonSource fromFile(String path) {
        return fromFile(Path.of(path));
    }

    /**
     * Creates a JsonSource from a file at the given {@link Path}.
     */
    static JsonSource fromFile(Path path) {
        return EMPTY;
    }

    /**
     * Creates a JsonSource from a valid URL in String form. Ensuring a proper connection is created and closed.
     * <p>
     * If the URL is invalid, this will return an {@link JsonSource#EMPTY} JsonSource.
     * If you need to ensure a valid source, use {@link #fromUrl(URL)}.
     * </p>
     */
    static JsonSource fromUrl(String url) {
        return EMPTY;
    }

    /**
     * Creates a JsonSource from a valid URL. Ensuring a proper connection is created and closed.
     * <p>
     * The alternative {@link #fromUrl(String)} is available if you
     * don't want to handle {@link MalformedURLException}s yourself.
     * </p>
     */
    static JsonSource fromUrl(URL url) {
        return EMPTY;
    }

    /**
     * Creates a JsonSource from a resource in the classpath. The resource is loaded using the
     * {@link ClassLoader#getResourceAsStream(String)} method.
     */
    static JsonSource fromResource(String path) {
        return EMPTY;
    }

    /**
     * Gets the json data from this source. Returns an {@link Optional} containing the json data,
     * or {@link Optional#empty()} if the source is empty. May throw an {@link IOException},
     * {@link JsonSyntaxException} or {@link JsonIOException} in the process.
     */
    Optional<JsonObject> get() throws IOException, JsonSyntaxException, JsonIOException;

    /**
     * Combines this JsonSource with another, using the other if this returns empty or throws an exception.
     * <p>
     * This ignores all exceptions thrown by this JsonSource,
     * any thrown by the other JsonSource will be passed on however.
     * </p>
     */
    default JsonSource or(JsonSource other) {
        return EMPTY;
    }
}
