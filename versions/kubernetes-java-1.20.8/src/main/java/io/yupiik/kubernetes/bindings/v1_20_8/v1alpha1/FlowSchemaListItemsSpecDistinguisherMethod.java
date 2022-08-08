package io.yupiik.kubernetes.bindings.v1_20_8.v1alpha1;

import java.util.Objects;

public class FlowSchemaListItemsSpecDistinguisherMethod {
    private String type;

    public FlowSchemaListItemsSpecDistinguisherMethod() {
        // no-op
    }

    public FlowSchemaListItemsSpecDistinguisherMethod(final String type) {
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
        if (!(__other instanceof FlowSchemaListItemsSpecDistinguisherMethod)) {
            return false;
        }
        final FlowSchemaListItemsSpecDistinguisherMethod __otherCasted = (FlowSchemaListItemsSpecDistinguisherMethod) __other;
        return Objects.equals(type, __otherCasted.type);
    }
}
