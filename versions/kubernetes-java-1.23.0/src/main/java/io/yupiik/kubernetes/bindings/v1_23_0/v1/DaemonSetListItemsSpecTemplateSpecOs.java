package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecOs {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecOs __otherCasted = (DaemonSetListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
