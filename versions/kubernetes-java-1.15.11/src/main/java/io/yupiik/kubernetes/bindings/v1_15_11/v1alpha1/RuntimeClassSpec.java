package io.yupiik.kubernetes.bindings.v1_15_11.v1alpha1;

import java.util.Objects;

public class RuntimeClassSpec {
    private String runtimeHandler;

    public RuntimeClassSpec() {
        // no-op
    }

    public RuntimeClassSpec(final String runtimeHandler) {
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
        if (!(__other instanceof RuntimeClassSpec)) {
            return false;
        }
        final RuntimeClassSpec __otherCasted = (RuntimeClassSpec) __other;
        return Objects.equals(runtimeHandler, __otherCasted.runtimeHandler);
    }
}
