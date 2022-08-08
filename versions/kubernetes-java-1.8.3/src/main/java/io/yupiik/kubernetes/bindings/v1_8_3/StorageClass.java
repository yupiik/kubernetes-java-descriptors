package io.yupiik.kubernetes.bindings.v1_8_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StorageClass {
    private Boolean allowVolumeExpansion;
    private String apiVersion;
    private String kind;
    private StorageClassMetadata metadata;
    private List<String> mountOptions;
    private Map<String, String> parameters;
    private String provisioner;
    private String reclaimPolicy;

    public StorageClass() {
        // no-op
    }

    public StorageClass(final Boolean allowVolumeExpansion,
                        final String apiVersion,
                        final String kind,
                        final StorageClassMetadata metadata,
                        final List<String> mountOptions,
                        final Map<String, String> parameters,
                        final String provisioner,
                        final String reclaimPolicy) {
        // no-op
    }

    public Boolean getAllowVolumeExpansion() {
        return allowVolumeExpansion;
    }

    public void setAllowVolumeExpansion(final Boolean allowVolumeExpansion) {
        this.allowVolumeExpansion = allowVolumeExpansion;
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

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
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

    public String getReclaimPolicy() {
        return reclaimPolicy;
    }

    public void setReclaimPolicy(final String reclaimPolicy) {
        this.reclaimPolicy = reclaimPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowVolumeExpansion,
                apiVersion,
                kind,
                metadata,
                mountOptions,
                parameters,
                provisioner,
                reclaimPolicy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClass)) {
            return false;
        }
        final StorageClass __otherCasted = (StorageClass) __other;
        return Objects.equals(allowVolumeExpansion, __otherCasted.allowVolumeExpansion) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(mountOptions, __otherCasted.mountOptions) &&
            Objects.equals(parameters, __otherCasted.parameters) &&
            Objects.equals(provisioner, __otherCasted.provisioner) &&
            Objects.equals(reclaimPolicy, __otherCasted.reclaimPolicy);
    }
}
