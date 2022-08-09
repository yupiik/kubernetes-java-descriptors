package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import io.yupiik.kubernetes.bindings.v1_22_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_12.Validable;
import io.yupiik.kubernetes.bindings.v1_22_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ISCSIVolumeSource implements Validable<ISCSIVolumeSource>, Exportable {
    private Boolean chapAuthDiscovery;
    private Boolean chapAuthSession;
    private String fsType;
    private String initiatorName;
    private String iqn;
    private String iscsiInterface;
    private int lun;
    private List<String> portals;
    private Boolean readOnly;
    private LocalObjectReference secretRef;
    private String targetPortal;

    public ISCSIVolumeSource() {
        // no-op
    }

    public ISCSIVolumeSource(final Boolean chapAuthDiscovery,
                             final Boolean chapAuthSession,
                             final String fsType,
                             final String initiatorName,
                             final String iqn,
                             final String iscsiInterface,
                             final int lun,
                             final List<String> portals,
                             final Boolean readOnly,
                             final LocalObjectReference secretRef,
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

    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final LocalObjectReference secretRef) {
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
        if (!(__other instanceof ISCSIVolumeSource)) {
            return false;
        }
        final ISCSIVolumeSource __otherCasted = (ISCSIVolumeSource) __other;
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

    public ISCSIVolumeSource chapAuthDiscovery(final Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
        return this;
    }

    public ISCSIVolumeSource chapAuthSession(final Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
        return this;
    }

    public ISCSIVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ISCSIVolumeSource initiatorName(final String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    public ISCSIVolumeSource iqn(final String iqn) {
        this.iqn = iqn;
        return this;
    }

    public ISCSIVolumeSource iscsiInterface(final String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
        return this;
    }

    public ISCSIVolumeSource lun(final int lun) {
        this.lun = lun;
        return this;
    }

    public ISCSIVolumeSource portals(final List<String> portals) {
        this.portals = portals;
        return this;
    }

    public ISCSIVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ISCSIVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ISCSIVolumeSource targetPortal(final String targetPortal) {
        this.targetPortal = targetPortal;
        return this;
    }

    @Override
    public ISCSIVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (iqn == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "iqn", "iqn",
                "Missing 'iqn' attribute.", true));
        }
        if (targetPortal == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "targetPortal", "targetPortal",
                "Missing 'targetPortal' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (chapAuthDiscovery != null ? "\"chapAuthDiscovery\":" + chapAuthDiscovery : ""),
                    (chapAuthSession != null ? "\"chapAuthSession\":" + chapAuthSession : ""),
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (initiatorName != null ? "\"initiatorName\":\"" +  JsonStrings.escapeJson(initiatorName) + "\"" : ""),
                    (iqn != null ? "\"iqn\":\"" +  JsonStrings.escapeJson(iqn) + "\"" : ""),
                    (iscsiInterface != null ? "\"iscsiInterface\":\"" +  JsonStrings.escapeJson(iscsiInterface) + "\"" : ""),
                    "\"lun\":" + lun,
                    (portals != null ? "\"portals\":" + portals.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (targetPortal != null ? "\"targetPortal\":\"" +  JsonStrings.escapeJson(targetPortal) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
