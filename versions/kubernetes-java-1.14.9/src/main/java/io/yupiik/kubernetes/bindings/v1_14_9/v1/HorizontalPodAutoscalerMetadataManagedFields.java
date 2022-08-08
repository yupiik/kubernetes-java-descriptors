package io.yupiik.kubernetes.bindings.v1_14_9.v1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class HorizontalPodAutoscalerMetadataManagedFields {
    private String apiVersion;
    private JsonObject fields;
    private String manager;
    private String operation;
    private String time;

    public HorizontalPodAutoscalerMetadataManagedFields() {
        // no-op
    }

    public HorizontalPodAutoscalerMetadataManagedFields(final String apiVersion,
                                                        final JsonObject fields,
                                                        final String manager,
                                                        final String operation,
                                                        final String time) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public JsonObject getFields() {
        return fields;
    }

    public void setFields(final JsonObject fields) {
        this.fields = fields;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(final String manager) {
        this.manager = manager;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(final String operation) {
        this.operation = operation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fields,
                manager,
                operation,
                time);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerMetadataManagedFields)) {
            return false;
        }
        final HorizontalPodAutoscalerMetadataManagedFields __otherCasted = (HorizontalPodAutoscalerMetadataManagedFields) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fields, __otherCasted.fields) &&
            Objects.equals(manager, __otherCasted.manager) &&
            Objects.equals(operation, __otherCasted.operation) &&
            Objects.equals(time, __otherCasted.time);
    }
}
