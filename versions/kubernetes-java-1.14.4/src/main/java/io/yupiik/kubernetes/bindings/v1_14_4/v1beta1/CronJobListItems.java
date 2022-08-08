package io.yupiik.kubernetes.bindings.v1_14_4.v1beta1;

import java.util.Objects;

public class CronJobListItems {
    private String apiVersion;
    private String kind;
    private CronJobListItemsMetadata metadata;
    private CronJobListItemsSpec spec;
    private CronJobListItemsStatus status;

    public CronJobListItems() {
        // no-op
    }

    public CronJobListItems(final String apiVersion,
                            final String kind,
                            final CronJobListItemsMetadata metadata,
                            final CronJobListItemsSpec spec,
                            final CronJobListItemsStatus status) {
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

    public CronJobListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobListItemsSpec spec) {
        this.spec = spec;
    }

    public CronJobListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final CronJobListItemsStatus status) {
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
        if (!(__other instanceof CronJobListItems)) {
            return false;
        }
        final CronJobListItems __otherCasted = (CronJobListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
