package io.yupiik.kubernetes.bindings.v1_17_7.v1alpha1;

import java.util.Objects;

public class FlowSchemaSpecDistinguisherMethod {
    private String type;

    public FlowSchemaSpecDistinguisherMethod() {
        // no-op
    }

    public FlowSchemaSpecDistinguisherMethod(final String type) {
        // no-op
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaSpecDistinguisherMethod)) {
            return false;
        }
        final FlowSchemaSpecDistinguisherMethod __otherCasted = (FlowSchemaSpecDistinguisherMethod) __other;
        return Objects.equals(type, __otherCasted.type);
    }
}
