package io.yupiik.kubernetes.bindings.v1_16_0.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
