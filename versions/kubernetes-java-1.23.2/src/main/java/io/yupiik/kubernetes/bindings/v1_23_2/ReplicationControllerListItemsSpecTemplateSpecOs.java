package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecOs {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecOs __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
