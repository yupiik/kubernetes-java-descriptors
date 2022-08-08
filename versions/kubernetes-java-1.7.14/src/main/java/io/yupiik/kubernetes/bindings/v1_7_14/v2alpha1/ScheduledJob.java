package io.yupiik.kubernetes.bindings.v1_7_14.v2alpha1;

import java.util.Objects;

public class ScheduledJob {
    private String apiVersion;
    private String kind;
    private ScheduledJobMetadata metadata;
    private ScheduledJobSpec spec;
    private ScheduledJobStatus status;

    public ScheduledJob() {
        // no-op
    }

    public ScheduledJob(final String apiVersion,
                        final String kind,
                        final ScheduledJobMetadata metadata,
                        final ScheduledJobSpec spec,
                        final ScheduledJobStatus status) {
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

    public ScheduledJobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ScheduledJobMetadata metadata) {
        this.metadata = metadata;
    }

    public ScheduledJobSpec getSpec() {
        return spec;
    }

    public void setSpec(final ScheduledJobSpec spec) {
        this.spec = spec;
    }

    public ScheduledJobStatus getStatus() {
        return status;
    }

    public void setStatus(final ScheduledJobStatus status) {
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
        if (!(__other instanceof ScheduledJob)) {
            return false;
        }
        final ScheduledJob __otherCasted = (ScheduledJob) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
