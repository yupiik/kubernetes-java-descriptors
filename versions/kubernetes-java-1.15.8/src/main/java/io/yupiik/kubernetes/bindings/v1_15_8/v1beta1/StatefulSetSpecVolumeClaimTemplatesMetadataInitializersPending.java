package io.yupiik.kubernetes.bindings.v1_15_8.v1beta1;

import java.util.Objects;

public class StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending {
    private String name;

    public StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending() {
        // no-op
    }

    public StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending)) {
            return false;
        }
        final StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending __otherCasted = (StatefulSetSpecVolumeClaimTemplatesMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
