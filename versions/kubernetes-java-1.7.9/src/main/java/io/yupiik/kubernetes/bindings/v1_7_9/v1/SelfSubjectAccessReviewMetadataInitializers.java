package io.yupiik.kubernetes.bindings.v1_7_9.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class SelfSubjectAccessReviewMetadataInitializers {
    private List<JsonValue> pending;
    private SelfSubjectAccessReviewMetadataInitializersResult result;

    public SelfSubjectAccessReviewMetadataInitializers() {
        // no-op
    }

    public SelfSubjectAccessReviewMetadataInitializers(final List<JsonValue> pending,
                                                       final SelfSubjectAccessReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
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
