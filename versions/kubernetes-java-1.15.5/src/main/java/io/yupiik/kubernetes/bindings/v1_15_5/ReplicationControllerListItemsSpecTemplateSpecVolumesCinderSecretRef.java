package io.yupiik.kubernetes.bindings.v1_15_5;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
