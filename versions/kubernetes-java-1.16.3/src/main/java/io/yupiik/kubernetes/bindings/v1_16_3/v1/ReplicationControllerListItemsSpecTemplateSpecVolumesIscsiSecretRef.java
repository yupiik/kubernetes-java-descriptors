package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
