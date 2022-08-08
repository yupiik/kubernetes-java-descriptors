package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
