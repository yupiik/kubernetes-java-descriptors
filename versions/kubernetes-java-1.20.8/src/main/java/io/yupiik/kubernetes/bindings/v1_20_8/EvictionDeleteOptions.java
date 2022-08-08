package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.List;
import java.util.Objects;

public class EvictionDeleteOptions {
    private String apiVersion;
    private List<String> dryRun;
    private Integer gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private EvictionDeleteOptionsPreconditions preconditions;
    private String propagationPolicy;

    public EvictionDeleteOptions() {
        // no-op
    }

    public EvictionDeleteOptions(final String apiVersion,
                                 final List<String> dryRun,
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

    public List<String> getDryRun() {
        return dryRun;
    }

    public void setDryRun(final List<String> dryRun) {
        this.dryRun = dryRun;
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
                dryRun,
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
            Objects.equals(dryRun, __otherCasted.dryRun) &&
            Objects.equals(gracePeriodSeconds, __otherCasted.gracePeriodSeconds) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(orphanDependents, __otherCasted.orphanDependents) &&
            Objects.equals(preconditions, __otherCasted.preconditions) &&
            Objects.equals(propagationPolicy, __otherCasted.propagationPolicy);
    }
}
