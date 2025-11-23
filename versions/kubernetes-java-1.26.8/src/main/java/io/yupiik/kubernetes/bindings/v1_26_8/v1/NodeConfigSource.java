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
package io.yupiik.kubernetes.bindings.v1_26_8.v1;

import io.yupiik.kubernetes.bindings.v1_26_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeConfigSource implements Validable<NodeConfigSource>, Exportable {
    private ConfigMapNodeConfigSource configMap;

    public NodeConfigSource() {
        // no-op
    }

    public NodeConfigSource(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
    }

    public ConfigMapNodeConfigSource getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeConfigSource)) {
            return false;
        }
        final NodeConfigSource __otherCasted = (NodeConfigSource) __other;
        return Objects.equals(configMap, __otherCasted.configMap);
    }

    public NodeConfigSource configMap(final ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
        return this;
    }

    @Override
    public NodeConfigSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMap != null ? "\"configMap\":" + configMap.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
