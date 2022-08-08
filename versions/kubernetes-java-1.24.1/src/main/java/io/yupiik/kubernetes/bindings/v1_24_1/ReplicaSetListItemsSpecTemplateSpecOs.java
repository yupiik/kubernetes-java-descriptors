package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecOs {
    private String name;

    public ReplicaSetListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecOs __otherCasted = (ReplicaSetListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
