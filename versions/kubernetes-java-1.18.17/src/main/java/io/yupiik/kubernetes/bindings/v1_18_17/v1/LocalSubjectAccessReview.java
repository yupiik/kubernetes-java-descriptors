package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import io.yupiik.kubernetes.bindings.v1_18_17.Validable;
import io.yupiik.kubernetes.bindings.v1_18_17.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalSubjectAccessReview implements Validable<LocalSubjectAccessReview> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private SubjectAccessReviewSpec spec;
    private SubjectAccessReviewStatus status;

    public LocalSubjectAccessReview() {
        // no-op
    }

    public LocalSubjectAccessReview(final String apiVersion,
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

    public LocalSubjectAccessReview apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LocalSubjectAccessReview kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public LocalSubjectAccessReview metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public LocalSubjectAccessReview spec(final SubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public LocalSubjectAccessReview status(final SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public LocalSubjectAccessReview validate() {
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
