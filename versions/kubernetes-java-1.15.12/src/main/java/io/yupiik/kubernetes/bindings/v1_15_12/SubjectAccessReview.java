package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class SubjectAccessReview {
    private String apiVersion;
    private String kind;
    private SubjectAccessReviewMetadata metadata;
    private SubjectAccessReviewSpec spec;
    private SubjectAccessReviewStatus status;

    public SubjectAccessReview() {
        // no-op
    }

    public SubjectAccessReview(final String apiVersion,
                               final String kind,
                               final SubjectAccessReviewMetadata metadata,
                               final SubjectAccessReviewSpec spec,
                               final SubjectAccessReviewStatus status) {
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

    public SubjectAccessReviewMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final SubjectAccessReviewMetadata metadata) {
        this.metadata = metadata;
    }

    public SubjectAccessReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final SubjectAccessReviewSpec spec) {
        this.spec = spec;
    }

    public SubjectAccessReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final SubjectAccessReviewStatus status) {
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
        if (!(__other instanceof SubjectAccessReview)) {
            return false;
        }
        final SubjectAccessReview __otherCasted = (SubjectAccessReview) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
