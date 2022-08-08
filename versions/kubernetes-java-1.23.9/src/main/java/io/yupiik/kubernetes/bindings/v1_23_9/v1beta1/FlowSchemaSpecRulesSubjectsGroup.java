package io.yupiik.kubernetes.bindings.v1_23_9.v1beta1;

import java.util.Objects;

public class FlowSchemaSpecRulesSubjectsGroup {
    private String name;

    public FlowSchemaSpecRulesSubjectsGroup() {
        // no-op
    }

    public FlowSchemaSpecRulesSubjectsGroup(final String name) {
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
        if (!(__other instanceof FlowSchemaSpecRulesSubjectsGroup)) {
            return false;
        }
        final FlowSchemaSpecRulesSubjectsGroup __otherCasted = (FlowSchemaSpecRulesSubjectsGroup) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
