package io.yupiik.kubernetes.bindings.v1_8_8;

import java.util.Objects;

public class LocalSubjectAccessReview {
    private String apiVersion;
    private String kind;
    private LocalSubjectAccessReviewMetadata metadata;
    private LocalSubjectAccessReviewSpec spec;
    private LocalSubjectAccessReviewStatus status;

    public LocalSubjectAccessReview() {
        // no-op
    }

    public LocalSubjectAccessReview(final String apiVersion,
                                    final String kind,
                                    final LocalSubjectAccessReviewMetadata metadata,
                                    final LocalSubjectAccessReviewSpec spec,
                                    final LocalSubjectAccessReviewStatus status) {
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

    public LocalSubjectAccessReviewMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final LocalSubjectAccessReviewMetadata metadata) {
        this.metadata = metadata;
    }

    public LocalSubjectAccessReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final LocalSubjectAccessReviewSpec spec) {
        this.spec = spec;
    }

    public LocalSubjectAccessReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final LocalSubjectAccessReviewStatus status) {
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
        if (!(__other instanceof LocalSubjectAccessReview)) {
            return false;
        }
        final LocalSubjectAccessReview __otherCasted = (LocalSubjectAccessReview) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
