package io.yupiik.kubernetes.bindings.v1_7_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_3.Validable;
import io.yupiik.kubernetes.bindings.v1_7_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ThirdPartyResource implements Validable<ThirdPartyResource> {
    private String apiVersion;
    private String description;
    private String kind;
    private ObjectMeta metadata;
    private List<APIVersion> versions;

    public ThirdPartyResource() {
        // no-op
    }

    public ThirdPartyResource(final String apiVersion,
                              final String description,
                              final String kind,
                              final ObjectMeta metadata,
                              final List<APIVersion> versions) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<APIVersion> getVersions() {
        return versions;
    }

    public void setVersions(final List<APIVersion> versions) {
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

    public ThirdPartyResource apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ThirdPartyResource description(final String description) {
        this.description = description;
        return this;
    }

    public ThirdPartyResource kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ThirdPartyResource metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ThirdPartyResource versions(final List<APIVersion> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public ThirdPartyResource validate() {
        return this;
    }
}
