package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class PriorityLevelConfigurationList {
    private String apiVersion;
    private List<PriorityLevelConfigurationListItems> items;
    private String kind;
    private PriorityLevelConfigurationListMetadata metadata;

    public PriorityLevelConfigurationList() {
        // no-op
    }

    public PriorityLevelConfigurationList(final String apiVersion,
                                          final List<PriorityLevelConfigurationListItems> items,
                                          final String kind,
                                          final PriorityLevelConfigurationListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PriorityLevelConfigurationListItems> getItems() {
        return items;
    }

    public void setItems(final List<PriorityLevelConfigurationListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PriorityLevelConfigurationListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityLevelConfigurationListMetadata metadata) {
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
        if (!(__other instanceof PriorityLevelConfigurationList)) {
            return false;
        }
        final PriorityLevelConfigurationList __otherCasted = (PriorityLevelConfigurationList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
