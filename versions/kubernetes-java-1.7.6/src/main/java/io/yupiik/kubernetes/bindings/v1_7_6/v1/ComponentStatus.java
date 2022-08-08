package io.yupiik.kubernetes.bindings.v1_7_6.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ComponentStatus {
    private String apiVersion;
    private List<JsonValue> conditions;
    private String kind;
    private ComponentStatusMetadata metadata;

    public ComponentStatus() {
        // no-op
    }

    public ComponentStatus(final String apiVersion,
                           final List<JsonValue> conditions,
                           final String kind,
                           final ComponentStatusMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
        this.conditions = conditions;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ComponentStatusMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ComponentStatusMetadata metadata) {
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
        if (!(__other instanceof ComponentStatus)) {
            return false;
        }
        final ComponentStatus __otherCasted = (ComponentStatus) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
