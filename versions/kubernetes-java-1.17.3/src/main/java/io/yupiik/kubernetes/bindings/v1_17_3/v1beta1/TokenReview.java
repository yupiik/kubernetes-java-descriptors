package io.yupiik.kubernetes.bindings.v1_17_3.v1beta1;

import java.util.Objects;

public class TokenReview {
    private String apiVersion;
    private String kind;
    private TokenReviewMetadata metadata;
    private TokenReviewSpec spec;
    private TokenReviewStatus status;

    public TokenReview() {
        // no-op
    }

    public TokenReview(final String apiVersion,
                       final String kind,
                       final TokenReviewMetadata metadata,
                       final TokenReviewSpec spec,
                       final TokenReviewStatus status) {
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

    public TokenReviewMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final TokenReviewMetadata metadata) {
        this.metadata = metadata;
    }

    public TokenReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final TokenReviewSpec spec) {
        this.spec = spec;
    }

    public TokenReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final TokenReviewStatus status) {
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
        if (!(__other instanceof TokenReview)) {
            return false;
        }
        final TokenReview __otherCasted = (TokenReview) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
