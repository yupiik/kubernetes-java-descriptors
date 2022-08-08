package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecImagePullSecrets {
    private String name;

    public ReplicaSetSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecImagePullSecrets __otherCasted = (ReplicaSetSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
