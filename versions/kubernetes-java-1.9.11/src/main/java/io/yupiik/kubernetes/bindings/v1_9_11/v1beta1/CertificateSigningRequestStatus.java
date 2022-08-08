package io.yupiik.kubernetes.bindings.v1_9_11.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestStatus {
    private String certificate;
    private List<JsonValue> conditions;

    public CertificateSigningRequestStatus() {
        // no-op
    }

    public CertificateSigningRequestStatus(final String certificate,
                                           final List<JsonValue> conditions) {
        // no-op
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                certificate,
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestStatus)) {
            return false;
        }
        final CertificateSigningRequestStatus __otherCasted = (CertificateSigningRequestStatus) __other;
        return Objects.equals(certificate, __otherCasted.certificate) &&
            Objects.equals(conditions, __otherCasted.conditions);
    }
}
