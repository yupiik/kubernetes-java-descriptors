package io.yupiik.kubernetes.bindings.v1_19_14;

import java.util.Objects;

public class FlowSchemaListItemsSpecPriorityLevelConfiguration {
    private String name;

    public FlowSchemaListItemsSpecPriorityLevelConfiguration() {
        // no-op
    }

    public FlowSchemaListItemsSpecPriorityLevelConfiguration(final String name) {
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
        if (!(__other instanceof FlowSchemaListItemsSpecPriorityLevelConfiguration)) {
            return false;
        }
        final FlowSchemaListItemsSpecPriorityLevelConfiguration __otherCasted = (FlowSchemaListItemsSpecPriorityLevelConfiguration) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
