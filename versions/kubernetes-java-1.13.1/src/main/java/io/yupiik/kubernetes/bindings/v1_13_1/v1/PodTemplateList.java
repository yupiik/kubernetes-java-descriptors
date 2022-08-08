package io.yupiik.kubernetes.bindings.v1_13_1.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodTemplateList {
    private String apiVersion;
    private List<JsonValue> items;
    private String kind;
    private PodTemplateListMetadata metadata;

    public PodTemplateList() {
        // no-op
    }

    public PodTemplateList(final String apiVersion,
                           final List<JsonValue> items,
                           final String kind,
                           final PodTemplateListMetadata metadata) {
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

    public PodTemplateListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateListMetadata metadata) {
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
        if (!(__other instanceof PodTemplateList)) {
            return false;
        }
        final PodTemplateList __otherCasted = (PodTemplateList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
