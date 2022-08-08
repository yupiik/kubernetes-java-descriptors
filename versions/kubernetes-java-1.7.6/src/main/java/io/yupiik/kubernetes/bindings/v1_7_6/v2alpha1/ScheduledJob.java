package io.yupiik.kubernetes.bindings.v1_7_6.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_7_6.Validable;
import io.yupiik.kubernetes.bindings.v1_7_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScheduledJob implements Validable<ScheduledJob> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CronJobSpec spec;
    private CronJobStatus status;

    public ScheduledJob() {
        // no-op
    }

    public ScheduledJob(final String apiVersion,
                        final String kind,
                        final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public ScheduledJob apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ScheduledJob kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ScheduledJob metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ScheduledJob spec(final CronJobSpec spec) {
        this.spec = spec;
        return this;
    }

    public ScheduledJob status(final CronJobStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public ScheduledJob validate() {
        return this;
    }
}
