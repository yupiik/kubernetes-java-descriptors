package io.yupiik.kubernetes.bindings.v1_23_9;

import java.util.Objects;

public class StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy {
    private String whenDeleted;
    private String whenScaled;

    public StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy() {
        // no-op
    }

    public StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy(final String whenDeleted,
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
        if (!(__other instanceof StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy)) {
            return false;
        }
        final StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy __otherCasted = (StatefulSetListItemsSpecPersistentVolumeClaimRetentionPolicy) __other;
        return Objects.equals(whenDeleted, __otherCasted.whenDeleted) &&
            Objects.equals(whenScaled, __otherCasted.whenScaled);
    }
}
