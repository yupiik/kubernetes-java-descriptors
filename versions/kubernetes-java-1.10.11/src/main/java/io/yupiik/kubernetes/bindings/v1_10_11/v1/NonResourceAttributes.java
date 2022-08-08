package io.yupiik.kubernetes.bindings.v1_10_11.v1;

import io.yupiik.kubernetes.bindings.v1_10_11.Validable;
import io.yupiik.kubernetes.bindings.v1_10_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonResourceAttributes implements Validable<NonResourceAttributes> {
    private String path;
    private String verb;

    public NonResourceAttributes() {
        // no-op
    }

    public NonResourceAttributes(final String path,
                                 final String verb) {
        // no-op
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(final String verb) {
        this.verb = verb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                path,
                verb);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NonResourceAttributes)) {
            return false;
        }
        final NonResourceAttributes __otherCasted = (NonResourceAttributes) __other;
        return Objects.equals(path, __otherCasted.path) &&
            Objects.equals(verb, __otherCasted.verb);
    }

    public NonResourceAttributes path(final String path) {
        this.path = path;
        return this;
    }

    public NonResourceAttributes verb(final String verb) {
        this.verb = verb;
        return this;
    }

    @Override
    public NonResourceAttributes validate() {
        return this;
    }
}
