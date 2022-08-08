package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class RuntimeClassSpec {
    private RuntimeClassSpecOverhead overhead;
    private String runtimeHandler;
    private RuntimeClassSpecScheduling scheduling;

    public RuntimeClassSpec() {
        // no-op
    }

    public RuntimeClassSpec(final RuntimeClassSpecOverhead overhead,
                            final String runtimeHandler,
                            final RuntimeClassSpecScheduling scheduling) {
        // no-op
    }

    public RuntimeClassSpecOverhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final RuntimeClassSpecOverhead overhead) {
        this.overhead = overhead;
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    public RuntimeClassSpecScheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(final RuntimeClassSpecScheduling scheduling) {
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
        if (!(__other instanceof RuntimeClassSpec)) {
            return false;
        }
        final RuntimeClassSpec __otherCasted = (RuntimeClassSpec) __other;
        return Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(runtimeHandler, __otherCasted.runtimeHandler) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }
}
