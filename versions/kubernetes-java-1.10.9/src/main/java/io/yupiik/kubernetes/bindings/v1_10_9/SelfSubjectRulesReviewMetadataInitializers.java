package io.yupiik.kubernetes.bindings.v1_10_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class SelfSubjectRulesReviewMetadataInitializers {
    private List<JsonValue> pending;
    private SelfSubjectRulesReviewMetadataInitializersResult result;

    public SelfSubjectRulesReviewMetadataInitializers() {
        // no-op
    }

    public SelfSubjectRulesReviewMetadataInitializers(final List<JsonValue> pending,
                                                      final SelfSubjectRulesReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
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
