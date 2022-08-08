package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.Objects;

public class FlowSchemaListItemsSpecRulesSubjectsGroup {
    private String name;

    public FlowSchemaListItemsSpecRulesSubjectsGroup() {
        // no-op
    }

    public FlowSchemaListItemsSpecRulesSubjectsGroup(final String name) {
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
        if (!(__other instanceof FlowSchemaListItemsSpecRulesSubjectsGroup)) {
            return false;
        }
        final FlowSchemaListItemsSpecRulesSubjectsGroup __otherCasted = (FlowSchemaListItemsSpecRulesSubjectsGroup) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
