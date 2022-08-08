package io.yupiik.kubernetes.bindings.v1_13_8.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class Endpoints {
    private String apiVersion;
    private String kind;
    private EndpointsMetadata metadata;
    private List<JsonValue> subsets;

    public Endpoints() {
        // no-op
    }

    public Endpoints(final String apiVersion,
                     final String kind,
                     final EndpointsMetadata metadata,
                     final List<JsonValue> subsets) {
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

    public EndpointsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EndpointsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<JsonValue> getSubsets() {
        return subsets;
    }

    public void setSubsets(final List<JsonValue> subsets) {
        this.subsets = subsets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                subsets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Endpoints)) {
            return false;
        }
        final Endpoints __otherCasted = (Endpoints) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(subsets, __otherCasted.subsets);
    }
}
