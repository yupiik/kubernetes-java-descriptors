package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.List;
import java.util.Objects;

public class ComponentStatusList {
    private String apiVersion;
    private List<ComponentStatusListItems> items;
    private String kind;
    private ComponentStatusListMetadata metadata;

    public ComponentStatusList() {
        // no-op
    }

    public ComponentStatusList(final String apiVersion,
                               final List<ComponentStatusListItems> items,
                               final String kind,
                               final ComponentStatusListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ComponentStatusListItems> getItems() {
        return items;
    }

    public void setItems(final List<ComponentStatusListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ComponentStatusListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ComponentStatusListMetadata metadata) {
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
        if (!(__other instanceof ComponentStatusList)) {
            return false;
        }
        final ComponentStatusList __otherCasted = (ComponentStatusList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
