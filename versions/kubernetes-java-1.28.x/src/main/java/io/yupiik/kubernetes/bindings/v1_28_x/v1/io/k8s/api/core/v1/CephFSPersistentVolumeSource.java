/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import io.yupiik.kubernetes.bindings.v1_28_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.CephFSPersistentVolumeSource implements Validable<io.k8s.api.core.v1.CephFSPersistentVolumeSource>, Exportable {
    private List<String> monitors;
    private String path;
    private Boolean readOnly;
    private String secretFile;
    private SecretReference secretRef;
    private String user;

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource() {
        // no-op
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource(final List<String> monitors,
                                                           final String path,
                                                           final Boolean readOnly,
                                                           final String secretFile,
                                                           final SecretReference secretRef,
                                                           final String user) {
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    public List<String> getMonitors() {
        return monitors;
    }

    public void setMonitors(final List<String> monitors) {
        this.monitors = monitors;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSecretFile() {
        return secretFile;
    }

    public void setSecretFile(final String secretFile) {
        this.secretFile = secretFile;
    }

    public SecretReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                monitors,
                path,
                readOnly,
                secretFile,
                secretRef,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.CephFSPersistentVolumeSource)) {
            return false;
        }
        final io.k8s.api.core.v1.CephFSPersistentVolumeSource __otherCasted = (io.k8s.api.core.v1.CephFSPersistentVolumeSource) __other;
        return Objects.equals(monitors, __otherCasted.monitors) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretFile, __otherCasted.secretFile) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(user, __otherCasted.user);
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource monitors(final List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource path(final String path) {
        this.path = path;
        return this;
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource secretFile(final String secretFile) {
        this.secretFile = secretFile;
        return this;
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource secretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public io.k8s.api.core.v1.CephFSPersistentVolumeSource user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.CephFSPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (monitors == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "monitors", "monitors",
                "Missing 'monitors' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (monitors != null ? "\"monitors\":" + monitors.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretFile != null ? "\"secretFile\":\"" +  JsonStrings.escapeJson(secretFile) + "\"" : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (user != null ? "\"user\":\"" +  JsonStrings.escapeJson(user) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
