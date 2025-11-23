package io.yupiik.kubernetes.bindings.v1_29_12.v1;

import io.yupiik.kubernetes.bindings.v1_29_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Status implements Validable<Status>, Exportable {
    private String apiVersion;
    private Integer code;
    private StatusDetails details;
    private String kind;
    private String message;
    private ListMeta metadata;
    private String reason;
    private String status;

    public Status() {
        // no-op
    }

    public Status(final String apiVersion,
                  final Integer code,
                  final StatusDetails details,
                  final String kind,
                  final String message,
                  final ListMeta metadata,
                  final String reason,
                  final String status) {
        this.apiVersion = apiVersion;
        this.code = code;
        this.details = details;
        this.kind = kind;
        this.message = message;
        this.metadata = metadata;
        this.reason = reason;
        this.status = status;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public StatusDetails getDetails() {
        return details;
    }

    public void setDetails(final StatusDetails details) {
        this.details = details;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ListMeta metadata) {
        this.metadata = metadata;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                code,
                details,
                kind,
                message,
                metadata,
                reason,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Status)) {
            return false;
        }
        final Status __otherCasted = (Status) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(code, __otherCasted.code) &&
            Objects.equals(details, __otherCasted.details) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status);
    }

    public Status apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Status code(final Integer code) {
        this.code = code;
        return this;
    }

    public Status details(final StatusDetails details) {
        this.details = details;
        return this;
    }

    public Status kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Status message(final String message) {
        this.message = message;
        return this;
    }

    public Status metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Status reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public Status status(final String status) {
        this.status = status;
        return this;
    }

    @Override
    public Status validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (code != null ? "\"code\":" + code : ""),
                    (details != null ? "\"details\":" + details.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
