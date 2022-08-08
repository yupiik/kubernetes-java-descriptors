package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import io.yupiik.kubernetes.bindings.v1_17_5.Validable;
import io.yupiik.kubernetes.bindings.v1_17_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelfSubjectAccessReview implements Validable<SelfSubjectAccessReview> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private SelfSubjectAccessReviewSpec spec;
    private SubjectAccessReviewStatus status;

    public SelfSubjectAccessReview() {
        // no-op
    }

    public SelfSubjectAccessReview(final String apiVersion,
                                   final String kind,
                                   final ObjectMeta metadata,
                                   final SelfSubjectAccessReviewSpec spec,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public SelfSubjectAccessReviewSpec getSpec() {
        return spec;
    }

    public void setSpec(final SelfSubjectAccessReviewSpec spec) {
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

    public SelfSubjectAccessReview apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public SelfSubjectAccessReview kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public SelfSubjectAccessReview metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public SelfSubjectAccessReview spec(final SelfSubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public SelfSubjectAccessReview status(final SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public SelfSubjectAccessReview validate() {
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
