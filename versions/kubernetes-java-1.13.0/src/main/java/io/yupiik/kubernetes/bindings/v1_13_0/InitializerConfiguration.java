package io.yupiik.kubernetes.bindings.v1_13_0;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class InitializerConfiguration {
    private String apiVersion;
    private List<JsonValue> initializers;
    private String kind;
    private InitializerConfigurationMetadata metadata;

    public InitializerConfiguration() {
        // no-op
    }

    public InitializerConfiguration(final String apiVersion,
                                    final List<JsonValue> initializers,
                                    final String kind,
                                    final InitializerConfigurationMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getInitializers() {
        return initializers;
    }

    public void setInitializers(final List<JsonValue> initializers) {
        this.initializers = initializers;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public InitializerConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final InitializerConfigurationMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                initializers,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof InitializerConfiguration)) {
            return false;
        }
        final InitializerConfiguration __otherCasted = (InitializerConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(initializers, __otherCasted.initializers) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
