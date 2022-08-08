package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Validable;
import io.yupiik.kubernetes.bindings.v1_23_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatefulSetPersistentVolumeClaimRetentionPolicy implements Validable<StatefulSetPersistentVolumeClaimRetentionPolicy> {
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
}
