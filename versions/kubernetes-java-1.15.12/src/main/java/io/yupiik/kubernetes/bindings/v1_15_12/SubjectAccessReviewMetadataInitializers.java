package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.List;
import java.util.Objects;

public class SubjectAccessReviewMetadataInitializers {
    private List<SubjectAccessReviewMetadataInitializersPending> pending;
    private SubjectAccessReviewMetadataInitializersResult result;

    public SubjectAccessReviewMetadataInitializers() {
        // no-op
    }

    public SubjectAccessReviewMetadataInitializers(final List<SubjectAccessReviewMetadataInitializersPending> pending,
                                                   final SubjectAccessReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<SubjectAccessReviewMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<SubjectAccessReviewMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public SubjectAccessReviewMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final SubjectAccessReviewMetadataInitializersResult result) {
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
        if (!(__other instanceof SubjectAccessReviewMetadataInitializers)) {
            return false;
        }
        final SubjectAccessReviewMetadataInitializers __otherCasted = (SubjectAccessReviewMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
