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
package io.yupiik.kubernetes.bindings.v1_25_2.v1;

import io.yupiik.kubernetes.bindings.v1_25_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_2.Validable;
import io.yupiik.kubernetes.bindings.v1_25_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AzureFileVolumeSource implements Validable<AzureFileVolumeSource>, Exportable {
    private Boolean readOnly;
    private String secretName;
    private String shareName;

    public AzureFileVolumeSource() {
        // no-op
    }

    public AzureFileVolumeSource(final Boolean readOnly,
                                 final String secretName,
                                 final String shareName) {
        this.readOnly = readOnly;
        this.secretName = secretName;
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
                shareName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AzureFileVolumeSource)) {
            return false;
        }
        final AzureFileVolumeSource __otherCasted = (AzureFileVolumeSource) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretName, __otherCasted.secretName) &&
            Objects.equals(shareName, __otherCasted.shareName);
    }

    public AzureFileVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AzureFileVolumeSource secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    public AzureFileVolumeSource shareName(final String shareName) {
        this.shareName = shareName;
        return this;
    }

    @Override
    public AzureFileVolumeSource validate() {
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
                    (shareName != null ? "\"shareName\":\"" +  JsonStrings.escapeJson(shareName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
