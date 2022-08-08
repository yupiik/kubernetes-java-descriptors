package io.yupiik.kubernetes.bindings.v1_16_8.v1;

import java.util.Map;
import java.util.Objects;

public class SecretListItems {
    private String apiVersion;
    private Map<String, String> data;
    private String kind;
    private SecretListItemsMetadata metadata;
    private Map<String, String> stringData;
    private String type;

    public SecretListItems() {
        // no-op
    }

    public SecretListItems(final String apiVersion,
                           final Map<String, String> data,
                           final String kind,
                           final SecretListItemsMetadata metadata,
                           final Map<String, String> stringData,
                           final String type) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(final Map<String, String> data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public SecretListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final SecretListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public Map<String, String> getStringData() {
        return stringData;
    }

    public void setStringData(final Map<String, String> stringData) {
        this.stringData = stringData;
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
                apiVersion,
                data,
                kind,
                metadata,
                stringData,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretListItems)) {
            return false;
        }
        final SecretListItems __otherCasted = (SecretListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(stringData, __otherCasted.stringData) &&
            Objects.equals(type, __otherCasted.type);
    }
}
