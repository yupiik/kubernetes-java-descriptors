package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesScaleIO {
    private String fsType;
    private String gateway;
    private String protectionDomain;
    private Boolean readOnly;
    private DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef secretRef;
    private Boolean sslEnabled;
    private String storageMode;
    private String storagePool;
    private String system;
    private String volumeName;

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIO() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIO(final String fsType,
                                                            final String gateway,
                                                            final String protectionDomain,
                                                            final Boolean readOnly,
                                                            final DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef secretRef,
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

    public DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesScaleIO)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesScaleIO __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesScaleIO) __other;
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
}
