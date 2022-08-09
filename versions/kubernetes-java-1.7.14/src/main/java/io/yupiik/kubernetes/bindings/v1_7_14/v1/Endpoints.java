package io.yupiik.kubernetes.bindings.v1_7_14.v1;

import io.yupiik.kubernetes.bindings.v1_7_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_14.Validable;
import io.yupiik.kubernetes.bindings.v1_7_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Endpoints implements Validable<Endpoints>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<EndpointSubset> subsets;

    public Endpoints() {
        // no-op
    }

    public Endpoints(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final List<EndpointSubset> subsets) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
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

    public List<EndpointSubset> getSubsets() {
        return subsets;
    }

    public void setSubsets(final List<EndpointSubset> subsets) {
        this.subsets = subsets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                subsets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Endpoints)) {
            return false;
        }
        final Endpoints __otherCasted = (Endpoints) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(subsets, __otherCasted.subsets);
    }

    public Endpoints apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Endpoints kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Endpoints metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Endpoints subsets(final List<EndpointSubset> subsets) {
        this.subsets = subsets;
        return this;
    }

    @Override
    public Endpoints validate() {
        if (kind == null) {
            kind = "Endpoints";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (subsets == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "subsets", "subsets",
                "Missing 'subsets' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (subsets != null ? "\"subsets\":" + subsets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
