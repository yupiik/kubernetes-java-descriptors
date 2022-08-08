package io.yupiik.kubernetes.bindings.v1_9_5;

import java.util.Map;
import java.util.Objects;

public class ConfigMap {
    private String apiVersion;
    private Map<String, String> data;
    private String kind;
    private ConfigMapMetadata metadata;

    public ConfigMap() {
        // no-op
    }

    public ConfigMap(final String apiVersion,
                     final Map<String, String> data,
                     final String kind,
                     final ConfigMapMetadata metadata) {
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

    public ConfigMapMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ConfigMapMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                data,
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
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
