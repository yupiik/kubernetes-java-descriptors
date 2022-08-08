package io.yupiik.kubernetes.bindings.v1_16_14.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
