package io.yupiik.kubernetes.bindings.v1_15_2.v1beta1;

import java.util.Objects;

public class SelfSubjectRulesReview {
    private String apiVersion;
    private String kind;
    private SelfSubjectRulesReviewMetadata metadata;
    private SelfSubjectRulesReviewSpec spec;
    private SelfSubjectRulesReviewStatus status;

    public SelfSubjectRulesReview() {
        // no-op
    }

    public SelfSubjectRulesReview(final String apiVersion,
                                  final String kind,
                                  final SelfSubjectRulesReviewMetadata metadata,
                                  final SelfSubjectRulesReviewSpec spec,
                                  final SelfSubjectRulesReviewStatus status) {
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

    public SelfSubjectRulesReviewMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final SelfSubjectRulesReviewMetadata metadata) {
        this.metadata = metadata;
    }

    public SelfSubjectRulesReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final SelfSubjectRulesReviewSpec spec) {
        this.spec = spec;
    }

    public SelfSubjectRulesReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final SelfSubjectRulesReviewStatus status) {
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
        if (!(__other instanceof SelfSubjectRulesReview)) {
            return false;
        }
        final SelfSubjectRulesReview __otherCasted = (SelfSubjectRulesReview) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
