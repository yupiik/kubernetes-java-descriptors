package io.yupiik.kubernetes.bindings.v1_9_4.v2beta1;

import java.util.Objects;

public class DeleteOptions {
    private String apiVersion;
    private Integer gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private DeleteOptionsPreconditions preconditions;
    private String propagationPolicy;

    public DeleteOptions() {
        // no-op
    }

    public DeleteOptions(final String apiVersion,
                         final Integer gracePeriodSeconds,
                         final String kind,
                         final Boolean orphanDependents,
                         final DeleteOptionsPreconditions preconditions,
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

    public DeleteOptionsPreconditions getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(final DeleteOptionsPreconditions preconditions) {
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
        if (!(__other instanceof DeleteOptions)) {
            return false;
        }
        final DeleteOptions __otherCasted = (DeleteOptions) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(gracePeriodSeconds, __otherCasted.gracePeriodSeconds) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(orphanDependents, __otherCasted.orphanDependents) &&
            Objects.equals(preconditions, __otherCasted.preconditions) &&
            Objects.equals(propagationPolicy, __otherCasted.propagationPolicy);
    }
}
