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
package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_4.Validable;
import io.yupiik.kubernetes.bindings.v1_23_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AzureFilePersistentVolumeSource implements Validable<AzureFilePersistentVolumeSource>, Exportable {
    private Boolean readOnly;
    private String secretName;
    private String secretNamespace;
    private String shareName;

    public AzureFilePersistentVolumeSource() {
        // no-op
    }

    public AzureFilePersistentVolumeSource(final Boolean readOnly,
                                           final String secretName,
                                           final String secretNamespace,
                                           final String shareName) {
        this.readOnly = readOnly;
        this.secretName = secretName;
        this.secretNamespace = secretNamespace;
        this.shareName = shareName;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    public String getSecretNamespace() {
        return secretNamespace;
    }

    public void setSecretNamespace(final String secretNamespace) {
        this.secretNamespace = secretNamespace;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(final String shareName) {
        this.shareName = shareName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                readOnly,
                secretName,
                secretNamespace,
                shareName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AzureFilePersistentVolumeSource)) {
            return false;
        }
        final AzureFilePersistentVolumeSource __otherCasted = (AzureFilePersistentVolumeSource) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretName, __otherCasted.secretName) &&
            Objects.equals(secretNamespace, __otherCasted.secretNamespace) &&
            Objects.equals(shareName, __otherCasted.shareName);
    }

    public AzureFilePersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AzureFilePersistentVolumeSource secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    public AzureFilePersistentVolumeSource secretNamespace(final String secretNamespace) {
        this.secretNamespace = secretNamespace;
        return this;
    }

    public AzureFilePersistentVolumeSource shareName(final String shareName) {
        this.shareName = shareName;
        return this;
    }

    @Override
    public AzureFilePersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (secretName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "secretName", "secretName",
                "Missing 'secretName' attribute.", true));
        }
        if (shareName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "shareName", "shareName",
                "Missing 'shareName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretName != null ? "\"secretName\":\"" +  JsonStrings.escapeJson(secretName) + "\"" : ""),
                    (secretNamespace != null ? "\"secretNamespace\":\"" +  JsonStrings.escapeJson(secretNamespace) + "\"" : ""),
                    (shareName != null ? "\"shareName\":\"" +  JsonStrings.escapeJson(shareName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
