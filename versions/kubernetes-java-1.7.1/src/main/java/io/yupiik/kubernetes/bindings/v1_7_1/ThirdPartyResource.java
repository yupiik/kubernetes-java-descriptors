package io.yupiik.kubernetes.bindings.v1_7_1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ThirdPartyResource {
    private String apiVersion;
    private String description;
    private String kind;
    private ThirdPartyResourceMetadata metadata;
    private List<JsonValue> versions;

    public ThirdPartyResource() {
        // no-op
    }

    public ThirdPartyResource(final String apiVersion,
                              final String description,
                              final String kind,
                              final ThirdPartyResourceMetadata metadata,
                              final List<JsonValue> versions) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ThirdPartyResourceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ThirdPartyResourceMetadata metadata) {
        this.metadata = metadata;
    }

    public List<JsonValue> getVersions() {
        return versions;
    }

    public void setVersions(final List<JsonValue> versions) {
        this.versions = versions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                description,
                kind,
                metadata,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ThirdPartyResource)) {
            return false;
        }
        final ThirdPartyResource __otherCasted = (ThirdPartyResource) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
