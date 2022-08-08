package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.Objects;

public class PriorityClassListItemsMetadataInitializersResult {
    private String apiVersion;
    private Integer code;
    private PriorityClassListItemsMetadataInitializersResultDetails details;
    private String kind;
    private String message;
    private PriorityClassListItemsMetadataInitializersResultMetadata metadata;
    private String reason;
    private String status;

    public PriorityClassListItemsMetadataInitializersResult() {
        // no-op
    }

    public PriorityClassListItemsMetadataInitializersResult(final String apiVersion,
                                                            final Integer code,
                                                            final PriorityClassListItemsMetadataInitializersResultDetails details,
                                                            final String kind,
                                                            final String message,
                                                            final PriorityClassListItemsMetadataInitializersResultMetadata metadata,
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

    public PriorityClassListItemsMetadataInitializersResultDetails getDetails() {
        return details;
    }

    public void setDetails(final PriorityClassListItemsMetadataInitializersResultDetails details) {
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

    public PriorityClassListItemsMetadataInitializersResultMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityClassListItemsMetadataInitializersResultMetadata metadata) {
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
        if (!(__other instanceof PriorityClassListItemsMetadataInitializersResult)) {
            return false;
        }
        final PriorityClassListItemsMetadataInitializersResult __otherCasted = (PriorityClassListItemsMetadataInitializersResult) __other;
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
