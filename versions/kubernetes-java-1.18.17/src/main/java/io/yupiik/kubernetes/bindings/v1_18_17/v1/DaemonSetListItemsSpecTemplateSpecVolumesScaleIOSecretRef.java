package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
