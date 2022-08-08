package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
