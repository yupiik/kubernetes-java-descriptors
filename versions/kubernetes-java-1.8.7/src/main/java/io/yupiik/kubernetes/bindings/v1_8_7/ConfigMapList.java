package io.yupiik.kubernetes.bindings.v1_8_7;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ConfigMapList {
    private String apiVersion;
    private List<JsonValue> items;
    private String kind;
    private ConfigMapListMetadata metadata;

    public ConfigMapList() {
        // no-op
    }

    public ConfigMapList(final String apiVersion,
                         final List<JsonValue> items,
                         final String kind,
                         final ConfigMapListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getItems() {
        return items;
    }

    public void setItems(final List<JsonValue> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ConfigMapListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ConfigMapListMetadata metadata) {
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
        if (!(__other instanceof ConfigMapList)) {
            return false;
        }
        final ConfigMapList __otherCasted = (ConfigMapList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
