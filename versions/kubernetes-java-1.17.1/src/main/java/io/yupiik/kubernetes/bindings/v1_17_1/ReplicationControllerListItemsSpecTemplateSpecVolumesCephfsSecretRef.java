package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
