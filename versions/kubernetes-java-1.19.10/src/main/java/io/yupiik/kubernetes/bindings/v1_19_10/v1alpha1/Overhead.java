package io.yupiik.kubernetes.bindings.v1_19_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_10.Validable;
import io.yupiik.kubernetes.bindings.v1_19_10.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Overhead implements Validable<Overhead>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (podFixed != null ? "\"podFixed\":" + podFixed : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
