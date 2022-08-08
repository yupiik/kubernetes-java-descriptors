package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class FlowSchemaSpecPriorityLevelConfiguration {
    private String name;

    public FlowSchemaSpecPriorityLevelConfiguration() {
        // no-op
    }

    public FlowSchemaSpecPriorityLevelConfiguration(final String name) {
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
        if (!(__other instanceof FlowSchemaSpecPriorityLevelConfiguration)) {
            return false;
        }
        final FlowSchemaSpecPriorityLevelConfiguration __otherCasted = (FlowSchemaSpecPriorityLevelConfiguration) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
