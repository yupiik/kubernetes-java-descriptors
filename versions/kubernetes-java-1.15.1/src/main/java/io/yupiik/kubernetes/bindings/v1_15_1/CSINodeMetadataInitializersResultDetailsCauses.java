package io.yupiik.kubernetes.bindings.v1_15_1;

import java.util.Objects;

public class CSINodeMetadataInitializersResultDetailsCauses {
    private String field;
    private String message;
    private String reason;

    public CSINodeMetadataInitializersResultDetailsCauses() {
        // no-op
    }

    public CSINodeMetadataInitializersResultDetailsCauses(final String field,
                                                          final String message,
                                                          final String reason) {
        // no-op
    }

    public String getField() {
        return field;
    }

    public void setField(final String field) {
        this.field = field;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                field,
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeMetadataInitializersResultDetailsCauses)) {
            return false;
        }
        final CSINodeMetadataInitializersResultDetailsCauses __otherCasted = (CSINodeMetadataInitializersResultDetailsCauses) __other;
        return Objects.equals(field, __otherCasted.field) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
