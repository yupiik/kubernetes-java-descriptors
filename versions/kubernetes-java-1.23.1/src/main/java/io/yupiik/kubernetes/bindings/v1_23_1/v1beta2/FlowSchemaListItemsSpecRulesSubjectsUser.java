package io.yupiik.kubernetes.bindings.v1_23_1.v1beta2;

import java.util.Objects;

public class FlowSchemaListItemsSpecRulesSubjectsUser {
    private String name;

    public FlowSchemaListItemsSpecRulesSubjectsUser() {
        // no-op
    }

    public FlowSchemaListItemsSpecRulesSubjectsUser(final String name) {
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
        if (!(__other instanceof FlowSchemaListItemsSpecRulesSubjectsUser)) {
            return false;
        }
        final FlowSchemaListItemsSpecRulesSubjectsUser __otherCasted = (FlowSchemaListItemsSpecRulesSubjectsUser) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
