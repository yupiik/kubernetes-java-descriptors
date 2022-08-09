package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_5.Validable;
import io.yupiik.kubernetes.bindings.v1_23_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetPersistentVolumeClaimRetentionPolicy implements Validable<StatefulSetPersistentVolumeClaimRetentionPolicy>, Exportable {
    private String whenDeleted;
    private String whenScaled;

    public StatefulSetPersistentVolumeClaimRetentionPolicy() {
        // no-op
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy(final String whenDeleted,
                                                           final String whenScaled) {
        // no-op
    }

    public String getWhenDeleted() {
        return whenDeleted;
    }

    public void setWhenDeleted(final String whenDeleted) {
        this.whenDeleted = whenDeleted;
    }

    public String getWhenScaled() {
        return whenScaled;
    }

    public void setWhenScaled(final String whenScaled) {
        this.whenScaled = whenScaled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                whenDeleted,
                whenScaled);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetPersistentVolumeClaimRetentionPolicy)) {
            return false;
        }
        final StatefulSetPersistentVolumeClaimRetentionPolicy __otherCasted = (StatefulSetPersistentVolumeClaimRetentionPolicy) __other;
        return Objects.equals(whenDeleted, __otherCasted.whenDeleted) &&
            Objects.equals(whenScaled, __otherCasted.whenScaled);
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy whenDeleted(final String whenDeleted) {
        this.whenDeleted = whenDeleted;
        return this;
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy whenScaled(final String whenScaled) {
        this.whenScaled = whenScaled;
        return this;
    }

    @Override
    public StatefulSetPersistentVolumeClaimRetentionPolicy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (whenDeleted != null ? "\"whenDeleted\":\"" +  JsonStrings.escapeJson(whenDeleted) + "\"" : ""),
                    (whenScaled != null ? "\"whenScaled\":\"" +  JsonStrings.escapeJson(whenScaled) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
