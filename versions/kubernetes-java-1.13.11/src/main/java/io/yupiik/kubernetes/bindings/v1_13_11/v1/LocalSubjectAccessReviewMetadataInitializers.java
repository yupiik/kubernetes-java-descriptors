package io.yupiik.kubernetes.bindings.v1_13_11.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class LocalSubjectAccessReviewMetadataInitializers {
    private List<JsonValue> pending;
    private LocalSubjectAccessReviewMetadataInitializersResult result;

    public LocalSubjectAccessReviewMetadataInitializers() {
        // no-op
    }

    public LocalSubjectAccessReviewMetadataInitializers(final List<JsonValue> pending,
                                                        final LocalSubjectAccessReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public LocalSubjectAccessReviewMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final LocalSubjectAccessReviewMetadataInitializersResult result) {
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
        if (!(__other instanceof LocalSubjectAccessReviewMetadataInitializers)) {
            return false;
        }
        final LocalSubjectAccessReviewMetadataInitializers __otherCasted = (LocalSubjectAccessReviewMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
