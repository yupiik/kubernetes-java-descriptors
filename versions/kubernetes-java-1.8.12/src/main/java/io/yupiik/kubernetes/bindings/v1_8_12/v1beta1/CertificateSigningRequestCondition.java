package io.yupiik.kubernetes.bindings.v1_8_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_12.Validable;
import io.yupiik.kubernetes.bindings.v1_8_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CertificateSigningRequestCondition implements Validable<CertificateSigningRequestCondition>, Exportable {
    private String lastUpdateTime;
    private String message;
    private String reason;
    private String type;

    public CertificateSigningRequestCondition() {
        // no-op
    }

    public CertificateSigningRequestCondition(final String lastUpdateTime,
                                              final String message,
                                              final String reason,
                                              final String type) {
        // no-op
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lastUpdateTime,
                message,
                reason,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestCondition)) {
            return false;
        }
        final CertificateSigningRequestCondition __otherCasted = (CertificateSigningRequestCondition) __other;
        return Objects.equals(lastUpdateTime, __otherCasted.lastUpdateTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(type, __otherCasted.type);
    }

    public CertificateSigningRequestCondition lastUpdateTime(final String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public CertificateSigningRequestCondition message(final String message) {
        this.message = message;
        return this;
    }

    public CertificateSigningRequestCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public CertificateSigningRequestCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public CertificateSigningRequestCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (lastUpdateTime != null ? "\"lastUpdateTime\":\"" +  JsonStrings.escapeJson(lastUpdateTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
