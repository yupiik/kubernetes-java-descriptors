package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending {
    private String name;

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending() {
        // no-op
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending)) {
            return false;
        }
        final StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending __otherCasted = (StatefulSetListItemsSpecVolumeClaimTemplatesMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
