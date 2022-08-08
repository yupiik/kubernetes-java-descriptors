package io.yupiik.kubernetes.bindings.v1_20_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodDisruptionBudgetList {
    private String apiVersion;
    private List<PodDisruptionBudgetListItems> items;
    private String kind;
    private PodDisruptionBudgetListMetadata metadata;

    public PodDisruptionBudgetList() {
        // no-op
    }

    public PodDisruptionBudgetList(final String apiVersion,
                                   final List<PodDisruptionBudgetListItems> items,
                                   final String kind,
                                   final PodDisruptionBudgetListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodDisruptionBudgetListItems> getItems() {
        return items;
    }

    public void setItems(final List<PodDisruptionBudgetListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodDisruptionBudgetListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodDisruptionBudgetListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudgetList)) {
            return false;
        }
        final PodDisruptionBudgetList __otherCasted = (PodDisruptionBudgetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
