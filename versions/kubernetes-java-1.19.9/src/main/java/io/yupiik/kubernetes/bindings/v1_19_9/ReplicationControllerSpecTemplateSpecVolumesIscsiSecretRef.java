package io.yupiik.kubernetes.bindings.v1_19_9;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
