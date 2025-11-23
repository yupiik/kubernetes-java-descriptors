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
package io.yupiik.kubernetes.bindings.v1_31_11.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_11.Validable;
import io.yupiik.kubernetes.bindings.v1_31_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceSliceSpec implements Validable<ResourceSliceSpec>, Exportable {
    private Boolean allNodes;
    private List<Device> devices;
    private String driver;
    private String nodeName;
    private NodeSelector nodeSelector;
    private ResourcePool pool;

    public ResourceSliceSpec() {
        // no-op
    }

    public ResourceSliceSpec(final Boolean allNodes,
                             final List<Device> devices,
                             final String driver,
                             final String nodeName,
                             final NodeSelector nodeSelector,
                             final ResourcePool pool) {
        this.allNodes = allNodes;
        this.devices = devices;
        this.driver = driver;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.pool = pool;
    }

    public Boolean getAllNodes() {
        return allNodes;
    }

    public void setAllNodes(final Boolean allNodes) {
        this.allNodes = allNodes;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(final List<Device> devices) {
        this.devices = devices;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public ResourcePool getPool() {
        return pool;
    }

    public void setPool(final ResourcePool pool) {
        this.pool = pool;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allNodes,
                devices,
                driver,
                nodeName,
                nodeSelector,
                pool);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceSliceSpec)) {
            return false;
        }
        final ResourceSliceSpec __otherCasted = (ResourceSliceSpec) __other;
        return Objects.equals(allNodes, __otherCasted.allNodes) &&
            Objects.equals(devices, __otherCasted.devices) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(pool, __otherCasted.pool);
    }

    public ResourceSliceSpec allNodes(final Boolean allNodes) {
        this.allNodes = allNodes;
        return this;
    }

    public ResourceSliceSpec devices(final List<Device> devices) {
        this.devices = devices;
        return this;
    }

    public ResourceSliceSpec driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public ResourceSliceSpec nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public ResourceSliceSpec nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public ResourceSliceSpec pool(final ResourcePool pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public ResourceSliceSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (pool == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pool", "pool",
                "Missing 'pool' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allNodes != null ? "\"allNodes\":" + allNodes : ""),
                    (devices != null ? "\"devices\":" + devices.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""),
                    (pool != null ? "\"pool\":" + pool.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
