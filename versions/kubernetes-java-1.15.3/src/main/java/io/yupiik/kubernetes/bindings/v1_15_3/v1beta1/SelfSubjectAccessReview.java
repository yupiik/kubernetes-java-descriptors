package io.yupiik.kubernetes.bindings.v1_15_3.v1beta1;

import java.util.Objects;

public class SelfSubjectAccessReview {
    private String apiVersion;
    private String kind;
    private SelfSubjectAccessReviewMetadata metadata;
    private SelfSubjectAccessReviewSpec spec;
    private SelfSubjectAccessReviewStatus status;

    public SelfSubjectAccessReview() {
        // no-op
    }

    public SelfSubjectAccessReview(final String apiVersion,
                                   final String kind,
                                   final SelfSubjectAccessReviewMetadata metadata,
                                   final SelfSubjectAccessReviewSpec spec,
                                   final SelfSubjectAccessReviewStatus status) {
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

    public SelfSubjectAccessReviewMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final SelfSubjectAccessReviewMetadata metadata) {
        this.metadata = metadata;
    }

    public SelfSubjectAccessReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final SelfSubjectAccessReviewSpec spec) {
        this.spec = spec;
    }

    public SelfSubjectAccessReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final SelfSubjectAccessReviewStatus status) {
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
        if (!(__other instanceof SelfSubjectAccessReview)) {
            return false;
        }
        final SelfSubjectAccessReview __otherCasted = (SelfSubjectAccessReview) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
