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
package io.yupiik.kubernetes.bindings.v1_12_2.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_12_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_2.Validable;
import io.yupiik.kubernetes.bindings.v1_12_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EnvVarSource implements Validable<EnvVarSource>, Exportable {
    private ConfigMapKeySelector configMapKeyRef;
    private ObjectFieldSelector fieldRef;
    private ResourceFieldSelector resourceFieldRef;
    private SecretKeySelector secretKeyRef;

    public EnvVarSource() {
        // no-op
    }

    public EnvVarSource(final ConfigMapKeySelector configMapKeyRef,
                        final ObjectFieldSelector fieldRef,
                        final ResourceFieldSelector resourceFieldRef,
                        final SecretKeySelector secretKeyRef) {
        // no-op
    }

    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMapKeyRef,
                fieldRef,
                resourceFieldRef,
                secretKeyRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EnvVarSource)) {
            return false;
        }
        final EnvVarSource __otherCasted = (EnvVarSource) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }

    public EnvVarSource configMapKeyRef(final ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    public EnvVarSource fieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public EnvVarSource resourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    public EnvVarSource secretKeyRef(final SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
        return this;
    }

    @Override
    public EnvVarSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMapKeyRef != null ? "\"configMapKeyRef\":" + configMapKeyRef.asJson() : ""),
                    (fieldRef != null ? "\"fieldRef\":" + fieldRef.asJson() : ""),
                    (resourceFieldRef != null ? "\"resourceFieldRef\":" + resourceFieldRef.asJson() : ""),
                    (secretKeyRef != null ? "\"secretKeyRef\":" + secretKeyRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
