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
package io.yupiik.kubernetes.bindings.v1_33_1.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceClassSpec implements Validable<DeviceClassSpec>, Exportable {
    private List<DeviceClassConfiguration> config;
    private List<DeviceSelector> selectors;

    public DeviceClassSpec() {
        // no-op
    }

    public DeviceClassSpec(final List<DeviceClassConfiguration> config,
                           final List<DeviceSelector> selectors) {
        this.config = config;
        this.selectors = selectors;
    }

    public List<DeviceClassConfiguration> getConfig() {
        return config;
    }

    public void setConfig(final List<DeviceClassConfiguration> config) {
        this.config = config;
    }

    public List<DeviceSelector> getSelectors() {
        return selectors;
    }

    public void setSelectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                config,
                selectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceClassSpec)) {
            return false;
        }
        final DeviceClassSpec __otherCasted = (DeviceClassSpec) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(selectors, __otherCasted.selectors);
    }

    public DeviceClassSpec config(final List<DeviceClassConfiguration> config) {
        this.config = config;
        return this;
    }

    public DeviceClassSpec selectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
        return this;
    }

    @Override
    public DeviceClassSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (config != null ? "\"config\":" + config.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (selectors != null ? "\"selectors\":" + selectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
