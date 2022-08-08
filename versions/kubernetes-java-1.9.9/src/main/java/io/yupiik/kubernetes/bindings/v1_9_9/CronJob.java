package io.yupiik.kubernetes.bindings.v1_9_9;

import java.util.Objects;

public class CronJob {
    private String apiVersion;
    private String kind;
    private CronJobMetadata metadata;
    private CronJobSpec spec;
    private CronJobStatus status;

    public CronJob() {
        // no-op
    }

    public CronJob(final String apiVersion,
                   final String kind,
                   final CronJobMetadata metadata,
                   final CronJobSpec spec,
                   final CronJobStatus status) {
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

    public CronJobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobSpec spec) {
        this.spec = spec;
    }

    public CronJobStatus getStatus() {
        return status;
    }

    public void setStatus(final CronJobStatus status) {
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
        if (!(__other instanceof CronJob)) {
            return false;
        }
        final CronJob __otherCasted = (CronJob) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
