package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class TokenRequest {
    private String apiVersion;
    private String kind;
    private TokenRequestMetadata metadata;
    private TokenRequestSpec spec;
    private TokenRequestStatus status;

    public TokenRequest() {
        // no-op
    }

    public TokenRequest(final String apiVersion,
                        final String kind,
                        final TokenRequestMetadata metadata,
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

    public TokenRequestMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final TokenRequestMetadata metadata) {
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
}
