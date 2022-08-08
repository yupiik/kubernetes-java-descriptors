package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class PriorityLevelConfiguration {
    private String apiVersion;
    private String kind;
    private PriorityLevelConfigurationMetadata metadata;
    private PriorityLevelConfigurationSpec spec;
    private PriorityLevelConfigurationStatus status;

    public PriorityLevelConfiguration() {
        // no-op
    }

    public PriorityLevelConfiguration(final String apiVersion,
                                      final String kind,
                                      final PriorityLevelConfigurationMetadata metadata,
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

    public PriorityLevelConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityLevelConfigurationMetadata metadata) {
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
}
