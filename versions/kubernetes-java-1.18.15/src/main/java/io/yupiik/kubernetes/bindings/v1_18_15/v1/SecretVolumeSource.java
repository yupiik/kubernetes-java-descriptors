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
package io.yupiik.kubernetes.bindings.v1_18_15.v1;

import io.yupiik.kubernetes.bindings.v1_18_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_15.Validable;
import io.yupiik.kubernetes.bindings.v1_18_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecretVolumeSource implements Validable<SecretVolumeSource>, Exportable {
    private Integer defaultMode;
    private List<KeyToPath> items;
    private Boolean optional;
    private String secretName;

    public SecretVolumeSource() {
        // no-op
    }

    public SecretVolumeSource(final Integer defaultMode,
                              final List<KeyToPath> items,
                              final Boolean optional,
                              final String secretName) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items,
                optional,
                secretName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretVolumeSource)) {
            return false;
        }
        final SecretVolumeSource __otherCasted = (SecretVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }

    public SecretVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public SecretVolumeSource items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public SecretVolumeSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    public SecretVolumeSource secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    @Override
    public SecretVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultMode != null ? "\"defaultMode\":" + defaultMode : ""),
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (optional != null ? "\"optional\":" + optional : ""),
                    (secretName != null ? "\"secretName\":\"" +  JsonStrings.escapeJson(secretName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
