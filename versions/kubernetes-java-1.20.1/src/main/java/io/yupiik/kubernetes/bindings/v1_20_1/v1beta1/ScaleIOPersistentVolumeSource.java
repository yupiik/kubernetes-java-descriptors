package io.yupiik.kubernetes.bindings.v1_20_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_1.Validable;
import io.yupiik.kubernetes.bindings.v1_20_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScaleIOPersistentVolumeSource implements Validable<ScaleIOPersistentVolumeSource> {
    private String fsType;
    private String gateway;
    private String protectionDomain;
    private Boolean readOnly;
    private SecretReference secretRef;
    private Boolean sslEnabled;
    private String storageMode;
    private String storagePool;
    private String system;
    private String volumeName;

    public ScaleIOPersistentVolumeSource() {
        // no-op
    }

    public ScaleIOPersistentVolumeSource(final String fsType,
                                         final String gateway,
                                         final String protectionDomain,
                                         final Boolean readOnly,
                                         final SecretReference secretRef,
                                         final Boolean sslEnabled,
                                         final String storageMode,
                                         final String storagePool,
                                         final String system,
                                         final String volumeName) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(final String gateway) {
        this.gateway = gateway;
    }

    public String getProtectionDomain() {
        return protectionDomain;
    }

    public void setProtectionDomain(final String protectionDomain) {
        this.protectionDomain = protectionDomain;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public SecretReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
    }

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(final Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(final String storageMode) {
        this.storageMode = storageMode;
    }

    public String getStoragePool() {
        return storagePool;
    }

    public void setStoragePool(final String storagePool) {
        this.storagePool = storagePool;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(final String system) {
        this.system = system;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                gateway,
                protectionDomain,
                readOnly,
                secretRef,
                sslEnabled,
                storageMode,
                storagePool,
                system,
                volumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleIOPersistentVolumeSource)) {
            return false;
        }
        final ScaleIOPersistentVolumeSource __otherCasted = (ScaleIOPersistentVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(gateway, __otherCasted.gateway) &&
            Objects.equals(protectionDomain, __otherCasted.protectionDomain) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(sslEnabled, __otherCasted.sslEnabled) &&
            Objects.equals(storageMode, __otherCasted.storageMode) &&
            Objects.equals(storagePool, __otherCasted.storagePool) &&
            Objects.equals(system, __otherCasted.system) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }

    public ScaleIOPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ScaleIOPersistentVolumeSource gateway(final String gateway) {
        this.gateway = gateway;
        return this;
    }

    public ScaleIOPersistentVolumeSource protectionDomain(final String protectionDomain) {
        this.protectionDomain = protectionDomain;
        return this;
    }

    public ScaleIOPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ScaleIOPersistentVolumeSource secretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ScaleIOPersistentVolumeSource sslEnabled(final Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    public ScaleIOPersistentVolumeSource storageMode(final String storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    public ScaleIOPersistentVolumeSource storagePool(final String storagePool) {
        this.storagePool = storagePool;
        return this;
    }

    public ScaleIOPersistentVolumeSource system(final String system) {
        this.system = system;
        return this;
    }

    public ScaleIOPersistentVolumeSource volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public ScaleIOPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (gateway == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "gateway", "gateway",
                "Missing 'gateway' attribute.", true));
        }
        if (secretRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "secretRef", "secretRef",
                "Missing 'secretRef' attribute.", true));
        }
        if (system == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "system", "system",
                "Missing 'system' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
