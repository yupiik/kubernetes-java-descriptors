package io.yupiik.kubernetes.bindings.v1_16_13.v1alpha1;

import java.util.Objects;

public class RuntimeClassListItemsSpec {
    private RuntimeClassListItemsSpecOverhead overhead;
    private String runtimeHandler;
    private RuntimeClassListItemsSpecScheduling scheduling;

    public RuntimeClassListItemsSpec() {
        // no-op
    }

    public RuntimeClassListItemsSpec(final RuntimeClassListItemsSpecOverhead overhead,
                                     final String runtimeHandler,
                                     final RuntimeClassListItemsSpecScheduling scheduling) {
        // no-op
    }

    public RuntimeClassListItemsSpecOverhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final RuntimeClassListItemsSpecOverhead overhead) {
        this.overhead = overhead;
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    public RuntimeClassListItemsSpecScheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(final RuntimeClassListItemsSpecScheduling scheduling) {
        this.scheduling = scheduling;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                overhead,
                runtimeHandler,
                scheduling);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassListItemsSpec)) {
            return false;
        }
        final RuntimeClassListItemsSpec __otherCasted = (RuntimeClassListItemsSpec) __other;
        return Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(runtimeHandler, __otherCasted.runtimeHandler) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }
}
