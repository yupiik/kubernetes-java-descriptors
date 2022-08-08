package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecImagePullSecrets {
    private String name;

    public ReplicationControllerSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecImagePullSecrets __otherCasted = (ReplicationControllerSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
