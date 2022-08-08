package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.Objects;

public class RoleBindingMetadataInitializersResultDetailsCauses {
    private String field;
    private String message;
    private String reason;

    public RoleBindingMetadataInitializersResultDetailsCauses() {
        // no-op
    }

    public RoleBindingMetadataInitializersResultDetailsCauses(final String field,
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
        if (!(__other instanceof RoleBindingMetadataInitializersResultDetailsCauses)) {
            return false;
        }
        final RoleBindingMetadataInitializersResultDetailsCauses __otherCasted = (RoleBindingMetadataInitializersResultDetailsCauses) __other;
        return Objects.equals(field, __otherCasted.field) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }
}
