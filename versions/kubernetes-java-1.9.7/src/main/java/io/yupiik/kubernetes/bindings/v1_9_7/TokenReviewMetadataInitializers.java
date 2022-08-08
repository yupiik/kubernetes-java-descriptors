package io.yupiik.kubernetes.bindings.v1_9_7;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class TokenReviewMetadataInitializers {
    private List<JsonValue> pending;
    private TokenReviewMetadataInitializersResult result;

    public TokenReviewMetadataInitializers() {
        // no-op
    }

    public TokenReviewMetadataInitializers(final List<JsonValue> pending,
                                           final TokenReviewMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public TokenReviewMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final TokenReviewMetadataInitializersResult result) {
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
        if (!(__other instanceof TokenReviewMetadataInitializers)) {
            return false;
        }
        final TokenReviewMetadataInitializers __otherCasted = (TokenReviewMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
