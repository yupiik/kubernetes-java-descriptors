package io.yupiik.kubernetes.bindings.v1_13_2.v1;

import java.util.Objects;

public class ReplicationControllerMetadataInitializersResult {
    private String apiVersion;
    private Integer code;
    private ReplicationControllerMetadataInitializersResultDetails details;
    private String kind;
    private String message;
    private ReplicationControllerMetadataInitializersResultMetadata metadata;
    private String reason;
    private String status;

    public ReplicationControllerMetadataInitializersResult() {
        // no-op
    }

    public ReplicationControllerMetadataInitializersResult(final String apiVersion,
                                                           final Integer code,
                                                           final ReplicationControllerMetadataInitializersResultDetails details,
                                                           final String kind,
                                                           final String message,
                                                           final ReplicationControllerMetadataInitializersResultMetadata metadata,
                                                           final String reason,
                                                           final String status) {
        // no-op
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

    public ReplicationControllerMetadataInitializersResultDetails getDetails() {
        return details;
    }

    public void setDetails(final ReplicationControllerMetadataInitializersResultDetails details) {
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

    public ReplicationControllerMetadataInitializersResultMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerMetadataInitializersResultMetadata metadata) {
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
        if (!(__other instanceof ReplicationControllerMetadataInitializersResult)) {
            return false;
        }
        final ReplicationControllerMetadataInitializersResult __otherCasted = (ReplicationControllerMetadataInitializersResult) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(code, __otherCasted.code) &&
            Objects.equals(details, __otherCasted.details) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status);
    }
}
