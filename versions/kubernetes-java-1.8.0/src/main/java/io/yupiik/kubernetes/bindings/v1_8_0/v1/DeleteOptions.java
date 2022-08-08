package io.yupiik.kubernetes.bindings.v1_8_0.v1;

import io.yupiik.kubernetes.bindings.v1_8_0.Validable;
import io.yupiik.kubernetes.bindings.v1_8_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeleteOptions implements Validable<DeleteOptions> {
    private String apiVersion;
    private Integer gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private Preconditions preconditions;
    private String propagationPolicy;

    public DeleteOptions() {
        // no-op
    }

    public DeleteOptions(final String apiVersion,
                         final Integer gracePeriodSeconds,
                         final String kind,
                         final Boolean orphanDependents,
                         final Preconditions preconditions,
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

    public Preconditions getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(final Preconditions preconditions) {
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

    public DeleteOptions apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DeleteOptions gracePeriodSeconds(final Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
        return this;
    }

    public DeleteOptions kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DeleteOptions orphanDependents(final Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
        return this;
    }

    public DeleteOptions preconditions(final Preconditions preconditions) {
        this.preconditions = preconditions;
        return this;
    }

    public DeleteOptions propagationPolicy(final String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
        return this;
    }

    @Override
    public DeleteOptions validate() {
        return this;
    }
}
