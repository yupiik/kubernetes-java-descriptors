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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceClassSpec implements Validable<DeviceClassSpec>, Exportable {
    private List<DeviceClassConfiguration> config;
    private String extendedResourceName;
    private List<DeviceSelector> selectors;

    public DeviceClassSpec() {
        // no-op
    }

    public DeviceClassSpec(final List<DeviceClassConfiguration> config,
                           final String extendedResourceName,
                           final List<DeviceSelector> selectors) {
        this.config = config;
        this.extendedResourceName = extendedResourceName;
        this.selectors = selectors;
    }

    public List<DeviceClassConfiguration> getConfig() {
        return config;
    }

    public void setConfig(final List<DeviceClassConfiguration> config) {
        this.config = config;
    }

    public String getExtendedResourceName() {
        return extendedResourceName;
    }

    public void setExtendedResourceName(final String extendedResourceName) {
        this.extendedResourceName = extendedResourceName;
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
                extendedResourceName,
                selectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceClassSpec)) {
            return false;
        }
        final DeviceClassSpec __otherCasted = (DeviceClassSpec) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(extendedResourceName, __otherCasted.extendedResourceName) &&
            Objects.equals(selectors, __otherCasted.selectors);
    }

    public DeviceClassSpec config(final List<DeviceClassConfiguration> config) {
        this.config = config;
        return this;
    }

    public DeviceClassSpec extendedResourceName(final String extendedResourceName) {
        this.extendedResourceName = extendedResourceName;
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
                    (extendedResourceName != null ? "\"extendedResourceName\":\"" +  JsonStrings.escapeJson(extendedResourceName) + "\"" : ""),
                    (selectors != null ? "\"selectors\":" + selectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
