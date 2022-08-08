package io.yupiik.kubernetes.bindings.v1_17_7.v1;

import io.yupiik.kubernetes.bindings.v1_17_7.Validable;
import io.yupiik.kubernetes.bindings.v1_17_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimCondition implements Validable<PersistentVolumeClaimCondition> {
    private String lastProbeTime;
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public PersistentVolumeClaimCondition() {
        // no-op
    }

    public PersistentVolumeClaimCondition(final String lastProbeTime,
                                          final String lastTransitionTime,
                                          final String message,
                                          final String reason,
                                          final String status,
                                          final String type) {
        // no-op
    }

    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(final String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
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
                lastProbeTime,
                lastTransitionTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimCondition)) {
            return false;
        }
        final PersistentVolumeClaimCondition __otherCasted = (PersistentVolumeClaimCondition) __other;
        return Objects.equals(lastProbeTime, __otherCasted.lastProbeTime) &&
            Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public PersistentVolumeClaimCondition lastProbeTime(final String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    public PersistentVolumeClaimCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public PersistentVolumeClaimCondition message(final String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeClaimCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public PersistentVolumeClaimCondition status(final String status) {
        this.status = status;
        return this;
    }

    public PersistentVolumeClaimCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public PersistentVolumeClaimCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (status == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "status", "status",
                "Missing 'status' attribute.", true));
        }
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
}
