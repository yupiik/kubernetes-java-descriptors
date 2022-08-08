package io.yupiik.kubernetes.bindings.v1_24_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_0.Validable;
import io.yupiik.kubernetes.bindings.v1_24_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowSchema implements Validable<FlowSchema> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private FlowSchemaSpec spec;
    private FlowSchemaStatus status;

    public FlowSchema() {
        // no-op
    }

    public FlowSchema(final String apiVersion,
                      final String kind,
                      final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public FlowSchema apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public FlowSchema kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public FlowSchema metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public FlowSchema spec(final FlowSchemaSpec spec) {
        this.spec = spec;
        return this;
    }

    public FlowSchema status(final FlowSchemaStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public FlowSchema validate() {
        return this;
    }
}
