package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimParameters implements Validable<ResourceClaimParameters>, Exportable {
    private String apiVersion;
    private List<DriverRequests> driverRequests;
    private ResourceClaimParametersReference generatedFrom;
    private String kind;
    private ObjectMeta metadata;
    private Boolean shareable;

    public ResourceClaimParameters() {
        // no-op
    }

    public ResourceClaimParameters(final String apiVersion,
                                   final List<DriverRequests> driverRequests,
                                   final ResourceClaimParametersReference generatedFrom,
                                   final String kind,
                                   final ObjectMeta metadata,
                                   final Boolean shareable) {
        this.apiVersion = apiVersion;
        this.driverRequests = driverRequests;
        this.generatedFrom = generatedFrom;
        this.kind = kind;
        this.metadata = metadata;
        this.shareable = shareable;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<DriverRequests> getDriverRequests() {
        return driverRequests;
    }

    public void setDriverRequests(final List<DriverRequests> driverRequests) {
        this.driverRequests = driverRequests;
    }

    public ResourceClaimParametersReference getGeneratedFrom() {
        return generatedFrom;
    }

    public void setGeneratedFrom(final ResourceClaimParametersReference generatedFrom) {
        this.generatedFrom = generatedFrom;
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

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(final Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                driverRequests,
                generatedFrom,
                kind,
                metadata,
                shareable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimParameters)) {
            return false;
        }
        final ResourceClaimParameters __otherCasted = (ResourceClaimParameters) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(driverRequests, __otherCasted.driverRequests) &&
            Objects.equals(generatedFrom, __otherCasted.generatedFrom) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(shareable, __otherCasted.shareable);
    }

    public ResourceClaimParameters apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceClaimParameters driverRequests(final List<DriverRequests> driverRequests) {
        this.driverRequests = driverRequests;
        return this;
    }

    public ResourceClaimParameters generatedFrom(final ResourceClaimParametersReference generatedFrom) {
        this.generatedFrom = generatedFrom;
        return this;
    }

    public ResourceClaimParameters kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceClaimParameters metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceClaimParameters shareable(final Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    @Override
    public ResourceClaimParameters validate() {
        if (kind == null) {
            kind = "ResourceClaimParameters";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha2";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (driverRequests != null ? "\"driverRequests\":" + driverRequests.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (generatedFrom != null ? "\"generatedFrom\":" + generatedFrom.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (shareable != null ? "\"shareable\":" + shareable : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
