package io.yupiik.kubernetes.bindings.v1_7_15.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_7_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_15.Validable;
import io.yupiik.kubernetes.bindings.v1_7_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class InitializerConfiguration implements Validable<InitializerConfiguration>, Exportable {
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
        if (kind == null) {
            kind = "InitializerConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (initializers != null ? "\"initializers\":" + initializers.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
