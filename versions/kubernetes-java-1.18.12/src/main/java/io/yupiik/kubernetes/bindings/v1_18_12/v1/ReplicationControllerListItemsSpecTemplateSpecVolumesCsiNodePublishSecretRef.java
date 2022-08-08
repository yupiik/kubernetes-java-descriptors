package io.yupiik.kubernetes.bindings.v1_18_12.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
