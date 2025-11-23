package io.yupiik.kubernetes.bindings.v1_31_6.v1;

import io.yupiik.kubernetes.bindings.v1_31_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_6.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CertificateSigningRequestStatus implements Validable<CertificateSigningRequestStatus>, Exportable {
    private String certificate;
    private List<CertificateSigningRequestCondition> conditions;

    public CertificateSigningRequestStatus() {
        // no-op
    }

    public CertificateSigningRequestStatus(final String certificate,
                                           final List<CertificateSigningRequestCondition> conditions) {
        this.certificate = certificate;
        this.conditions = conditions;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    public List<CertificateSigningRequestCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<CertificateSigningRequestCondition> conditions) {
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

    public CertificateSigningRequestStatus certificate(final String certificate) {
        this.certificate = certificate;
        return this;
    }

    public CertificateSigningRequestStatus conditions(final List<CertificateSigningRequestCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public CertificateSigningRequestStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (certificate != null ? "\"certificate\":\"" +  JsonStrings.escapeJson(certificate) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
