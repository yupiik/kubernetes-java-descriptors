package io.yupiik.kubernetes.bindings.v1_7_3.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestMetadataInitializers {
    private List<JsonValue> pending;
    private CertificateSigningRequestMetadataInitializersResult result;

    public CertificateSigningRequestMetadataInitializers() {
        // no-op
    }

    public CertificateSigningRequestMetadataInitializers(final List<JsonValue> pending,
                                                         final CertificateSigningRequestMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public CertificateSigningRequestMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CertificateSigningRequestMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestMetadataInitializers)) {
            return false;
        }
        final CertificateSigningRequestMetadataInitializers __otherCasted = (CertificateSigningRequestMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
