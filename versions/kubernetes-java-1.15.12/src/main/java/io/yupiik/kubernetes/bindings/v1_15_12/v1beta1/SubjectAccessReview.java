package io.yupiik.kubernetes.bindings.v1_15_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_12.Validable;
import io.yupiik.kubernetes.bindings.v1_15_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectAccessReview implements Validable<SubjectAccessReview> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private SubjectAccessReviewSpec spec;
    private SubjectAccessReviewStatus status;

    public SubjectAccessReview() {
        // no-op
    }

    public SubjectAccessReview(final String apiVersion,
                               final String kind,
                               final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public SubjectAccessReview apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public SubjectAccessReview kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public SubjectAccessReview metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public SubjectAccessReview spec(final SubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public SubjectAccessReview status(final SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public SubjectAccessReview validate() {
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
