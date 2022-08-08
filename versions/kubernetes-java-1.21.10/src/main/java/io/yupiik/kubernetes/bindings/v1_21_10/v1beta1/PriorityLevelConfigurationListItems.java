package io.yupiik.kubernetes.bindings.v1_21_10.v1beta1;

import java.util.Objects;

public class PriorityLevelConfigurationListItems {
    private String apiVersion;
    private String kind;
    private PriorityLevelConfigurationListItemsMetadata metadata;
    private PriorityLevelConfigurationListItemsSpec spec;
    private PriorityLevelConfigurationListItemsStatus status;

    public PriorityLevelConfigurationListItems() {
        // no-op
    }

    public PriorityLevelConfigurationListItems(final String apiVersion,
                                               final String kind,
                                               final PriorityLevelConfigurationListItemsMetadata metadata,
                                               final PriorityLevelConfigurationListItemsSpec spec,
                                               final PriorityLevelConfigurationListItemsStatus status) {
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

    public PriorityLevelConfigurationListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityLevelConfigurationListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PriorityLevelConfigurationListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PriorityLevelConfigurationListItemsSpec spec) {
        this.spec = spec;
    }

    public PriorityLevelConfigurationListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final PriorityLevelConfigurationListItemsStatus status) {
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
        if (!(__other instanceof PriorityLevelConfigurationListItems)) {
            return false;
        }
        final PriorityLevelConfigurationListItems __otherCasted = (PriorityLevelConfigurationListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
