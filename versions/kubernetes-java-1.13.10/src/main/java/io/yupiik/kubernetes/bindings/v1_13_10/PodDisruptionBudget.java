package io.yupiik.kubernetes.bindings.v1_13_10;

import java.util.Objects;

public class PodDisruptionBudget {
    private String apiVersion;
    private String kind;
    private PodDisruptionBudgetMetadata metadata;
    private PodDisruptionBudgetSpec spec;
    private PodDisruptionBudgetStatus status;

    public PodDisruptionBudget() {
        // no-op
    }

    public PodDisruptionBudget(final String apiVersion,
                               final String kind,
                               final PodDisruptionBudgetMetadata metadata,
                               final PodDisruptionBudgetSpec spec,
                               final PodDisruptionBudgetStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodDisruptionBudgetMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodDisruptionBudgetMetadata metadata) {
        this.metadata = metadata;
    }

    public PodDisruptionBudgetSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodDisruptionBudgetSpec spec) {
        this.spec = spec;
    }

    public PodDisruptionBudgetStatus getStatus() {
        return status;
    }

    public void setStatus(final PodDisruptionBudgetStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudget)) {
            return false;
        }
        final PodDisruptionBudget __otherCasted = (PodDisruptionBudget) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
