package io.yupiik.kubernetes.bindings.v1_14_2.v1;

import java.util.List;
import java.util.Objects;

public class JobMetadataInitializers {
    private List<JobMetadataInitializersPending> pending;
    private JobMetadataInitializersResult result;

    public JobMetadataInitializers() {
        // no-op
    }

    public JobMetadataInitializers(final List<JobMetadataInitializersPending> pending,
                                   final JobMetadataInitializersResult result) {
        // no-op
    }

    public List<JobMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<JobMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public JobMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final JobMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobMetadataInitializers)) {
            return false;
        }
        final JobMetadataInitializers __otherCasted = (JobMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
