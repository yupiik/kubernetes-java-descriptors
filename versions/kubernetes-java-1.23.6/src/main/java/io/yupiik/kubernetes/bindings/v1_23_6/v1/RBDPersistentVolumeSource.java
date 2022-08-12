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
package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import io.yupiik.kubernetes.bindings.v1_23_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_6.Validable;
import io.yupiik.kubernetes.bindings.v1_23_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RBDPersistentVolumeSource implements Validable<RBDPersistentVolumeSource>, Exportable {
    private String fsType;
    private String image;
    private String keyring;
    private List<String> monitors;
    private String pool;
    private Boolean readOnly;
    private SecretReference secretRef;
    private String user;

    public RBDPersistentVolumeSource() {
        // no-op
    }

    public RBDPersistentVolumeSource(final String fsType,
                                     final String image,
                                     final String keyring,
                                     final List<String> monitors,
                                     final String pool,
                                     final Boolean readOnly,
                                     final SecretReference secretRef,
                                     final String user) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getKeyring() {
        return keyring;
    }

    public void setKeyring(final String keyring) {
        this.keyring = keyring;
    }

    public List<String> getMonitors() {
        return monitors;
    }

    public void setMonitors(final List<String> monitors) {
        this.monitors = monitors;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(final String pool) {
        this.pool = pool;
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

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                image,
                keyring,
                monitors,
                pool,
                readOnly,
                secretRef,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RBDPersistentVolumeSource)) {
            return false;
        }
        final RBDPersistentVolumeSource __otherCasted = (RBDPersistentVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(keyring, __otherCasted.keyring) &&
            Objects.equals(monitors, __otherCasted.monitors) &&
            Objects.equals(pool, __otherCasted.pool) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(user, __otherCasted.user);
    }

    public RBDPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public RBDPersistentVolumeSource image(final String image) {
        this.image = image;
        return this;
    }

    public RBDPersistentVolumeSource keyring(final String keyring) {
        this.keyring = keyring;
        return this;
    }

    public RBDPersistentVolumeSource monitors(final List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    public RBDPersistentVolumeSource pool(final String pool) {
        this.pool = pool;
        return this;
    }

    public RBDPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public RBDPersistentVolumeSource secretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public RBDPersistentVolumeSource user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public RBDPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (image == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "image", "image",
                "Missing 'image' attribute.", true));
        }
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
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (image != null ? "\"image\":\"" +  JsonStrings.escapeJson(image) + "\"" : ""),
                    (keyring != null ? "\"keyring\":\"" +  JsonStrings.escapeJson(keyring) + "\"" : ""),
                    (monitors != null ? "\"monitors\":" + monitors.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (user != null ? "\"user\":\"" +  JsonStrings.escapeJson(user) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
