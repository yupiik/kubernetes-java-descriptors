package io.yupiik.kubernetes.bindings.v1_19_14.v1;

import io.yupiik.kubernetes.bindings.v1_19_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_14.Validable;
import io.yupiik.kubernetes.bindings.v1_19_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TokenRequest implements Validable<TokenRequest>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private TokenRequestSpec spec;
    private TokenRequestStatus status;

    public TokenRequest() {
        // no-op
    }

    public TokenRequest(final String apiVersion,
                        final String kind,
                        final ObjectMeta metadata,
                        final TokenRequestSpec spec,
                        final TokenRequestStatus status) {
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

    public TokenRequestSpec getSpec() {
        return spec;
    }

    public void setSpec(final TokenRequestSpec spec) {
        this.spec = spec;
    }

    public TokenRequestStatus getStatus() {
        return status;
    }

    public void setStatus(final TokenRequestStatus status) {
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
        if (!(__other instanceof TokenRequest)) {
            return false;
        }
        final TokenRequest __otherCasted = (TokenRequest) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public TokenRequest apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public TokenRequest kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public TokenRequest metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public TokenRequest spec(final TokenRequestSpec spec) {
        this.spec = spec;
        return this;
    }

    public TokenRequest status(final TokenRequestStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public TokenRequest validate() {
        if (kind == null) {
            kind = "TokenRequest";
        }
        if (apiVersion == null) {
            apiVersion = "authentication.k8s.io/v1";
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
