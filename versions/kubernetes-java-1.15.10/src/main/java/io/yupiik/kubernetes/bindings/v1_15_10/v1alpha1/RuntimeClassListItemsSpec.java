package io.yupiik.kubernetes.bindings.v1_15_10.v1alpha1;

import java.util.Objects;

public class RuntimeClassListItemsSpec {
    private String runtimeHandler;

    public RuntimeClassListItemsSpec() {
        // no-op
    }

    public RuntimeClassListItemsSpec(final String runtimeHandler) {
        // no-op
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                runtimeHandler);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassListItemsSpec)) {
            return false;
        }
        final RuntimeClassListItemsSpec __otherCasted = (RuntimeClassListItemsSpec) __other;
        return Objects.equals(runtimeHandler, __otherCasted.runtimeHandler);
    }
}
