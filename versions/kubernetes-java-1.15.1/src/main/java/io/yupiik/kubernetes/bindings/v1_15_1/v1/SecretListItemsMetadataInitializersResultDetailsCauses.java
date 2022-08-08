package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.Objects;

public class SecretListItemsMetadataInitializersResultDetailsCauses {
    private String field;
    private String message;
    private String reason;

    public SecretListItemsMetadataInitializersResultDetailsCauses() {
        // no-op
    }

    public SecretListItemsMetadataInitializersResultDetailsCauses(final String field,
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
        if (!(__other instanceof SecretListItemsMetadataInitializersResultDetailsCauses)) {
            return false;
        }
        final SecretListItemsMetadataInitializersResultDetailsCauses __otherCasted = (SecretListItemsMetadataInitializersResultDetailsCauses) __other;
        return Objects.equals(field, __otherCasted.field) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
