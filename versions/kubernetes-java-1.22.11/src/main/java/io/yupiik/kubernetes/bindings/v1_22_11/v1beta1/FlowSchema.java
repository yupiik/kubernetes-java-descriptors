package io.yupiik.kubernetes.bindings.v1_22_11.v1beta1;

import java.util.Objects;

public class FlowSchema {
    private String apiVersion;
    private String kind;
    private FlowSchemaMetadata metadata;
    private FlowSchemaSpec spec;
    private FlowSchemaStatus status;

    public FlowSchema() {
        // no-op
    }

    public FlowSchema(final String apiVersion,
                      final String kind,
                      final FlowSchemaMetadata metadata,
                      final FlowSchemaSpec spec,
                      final FlowSchemaStatus status) {
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

    public FlowSchemaMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final FlowSchemaMetadata metadata) {
        this.metadata = metadata;
    }

    public FlowSchemaSpec getSpec() {
        return spec;
    }

    public void setSpec(final FlowSchemaSpec spec) {
        this.spec = spec;
    }

    public FlowSchemaStatus getStatus() {
        return status;
    }

    public void setStatus(final FlowSchemaStatus status) {
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
        if (!(__other instanceof FlowSchema)) {
            return false;
        }
        final FlowSchema __otherCasted = (FlowSchema) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
