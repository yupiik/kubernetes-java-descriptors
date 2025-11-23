package io.yupiik.kubernetes.bindings.v1_30_0.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_0.Validable;
import io.yupiik.kubernetes.bindings.v1_30_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceSlice implements Validable<ResourceSlice>, Exportable {
    private String apiVersion;
    private String driverName;
    private String kind;
    private ObjectMeta metadata;
    private NamedResourcesResources namedResources;
    private String nodeName;

    public ResourceSlice() {
        // no-op
    }

    public ResourceSlice(final String apiVersion,
                         final String driverName,
                         final String kind,
                         final ObjectMeta metadata,
                         final NamedResourcesResources namedResources,
                         final String nodeName) {
        this.apiVersion = apiVersion;
        this.driverName = driverName;
        this.kind = kind;
        this.metadata = metadata;
        this.namedResources = namedResources;
        this.nodeName = nodeName;
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

    public NamedResourcesResources getNamedResources() {
        return namedResources;
    }

    public void setNamedResources(final NamedResourcesResources namedResources) {
        this.namedResources = namedResources;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                driverName,
                kind,
                metadata,
                namedResources,
                nodeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceSlice)) {
            return false;
        }
        final ResourceSlice __otherCasted = (ResourceSlice) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(namedResources, __otherCasted.namedResources) &&
            Objects.equals(nodeName, __otherCasted.nodeName);
    }

    public ResourceSlice apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceSlice driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public ResourceSlice kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceSlice metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceSlice namedResources(final NamedResourcesResources namedResources) {
        this.namedResources = namedResources;
        return this;
    }

    public ResourceSlice nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    @Override
    public ResourceSlice validate() {
        if (kind == null) {
            kind = "ResourceSlice";
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
                    (namedResources != null ? "\"namedResources\":" + namedResources.asJson() : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
