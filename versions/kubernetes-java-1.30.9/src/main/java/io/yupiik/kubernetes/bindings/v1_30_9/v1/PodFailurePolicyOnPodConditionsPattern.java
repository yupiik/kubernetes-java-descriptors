package io.yupiik.kubernetes.bindings.v1_30_9.v1;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import io.yupiik.kubernetes.bindings.v1_30_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodFailurePolicyOnPodConditionsPattern implements Validable<PodFailurePolicyOnPodConditionsPattern>, Exportable {
    private String status;
    private String type;

    public PodFailurePolicyOnPodConditionsPattern() {
        // no-op
    }

    public PodFailurePolicyOnPodConditionsPattern(final String status,
                                                  final String type) {
        this.status = status;
        this.type = type;
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
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodFailurePolicyOnPodConditionsPattern)) {
            return false;
        }
        final PodFailurePolicyOnPodConditionsPattern __otherCasted = (PodFailurePolicyOnPodConditionsPattern) __other;
        return Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public PodFailurePolicyOnPodConditionsPattern status(final String status) {
        this.status = status;
        return this;
    }

    public PodFailurePolicyOnPodConditionsPattern type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public PodFailurePolicyOnPodConditionsPattern validate() {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
