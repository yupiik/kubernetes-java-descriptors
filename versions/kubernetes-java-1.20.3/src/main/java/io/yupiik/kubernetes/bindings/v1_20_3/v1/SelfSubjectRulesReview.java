package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import io.yupiik.kubernetes.bindings.v1_20_3.Validable;
import io.yupiik.kubernetes.bindings.v1_20_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelfSubjectRulesReview implements Validable<SelfSubjectRulesReview> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private SelfSubjectRulesReviewSpec spec;
    private SubjectRulesReviewStatus status;

    public SelfSubjectRulesReview() {
        // no-op
    }

    public SelfSubjectRulesReview(final String apiVersion,
                                  final String kind,
                                  final ObjectMeta metadata,
                                  final SelfSubjectRulesReviewSpec spec,
                                  final SubjectRulesReviewStatus status) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public SelfSubjectRulesReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final SelfSubjectRulesReviewSpec spec) {
        this.spec = spec;
    }

    public SubjectRulesReviewStatus getStatus() {
        return status;
    }

    public void setStatus(final SubjectRulesReviewStatus status) {
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

    public SelfSubjectRulesReview apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public SelfSubjectRulesReview kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public SelfSubjectRulesReview metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public SelfSubjectRulesReview spec(final SelfSubjectRulesReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public SelfSubjectRulesReview status(final SubjectRulesReviewStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public SelfSubjectRulesReview validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
