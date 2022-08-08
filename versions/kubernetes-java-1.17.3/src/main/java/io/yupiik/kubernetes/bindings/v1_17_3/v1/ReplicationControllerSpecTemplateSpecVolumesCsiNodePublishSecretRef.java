package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
