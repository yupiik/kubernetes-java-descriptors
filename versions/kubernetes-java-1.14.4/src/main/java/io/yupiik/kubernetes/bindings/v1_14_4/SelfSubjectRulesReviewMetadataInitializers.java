package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class SelfSubjectRulesReviewMetadataInitializers {
    private List<SelfSubjectRulesReviewMetadataInitializersPending> pending;
    private SelfSubjectRulesReviewMetadataInitializersResult result;

    public SelfSubjectRulesReviewMetadataInitializers() {
        // no-op
    }

    public SelfSubjectRulesReviewMetadataInitializers(final List<SelfSubjectRulesReviewMetadataInitializersPending> pending,
                                                      final SelfSubjectRulesReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<SelfSubjectRulesReviewMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<SelfSubjectRulesReviewMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public SelfSubjectRulesReviewMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final SelfSubjectRulesReviewMetadataInitializersResult result) {
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
        if (!(__other instanceof SelfSubjectRulesReviewMetadataInitializers)) {
            return false;
        }
        final SelfSubjectRulesReviewMetadataInitializers __otherCasted = (SelfSubjectRulesReviewMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
