package io.yupiik.kubernetes.bindings.v1_11_1.v1beta1;

import java.util.Objects;

public class EvictionDeleteOptions {
    private String apiVersion;
    private Integer gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private EvictionDeleteOptionsPreconditions preconditions;
    private String propagationPolicy;

    public EvictionDeleteOptions() {
        // no-op
    }

    public EvictionDeleteOptions(final String apiVersion,
                                 final Integer gracePeriodSeconds,
                                 final String kind,
                                 final Boolean orphanDependents,
                                 final EvictionDeleteOptionsPreconditions preconditions,
                                 final String propagationPolicy) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getGracePeriodSeconds() {
        return gracePeriodSeconds;
    }

    public void setGracePeriodSeconds(final Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public Boolean getOrphanDependents() {
        return orphanDependents;
    }

    public void setOrphanDependents(final Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
    }

    public EvictionDeleteOptionsPreconditions getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(final EvictionDeleteOptionsPreconditions preconditions) {
        this.preconditions = preconditions;
    }

    public String getPropagationPolicy() {
        return propagationPolicy;
    }

    public void setPropagationPolicy(final String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                gracePeriodSeconds,
                kind,
                orphanDependents,
                preconditions,
                propagationPolicy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EvictionDeleteOptions)) {
            return false;
        }
        final EvictionDeleteOptions __otherCasted = (EvictionDeleteOptions) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(gracePeriodSeconds, __otherCasted.gracePeriodSeconds) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(orphanDependents, __otherCasted.orphanDependents) &&
            Objects.equals(preconditions, __otherCasted.preconditions) &&
            Objects.equals(propagationPolicy, __otherCasted.propagationPolicy);
    }
}
