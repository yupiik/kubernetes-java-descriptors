package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import io.yupiik.kubernetes.bindings.bundlebee.ValidationException;
import jakarta.json.JsonArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Patch implements Validable<Patch>, Exportable {
    private String descriptorName;
    private Boolean interpolate;
    private JsonArray patch;

    public Patch() {
        // no-op
    }

    public Patch(final String descriptorName,
                 final Boolean interpolate,
                 final JsonArray patch) {
        // no-op
    }

    public String getDescriptorName() {
        return descriptorName;
    }

    public void setDescriptorName(final String descriptorName) {
        this.descriptorName = descriptorName;
    }

    public Boolean getInterpolate() {
        return interpolate;
    }

    public void setInterpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
    }

    public JsonArray getPatch() {
        return patch;
    }

    public void setPatch(final JsonArray patch) {
        this.patch = patch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                descriptorName,
                interpolate,
                patch);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Patch)) {
            return false;
        }
        final Patch __otherCasted = (Patch) __other;
        return Objects.equals(descriptorName, __otherCasted.descriptorName) &&
            Objects.equals(interpolate, __otherCasted.interpolate) &&
            Objects.equals(patch, __otherCasted.patch);
    }

    public Patch descriptorName(final String descriptorName) {
        this.descriptorName = descriptorName;
        return this;
    }

    public Patch interpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
        return this;
    }

    public Patch patch(final JsonArray patch) {
        this.patch = patch;
        return this;
    }

    @Override
    public Patch validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (descriptorName != null ? "\"descriptorName\":\"" +  JsonStrings.escapeJson(descriptorName) + "\"" : ""),
                    (interpolate != null ? "\"interpolate\":" + interpolate : ""),
                    (patch != null ? "\"patch\":" + patch : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
