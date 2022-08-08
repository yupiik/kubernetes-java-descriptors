package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.Objects;

public class CustomResourceDefinition {
    private String apiVersion;
    private String kind;
    private CustomResourceDefinitionMetadata metadata;
    private CustomResourceDefinitionSpec spec;
    private CustomResourceDefinitionStatus status;

    public CustomResourceDefinition() {
        // no-op
    }

    public CustomResourceDefinition(final String apiVersion,
                                    final String kind,
                                    final CustomResourceDefinitionMetadata metadata,
                                    final CustomResourceDefinitionSpec spec,
                                    final CustomResourceDefinitionStatus status) {
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

    public CustomResourceDefinitionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CustomResourceDefinitionMetadata metadata) {
        this.metadata = metadata;
    }

    public CustomResourceDefinitionSpec getSpec() {
        return spec;
    }

    public void setSpec(final CustomResourceDefinitionSpec spec) {
        this.spec = spec;
    }

    public CustomResourceDefinitionStatus getStatus() {
        return status;
    }

    public void setStatus(final CustomResourceDefinitionStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinition)) {
            return false;
        }
        final CustomResourceDefinition __otherCasted = (CustomResourceDefinition) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
