package io.yupiik.kubernetes.bindings.v1_31_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttributesClass implements Validable<VolumeAttributesClass>, Exportable {
    private String apiVersion;
    private String driverName;
    private String kind;
    private ObjectMeta metadata;
    private Map<String, String> parameters;

    public VolumeAttributesClass() {
        // no-op
    }

    public VolumeAttributesClass(final String apiVersion,
                                 final String driverName,
                                 final String kind,
                                 final ObjectMeta metadata,
                                 final Map<String, String> parameters) {
        this.apiVersion = apiVersion;
        this.driverName = driverName;
        this.kind = kind;
        this.metadata = metadata;
        this.parameters = parameters;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
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

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                driverName,
                kind,
                metadata,
                parameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttributesClass)) {
            return false;
        }
        final VolumeAttributesClass __otherCasted = (VolumeAttributesClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(parameters, __otherCasted.parameters);
    }

    public VolumeAttributesClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public VolumeAttributesClass driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public VolumeAttributesClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public VolumeAttributesClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public VolumeAttributesClass parameters(final Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public VolumeAttributesClass validate() {
        if (kind == null) {
            kind = "VolumeAttributesClass";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1beta1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driverName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driverName", "driverName",
                "Missing 'driverName' attribute.", true));
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
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (parameters != null ? "\"parameters\":" + parameters.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
