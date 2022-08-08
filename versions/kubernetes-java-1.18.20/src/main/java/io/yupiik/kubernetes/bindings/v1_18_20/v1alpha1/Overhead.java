package io.yupiik.kubernetes.bindings.v1_18_20.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import io.yupiik.kubernetes.bindings.v1_18_20.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Overhead implements Validable<Overhead> {
    private JsonObject podFixed;

    public Overhead() {
        // no-op
    }

    public Overhead(final JsonObject podFixed) {
        // no-op
    }

    public JsonObject getPodFixed() {
        return podFixed;
    }

    public void setPodFixed(final JsonObject podFixed) {
        this.podFixed = podFixed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                podFixed);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Overhead)) {
            return false;
        }
        final Overhead __otherCasted = (Overhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }

    public Overhead podFixed(final JsonObject podFixed) {
        this.podFixed = podFixed;
        return this;
    }

    @Override
    public Overhead validate() {
        return this;
    }
}
