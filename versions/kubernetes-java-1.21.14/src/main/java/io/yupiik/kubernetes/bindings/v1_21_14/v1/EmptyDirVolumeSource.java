package io.yupiik.kubernetes.bindings.v1_21_14.v1;

import io.yupiik.kubernetes.bindings.v1_21_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_14.Validable;
import io.yupiik.kubernetes.bindings.v1_21_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EmptyDirVolumeSource implements Validable<EmptyDirVolumeSource>, Exportable {
    private String medium;
    private String sizeLimit;

    public EmptyDirVolumeSource() {
        // no-op
    }

    public EmptyDirVolumeSource(final String medium,
                                final String sizeLimit) {
        // no-op
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(final String medium) {
        this.medium = medium;
    }

    public String getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                medium,
                sizeLimit);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EmptyDirVolumeSource)) {
            return false;
        }
        final EmptyDirVolumeSource __otherCasted = (EmptyDirVolumeSource) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }

    public EmptyDirVolumeSource medium(final String medium) {
        this.medium = medium;
        return this;
    }

    public EmptyDirVolumeSource sizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }

    @Override
    public EmptyDirVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (medium != null ? "\"medium\":\"" +  JsonStrings.escapeJson(medium) + "\"" : ""),
                    (sizeLimit != null ? "\"sizeLimit\":\"" +  JsonStrings.escapeJson(sizeLimit) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
