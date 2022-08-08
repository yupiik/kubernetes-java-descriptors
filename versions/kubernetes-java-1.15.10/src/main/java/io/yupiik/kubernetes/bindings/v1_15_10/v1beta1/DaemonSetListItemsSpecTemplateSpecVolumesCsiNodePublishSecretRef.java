package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
