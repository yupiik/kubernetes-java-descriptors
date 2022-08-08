package io.yupiik.kubernetes.bindings.v1_12_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_12_3.Validable;
import io.yupiik.kubernetes.bindings.v1_12_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InitializerConfiguration implements Validable<InitializerConfiguration> {
    private String apiVersion;
    private List<Initializer> initializers;
    private String kind;
    private ObjectMeta metadata;

    public InitializerConfiguration() {
        // no-op
    }

    public InitializerConfiguration(final String apiVersion,
                                    final List<Initializer> initializers,
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

    public List<Initializer> getInitializers() {
        return initializers;
    }

    public void setInitializers(final List<Initializer> initializers) {
        this.initializers = initializers;
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

    public InitializerConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public InitializerConfiguration initializers(final List<Initializer> initializers) {
        this.initializers = initializers;
        return this;
    }

    public InitializerConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public InitializerConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public InitializerConfiguration validate() {
        return this;
    }
}
