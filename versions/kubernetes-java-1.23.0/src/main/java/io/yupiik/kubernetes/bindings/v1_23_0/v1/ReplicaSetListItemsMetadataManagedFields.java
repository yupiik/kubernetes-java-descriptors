package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class ReplicaSetListItemsMetadataManagedFields {
    private String apiVersion;
    private String fieldsType;
    private JsonObject fieldsV1;
    private String manager;
    private String operation;
    private String subresource;
    private String time;

    public ReplicaSetListItemsMetadataManagedFields() {
        // no-op
    }

    public ReplicaSetListItemsMetadataManagedFields(final String apiVersion,
                                                    final String fieldsType,
                                                    final JsonObject fieldsV1,
                                                    final String manager,
                                                    final String operation,
                                                    final String subresource,
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

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(final String subresource) {
        this.subresource = subresource;
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
                subresource,
                time);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsMetadataManagedFields)) {
            return false;
        }
        final ReplicaSetListItemsMetadataManagedFields __otherCasted = (ReplicaSetListItemsMetadataManagedFields) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldsType, __otherCasted.fieldsType) &&
            Objects.equals(fieldsV1, __otherCasted.fieldsV1) &&
            Objects.equals(manager, __otherCasted.manager) &&
            Objects.equals(operation, __otherCasted.operation) &&
            Objects.equals(subresource, __otherCasted.subresource) &&
            Objects.equals(time, __otherCasted.time);
    }
}
