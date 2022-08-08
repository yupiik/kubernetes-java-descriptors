package io.yupiik.kubernetes.bindings.v1_17_4;

import java.util.Objects;

public class FlowSchemaSpecRulesSubjectsUser {
    private String name;

    public FlowSchemaSpecRulesSubjectsUser() {
        // no-op
    }

    public FlowSchemaSpecRulesSubjectsUser(final String name) {
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
        if (!(__other instanceof FlowSchemaSpecRulesSubjectsUser)) {
            return false;
        }
        final FlowSchemaSpecRulesSubjectsUser __otherCasted = (FlowSchemaSpecRulesSubjectsUser) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
