package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class StatefulSetSpecPersistentVolumeClaimRetentionPolicy {
    private String whenDeleted;
    private String whenScaled;

    public StatefulSetSpecPersistentVolumeClaimRetentionPolicy() {
        // no-op
    }

    public StatefulSetSpecPersistentVolumeClaimRetentionPolicy(final String whenDeleted,
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
        if (!(__other instanceof StatefulSetSpecPersistentVolumeClaimRetentionPolicy)) {
            return false;
        }
        final StatefulSetSpecPersistentVolumeClaimRetentionPolicy __otherCasted = (StatefulSetSpecPersistentVolumeClaimRetentionPolicy) __other;
        return Objects.equals(whenDeleted, __otherCasted.whenDeleted) &&
            Objects.equals(whenScaled, __otherCasted.whenScaled);
    }
}
