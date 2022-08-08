package io.yupiik.kubernetes.bindings.v1_16_9.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
