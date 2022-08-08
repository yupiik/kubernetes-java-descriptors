package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class PodDisruptionBudgetListItems {
    private String apiVersion;
    private String kind;
    private PodDisruptionBudgetListItemsMetadata metadata;
    private PodDisruptionBudgetListItemsSpec spec;
    private PodDisruptionBudgetListItemsStatus status;

    public PodDisruptionBudgetListItems() {
        // no-op
    }

    public PodDisruptionBudgetListItems(final String apiVersion,
                                        final String kind,
                                        final PodDisruptionBudgetListItemsMetadata metadata,
                                        final PodDisruptionBudgetListItemsSpec spec,
                                        final PodDisruptionBudgetListItemsStatus status) {
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

    public PodDisruptionBudgetListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodDisruptionBudgetListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PodDisruptionBudgetListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodDisruptionBudgetListItemsSpec spec) {
        this.spec = spec;
    }

    public PodDisruptionBudgetListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final PodDisruptionBudgetListItemsStatus status) {
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
        if (!(__other instanceof PodDisruptionBudgetListItems)) {
            return false;
        }
        final PodDisruptionBudgetListItems __otherCasted = (PodDisruptionBudgetListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
