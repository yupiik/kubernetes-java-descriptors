/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_18_8.v1;

import io.yupiik.kubernetes.bindings.v1_18_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_8.Validable;
import io.yupiik.kubernetes.bindings.v1_18_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ISCSIPersistentVolumeSource implements Validable<ISCSIPersistentVolumeSource>, Exportable {
    private Boolean chapAuthDiscovery;
    private Boolean chapAuthSession;
    private String fsType;
    private String initiatorName;
    private String iqn;
    private String iscsiInterface;
    private int lun;
    private List<String> portals;
    private Boolean readOnly;
    private SecretReference secretRef;
    private String targetPortal;

    public ISCSIPersistentVolumeSource() {
        // no-op
    }

    public ISCSIPersistentVolumeSource(final Boolean chapAuthDiscovery,
                                       final Boolean chapAuthSession,
                                       final String fsType,
                                       final String initiatorName,
                                       final String iqn,
                                       final String iscsiInterface,
                                       final int lun,
                                       final List<String> portals,
                                       final Boolean readOnly,
                                       final SecretReference secretRef,
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

    public SecretReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretReference secretRef) {
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
        if (!(__other instanceof ISCSIPersistentVolumeSource)) {
            return false;
        }
        final ISCSIPersistentVolumeSource __otherCasted = (ISCSIPersistentVolumeSource) __other;
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

    public ISCSIPersistentVolumeSource chapAuthDiscovery(final Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
        return this;
    }

    public ISCSIPersistentVolumeSource chapAuthSession(final Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
        return this;
    }

    public ISCSIPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ISCSIPersistentVolumeSource initiatorName(final String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    public ISCSIPersistentVolumeSource iqn(final String iqn) {
        this.iqn = iqn;
        return this;
    }

    public ISCSIPersistentVolumeSource iscsiInterface(final String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
        return this;
    }

    public ISCSIPersistentVolumeSource lun(final int lun) {
        this.lun = lun;
        return this;
    }

    public ISCSIPersistentVolumeSource portals(final List<String> portals) {
        this.portals = portals;
        return this;
    }

    public ISCSIPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ISCSIPersistentVolumeSource secretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ISCSIPersistentVolumeSource targetPortal(final String targetPortal) {
        this.targetPortal = targetPortal;
        return this;
    }

    @Override
    public ISCSIPersistentVolumeSource validate() {
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
