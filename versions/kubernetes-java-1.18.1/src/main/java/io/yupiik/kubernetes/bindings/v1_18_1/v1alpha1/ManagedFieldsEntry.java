package io.yupiik.kubernetes.bindings.v1_18_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_1.Validable;
import io.yupiik.kubernetes.bindings.v1_18_1.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ManagedFieldsEntry implements Validable<ManagedFieldsEntry>, Exportable {
    private String apiVersion;
    private String fieldsType;
    private JsonObject fieldsV1;
    private String manager;
    private String operation;
    private String time;

    public ManagedFieldsEntry() {
        // no-op
    }

    public ManagedFieldsEntry(final String apiVersion,
                              final String fieldsType,
                              final JsonObject fieldsV1,
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

    public String getFieldsType() {
        return fieldsType;
    }

    public void setFieldsType(final String fieldsType) {
        this.fieldsType = fieldsType;
    }

    public JsonObject getFieldsV1() {
        return fieldsV1;
    }

    public void setFieldsV1(final JsonObject fieldsV1) {
        this.fieldsV1 = fieldsV1;
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
                fieldsType,
                fieldsV1,
                manager,
                operation,
                time);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ManagedFieldsEntry)) {
            return false;
        }
        final ManagedFieldsEntry __otherCasted = (ManagedFieldsEntry) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldsType, __otherCasted.fieldsType) &&
            Objects.equals(fieldsV1, __otherCasted.fieldsV1) &&
            Objects.equals(manager, __otherCasted.manager) &&
            Objects.equals(operation, __otherCasted.operation) &&
            Objects.equals(time, __otherCasted.time);
    }

    public ManagedFieldsEntry apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ManagedFieldsEntry fieldsType(final String fieldsType) {
        this.fieldsType = fieldsType;
        return this;
    }

    public ManagedFieldsEntry fieldsV1(final JsonObject fieldsV1) {
        this.fieldsV1 = fieldsV1;
        return this;
    }

    public ManagedFieldsEntry manager(final String manager) {
        this.manager = manager;
        return this;
    }

    public ManagedFieldsEntry operation(final String operation) {
        this.operation = operation;
        return this;
    }

    public ManagedFieldsEntry time(final String time) {
        this.time = time;
        return this;
    }

    @Override
    public ManagedFieldsEntry validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (fieldsType != null ? "\"fieldsType\":\"" +  JsonStrings.escapeJson(fieldsType) + "\"" : ""),
                    (fieldsV1 != null ? "\"fieldsV1\":" + fieldsV1 : ""),
                    (manager != null ? "\"manager\":\"" +  JsonStrings.escapeJson(manager) + "\"" : ""),
                    (operation != null ? "\"operation\":\"" +  JsonStrings.escapeJson(operation) + "\"" : ""),
                    (time != null ? "\"time\":\"" +  JsonStrings.escapeJson(time) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
