package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
