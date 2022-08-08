package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.List;
import java.util.Objects;

public class ComponentStatusListItems {
    private String apiVersion;
    private List<ComponentStatusListItemsConditions> conditions;
    private String kind;
    private ComponentStatusListItemsMetadata metadata;

    public ComponentStatusListItems() {
        // no-op
    }

    public ComponentStatusListItems(final String apiVersion,
                                    final List<ComponentStatusListItemsConditions> conditions,
                                    final String kind,
                                    final ComponentStatusListItemsMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ComponentStatusListItemsConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ComponentStatusListItemsConditions> conditions) {
        this.conditions = conditions;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ComponentStatusListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ComponentStatusListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                conditions,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ComponentStatusListItems)) {
            return false;
        }
        final ComponentStatusListItems __otherCasted = (ComponentStatusListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
