package io.yupiik.kubernetes.bindings.v1_20_14.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_14.Validable;
import io.yupiik.kubernetes.bindings.v1_20_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenReview implements Validable<TokenReview>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private TokenReviewSpec spec;
    private TokenReviewStatus status;

    public TokenReview() {
        // no-op
    }

    public TokenReview(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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

    public TokenReview apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public TokenReview kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public TokenReview metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public TokenReview spec(final TokenReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public TokenReview status(final TokenReviewStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public TokenReview validate() {
        if (kind == null) {
            kind = "TokenReview";
        }
        if (apiVersion == null) {
            apiVersion = "authentication.k8s.io/v1beta1";
        }
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

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
