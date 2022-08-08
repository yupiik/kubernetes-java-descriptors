package io.yupiik.kubernetes.bindings.v1_20_7;

import java.util.Map;
import java.util.Objects;

public class ConfigMapListItems {
    private String apiVersion;
    private Map<String, String> binaryData;
    private Map<String, String> data;
    private Boolean immutable;
    private String kind;
    private ConfigMapListItemsMetadata metadata;

    public ConfigMapListItems() {
        // no-op
    }

    public ConfigMapListItems(final String apiVersion,
                              final Map<String, String> binaryData,
                              final Map<String, String> data,
                              final Boolean immutable,
                              final String kind,
                              final ConfigMapListItemsMetadata metadata) {
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

    public ConfigMapListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ConfigMapListItemsMetadata metadata) {
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
        if (!(__other instanceof ConfigMapListItems)) {
            return false;
        }
        final ConfigMapListItems __otherCasted = (ConfigMapListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(binaryData, __otherCasted.binaryData) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(immutable, __otherCasted.immutable) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
