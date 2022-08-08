package io.yupiik.kubernetes.bindings.v1_7_7;

import java.util.Objects;

public class Job {
    private String apiVersion;
    private String kind;
    private JobMetadata metadata;
    private JobSpec spec;
    private JobStatus status;

    public Job() {
        // no-op
    }

    public Job(final String apiVersion,
               final String kind,
               final JobMetadata metadata,
               final JobSpec spec,
               final JobStatus status) {
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

    public JobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobMetadata metadata) {
        this.metadata = metadata;
    }

    public JobSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobSpec spec) {
        this.spec = spec;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(final JobStatus status) {
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
        if (!(__other instanceof Job)) {
            return false;
        }
        final Job __otherCasted = (Job) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
