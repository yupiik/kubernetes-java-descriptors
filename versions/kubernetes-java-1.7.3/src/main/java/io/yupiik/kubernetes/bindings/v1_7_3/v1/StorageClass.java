package io.yupiik.kubernetes.bindings.v1_7_3.v1;

import java.util.Map;
import java.util.Objects;

public class StorageClass {
    private String apiVersion;
    private String kind;
    private StorageClassMetadata metadata;
    private Map<String, String> parameters;
    private String provisioner;

    public StorageClass() {
        // no-op
    }

    public StorageClass(final String apiVersion,
                        final String kind,
                        final StorageClassMetadata metadata,
                        final Map<String, String> parameters,
                        final String provisioner) {
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

    public StorageClassMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StorageClassMetadata metadata) {
        this.metadata = metadata;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getProvisioner() {
        return provisioner;
    }

    public void setProvisioner(final String provisioner) {
        this.provisioner = provisioner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                parameters,
                provisioner);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClass)) {
            return false;
        }
        final StorageClass __otherCasted = (StorageClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(parameters, __otherCasted.parameters) &&
            Objects.equals(provisioner, __otherCasted.provisioner);
    }
}
