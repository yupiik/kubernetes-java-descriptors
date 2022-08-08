package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
