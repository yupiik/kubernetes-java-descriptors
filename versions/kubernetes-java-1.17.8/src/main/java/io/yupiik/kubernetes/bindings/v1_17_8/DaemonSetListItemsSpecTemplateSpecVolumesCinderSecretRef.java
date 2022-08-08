package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
