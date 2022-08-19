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
package io.yupiik.kubernetes.bindings.v1_15_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_0.Validable;
import io.yupiik.kubernetes.bindings.v1_15_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSINodeDriver implements Validable<CSINodeDriver>, Exportable {
    private String name;
    private String nodeID;
    private List<String> topologyKeys;

    public CSINodeDriver() {
        // no-op
    }

    public CSINodeDriver(final String name,
                         final String nodeID,
                         final List<String> topologyKeys) {
        this.name = name;
        this.nodeID = nodeID;
        this.topologyKeys = topologyKeys;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(final String nodeID) {
        this.nodeID = nodeID;
    }

    public List<String> getTopologyKeys() {
        return topologyKeys;
    }

    public void setTopologyKeys(final List<String> topologyKeys) {
        this.topologyKeys = topologyKeys;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                nodeID,
                topologyKeys);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeDriver)) {
            return false;
        }
        final CSINodeDriver __otherCasted = (CSINodeDriver) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodeID, __otherCasted.nodeID) &&
            Objects.equals(topologyKeys, __otherCasted.topologyKeys);
    }

    public CSINodeDriver name(final String name) {
        this.name = name;
        return this;
    }

    public CSINodeDriver nodeID(final String nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    public CSINodeDriver topologyKeys(final List<String> topologyKeys) {
        this.topologyKeys = topologyKeys;
        return this;
    }

    @Override
    public CSINodeDriver validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (nodeID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeID", "nodeID",
                "Missing 'nodeID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (nodeID != null ? "\"nodeID\":\"" +  JsonStrings.escapeJson(nodeID) + "\"" : ""),
                    (topologyKeys != null ? "\"topologyKeys\":" + topologyKeys.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
