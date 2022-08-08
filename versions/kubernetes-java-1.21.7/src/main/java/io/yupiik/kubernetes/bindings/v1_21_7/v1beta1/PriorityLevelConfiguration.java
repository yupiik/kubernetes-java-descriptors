package io.yupiik.kubernetes.bindings.v1_21_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_7.Validable;
import io.yupiik.kubernetes.bindings.v1_21_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PriorityLevelConfiguration implements Validable<PriorityLevelConfiguration> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PriorityLevelConfigurationSpec spec;
    private PriorityLevelConfigurationStatus status;

    public PriorityLevelConfiguration() {
        // no-op
    }

    public PriorityLevelConfiguration(final String apiVersion,
                                      final String kind,
                                      final ObjectMeta metadata,
                                      final PriorityLevelConfigurationSpec spec,
                                      final PriorityLevelConfigurationStatus status) {
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

    public PriorityLevelConfigurationSpec getSpec() {
        return spec;
    }

    public void setSpec(final PriorityLevelConfigurationSpec spec) {
        this.spec = spec;
    }

    public PriorityLevelConfigurationStatus getStatus() {
        return status;
    }

    public void setStatus(final PriorityLevelConfigurationStatus status) {
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
        if (!(__other instanceof PriorityLevelConfiguration)) {
            return false;
        }
        final PriorityLevelConfiguration __otherCasted = (PriorityLevelConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public PriorityLevelConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityLevelConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityLevelConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PriorityLevelConfiguration spec(final PriorityLevelConfigurationSpec spec) {
        this.spec = spec;
        return this;
    }

    public PriorityLevelConfiguration status(final PriorityLevelConfigurationStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public PriorityLevelConfiguration validate() {
        return this;
    }
}
