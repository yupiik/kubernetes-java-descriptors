package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import java.util.Objects;

public class JobListItems {
    private String apiVersion;
    private String kind;
    private JobListItemsMetadata metadata;
    private JobListItemsSpec spec;
    private JobListItemsStatus status;

    public JobListItems() {
        // no-op
    }

    public JobListItems(final String apiVersion,
                        final String kind,
                        final JobListItemsMetadata metadata,
                        final JobListItemsSpec spec,
                        final JobListItemsStatus status) {
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

    public JobListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public JobListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobListItemsSpec spec) {
        this.spec = spec;
    }

    public JobListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final JobListItemsStatus status) {
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
        if (!(__other instanceof JobListItems)) {
            return false;
        }
        final JobListItems __otherCasted = (JobListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
