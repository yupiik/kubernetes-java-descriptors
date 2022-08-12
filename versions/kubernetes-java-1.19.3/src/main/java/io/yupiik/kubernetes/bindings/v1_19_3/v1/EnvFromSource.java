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
package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import io.yupiik.kubernetes.bindings.v1_19_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_3.Validable;
import io.yupiik.kubernetes.bindings.v1_19_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EnvFromSource implements Validable<EnvFromSource>, Exportable {
    private ConfigMapEnvSource configMapRef;
    private String prefix;
    private SecretEnvSource secretRef;

    public EnvFromSource() {
        // no-op
    }

    public EnvFromSource(final ConfigMapEnvSource configMapRef,
                         final String prefix,
                         final SecretEnvSource secretRef) {
        // no-op
    }

    public ConfigMapEnvSource getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public SecretEnvSource getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretEnvSource secretRef) {
        this.secretRef = secretRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMapRef,
                prefix,
                secretRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EnvFromSource)) {
            return false;
        }
        final EnvFromSource __otherCasted = (EnvFromSource) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }

    public EnvFromSource configMapRef(final ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
        return this;
    }

    public EnvFromSource prefix(final String prefix) {
        this.prefix = prefix;
        return this;
    }

    public EnvFromSource secretRef(final SecretEnvSource secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    @Override
    public EnvFromSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMapRef != null ? "\"configMapRef\":" + configMapRef.asJson() : ""),
                    (prefix != null ? "\"prefix\":\"" +  JsonStrings.escapeJson(prefix) + "\"" : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
