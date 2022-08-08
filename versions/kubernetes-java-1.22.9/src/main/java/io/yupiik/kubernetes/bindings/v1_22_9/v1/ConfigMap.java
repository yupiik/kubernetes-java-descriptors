package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import io.yupiik.kubernetes.bindings.v1_22_9.Validable;
import io.yupiik.kubernetes.bindings.v1_22_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ConfigMap implements Validable<ConfigMap> {
    private String apiVersion;
    private Map<String, String> binaryData;
    private Map<String, String> data;
    private Boolean immutable;
    private String kind;
    private ObjectMeta metadata;

    public ConfigMap() {
        // no-op
    }

    public ConfigMap(final String apiVersion,
                     final Map<String, String> binaryData,
                     final Map<String, String> data,
                     final Boolean immutable,
                     final String kind,
                     final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Map<String, String> getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(final Map<String, String> binaryData) {
        this.binaryData = binaryData;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(final Map<String, String> data) {
        this.data = data;
    }

    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(final Boolean immutable) {
        this.immutable = immutable;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                binaryData,
                data,
                immutable,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ConfigMap)) {
            return false;
        }
        final ConfigMap __otherCasted = (ConfigMap) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(binaryData, __otherCasted.binaryData) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(immutable, __otherCasted.immutable) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ConfigMap apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ConfigMap binaryData(final Map<String, String> binaryData) {
        this.binaryData = binaryData;
        return this;
    }

    public ConfigMap data(final Map<String, String> data) {
        this.data = data;
        return this;
    }

    public ConfigMap immutable(final Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    public ConfigMap kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ConfigMap metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ConfigMap validate() {
        return this;
    }
}
