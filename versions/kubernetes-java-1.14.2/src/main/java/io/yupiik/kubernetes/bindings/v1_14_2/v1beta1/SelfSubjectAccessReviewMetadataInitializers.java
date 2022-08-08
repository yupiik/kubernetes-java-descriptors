package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class SelfSubjectAccessReviewMetadataInitializers {
    private List<SelfSubjectAccessReviewMetadataInitializersPending> pending;
    private SelfSubjectAccessReviewMetadataInitializersResult result;

    public SelfSubjectAccessReviewMetadataInitializers() {
        // no-op
    }

    public SelfSubjectAccessReviewMetadataInitializers(final List<SelfSubjectAccessReviewMetadataInitializersPending> pending,
                                                       final SelfSubjectAccessReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<SelfSubjectAccessReviewMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<SelfSubjectAccessReviewMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public SelfSubjectAccessReviewMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final SelfSubjectAccessReviewMetadataInitializersResult result) {
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
        if (!(__other instanceof SelfSubjectAccessReviewMetadataInitializers)) {
            return false;
        }
        final SelfSubjectAccessReviewMetadataInitializers __otherCasted = (SelfSubjectAccessReviewMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
