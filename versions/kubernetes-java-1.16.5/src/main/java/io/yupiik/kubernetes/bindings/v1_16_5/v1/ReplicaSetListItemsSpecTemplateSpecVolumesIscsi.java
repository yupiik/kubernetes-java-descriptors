package io.yupiik.kubernetes.bindings.v1_16_5.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesIscsi {
    private Boolean chapAuthDiscovery;
    private Boolean chapAuthSession;
    private String fsType;
    private String initiatorName;
    private String iqn;
    private String iscsiInterface;
    private int lun;
    private List<String> portals;
    private Boolean readOnly;
    private ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef secretRef;
    private String targetPortal;

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsi() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsi(final Boolean chapAuthDiscovery,
                                                           final Boolean chapAuthSession,
                                                           final String fsType,
                                                           final String initiatorName,
                                                           final String iqn,
                                                           final String iscsiInterface,
                                                           final int lun,
                                                           final List<String> portals,
                                                           final Boolean readOnly,
                                                           final ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef secretRef,
                                                           final String targetPortal) {
        // no-op
    }

    public Boolean getChapAuthDiscovery() {
        return chapAuthDiscovery;
    }

    public void setChapAuthDiscovery(final Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
    }

    public Boolean getChapAuthSession() {
        return chapAuthSession;
    }

    public void setChapAuthSession(final Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(final String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public String getIqn() {
        return iqn;
    }

    public void setIqn(final String iqn) {
        this.iqn = iqn;
    }

    public String getIscsiInterface() {
        return iscsiInterface;
    }

    public void setIscsiInterface(final String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
    }

    public int getLun() {
        return lun;
    }

    public void setLun(final int lun) {
        this.lun = lun;
    }

    public List<String> getPortals() {
        return portals;
    }

    public void setPortals(final List<String> portals) {
        this.portals = portals;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecVolumesIscsiSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    public String getTargetPortal() {
        return targetPortal;
    }

    public void setTargetPortal(final String targetPortal) {
        this.targetPortal = targetPortal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                chapAuthDiscovery,
                chapAuthSession,
                fsType,
                initiatorName,
                iqn,
                iscsiInterface,
                lun,
                portals,
                readOnly,
                secretRef,
                targetPortal);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesIscsi)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesIscsi __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesIscsi) __other;
        return Objects.equals(chapAuthDiscovery, __otherCasted.chapAuthDiscovery) &&
            Objects.equals(chapAuthSession, __otherCasted.chapAuthSession) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(initiatorName, __otherCasted.initiatorName) &&
            Objects.equals(iqn, __otherCasted.iqn) &&
            Objects.equals(iscsiInterface, __otherCasted.iscsiInterface) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(portals, __otherCasted.portals) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(targetPortal, __otherCasted.targetPortal);
    }
}
