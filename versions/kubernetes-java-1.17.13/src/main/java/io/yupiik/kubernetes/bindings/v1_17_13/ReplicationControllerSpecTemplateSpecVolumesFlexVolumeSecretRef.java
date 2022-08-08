package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
