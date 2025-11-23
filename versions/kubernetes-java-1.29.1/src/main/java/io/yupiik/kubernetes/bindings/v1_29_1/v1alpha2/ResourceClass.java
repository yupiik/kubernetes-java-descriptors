package io.yupiik.kubernetes.bindings.v1_29_1.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_29_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_1.Validable;
import io.yupiik.kubernetes.bindings.v1_29_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClass implements Validable<ResourceClass>, Exportable {
    private String apiVersion;
    private String driverName;
    private String kind;
    private ObjectMeta metadata;
    private ResourceClassParametersReference parametersRef;
    private NodeSelector suitableNodes;

    public ResourceClass() {
        // no-op
    }

    public ResourceClass(final String apiVersion,
                         final String driverName,
                         final String kind,
                         final ObjectMeta metadata,
                         final ResourceClassParametersReference parametersRef,
                         final NodeSelector suitableNodes) {
        this.apiVersion = apiVersion;
        this.driverName = driverName;
        this.kind = kind;
        this.metadata = metadata;
        this.parametersRef = parametersRef;
        this.suitableNodes = suitableNodes;
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

    public ResourceClassParametersReference getParametersRef() {
        return parametersRef;
    }

    public void setParametersRef(final ResourceClassParametersReference parametersRef) {
        this.parametersRef = parametersRef;
    }

    public NodeSelector getSuitableNodes() {
        return suitableNodes;
    }

    public void setSuitableNodes(final NodeSelector suitableNodes) {
        this.suitableNodes = suitableNodes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                driverName,
                kind,
                metadata,
                parametersRef,
                suitableNodes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClass)) {
            return false;
        }
        final ResourceClass __otherCasted = (ResourceClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(parametersRef, __otherCasted.parametersRef) &&
            Objects.equals(suitableNodes, __otherCasted.suitableNodes);
    }

    public ResourceClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceClass driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public ResourceClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceClass parametersRef(final ResourceClassParametersReference parametersRef) {
        this.parametersRef = parametersRef;
        return this;
    }

    public ResourceClass suitableNodes(final NodeSelector suitableNodes) {
        this.suitableNodes = suitableNodes;
        return this;
    }

    @Override
    public ResourceClass validate() {
        if (kind == null) {
            kind = "ResourceClass";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha2";
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
                    (parametersRef != null ? "\"parametersRef\":" + parametersRef.asJson() : ""),
                    (suitableNodes != null ? "\"suitableNodes\":" + suitableNodes.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
