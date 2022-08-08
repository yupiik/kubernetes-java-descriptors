package io.yupiik.kubernetes.bindings.v1_20_15.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (ReplicaSetSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
