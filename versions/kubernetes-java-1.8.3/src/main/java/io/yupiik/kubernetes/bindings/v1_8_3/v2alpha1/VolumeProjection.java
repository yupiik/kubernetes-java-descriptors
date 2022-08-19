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
package io.yupiik.kubernetes.bindings.v1_8_3.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_8_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeProjection implements Validable<VolumeProjection>, Exportable {
    private ConfigMapProjection configMap;
    private DownwardAPIProjection downwardAPI;
    private SecretProjection secret;

    public VolumeProjection() {
        // no-op
    }

    public VolumeProjection(final ConfigMapProjection configMap,
                            final DownwardAPIProjection downwardAPI,
                            final SecretProjection secret) {
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
    }

    public ConfigMapProjection getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ConfigMapProjection configMap) {
        this.configMap = configMap;
    }

    public DownwardAPIProjection getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public SecretProjection getSecret() {
        return secret;
    }

    public void setSecret(final SecretProjection secret) {
        this.secret = secret;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap,
                downwardAPI,
                secret);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeProjection)) {
            return false;
        }
        final VolumeProjection __otherCasted = (VolumeProjection) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret);
    }

    public VolumeProjection configMap(final ConfigMapProjection configMap) {
        this.configMap = configMap;
        return this;
    }

    public VolumeProjection downwardAPI(final DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    public VolumeProjection secret(final SecretProjection secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public VolumeProjection validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMap != null ? "\"configMap\":" + configMap.asJson() : ""),
                    (downwardAPI != null ? "\"downwardAPI\":" + downwardAPI.asJson() : ""),
                    (secret != null ? "\"secret\":" + secret.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
