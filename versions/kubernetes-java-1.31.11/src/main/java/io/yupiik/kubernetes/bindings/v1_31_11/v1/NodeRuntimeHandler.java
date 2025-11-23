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
package io.yupiik.kubernetes.bindings.v1_31_11.v1;

import io.yupiik.kubernetes.bindings.v1_31_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_11.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeRuntimeHandler implements Validable<NodeRuntimeHandler>, Exportable {
    private NodeRuntimeHandlerFeatures features;
    private String name;

    public NodeRuntimeHandler() {
        // no-op
    }

    public NodeRuntimeHandler(final NodeRuntimeHandlerFeatures features,
                              final String name) {
        this.features = features;
        this.name = name;
    }

    public NodeRuntimeHandlerFeatures getFeatures() {
        return features;
    }

    public void setFeatures(final NodeRuntimeHandlerFeatures features) {
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                features,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeRuntimeHandler)) {
            return false;
        }
        final NodeRuntimeHandler __otherCasted = (NodeRuntimeHandler) __other;
        return Objects.equals(features, __otherCasted.features) &&
            Objects.equals(name, __otherCasted.name);
    }

    public NodeRuntimeHandler features(final NodeRuntimeHandlerFeatures features) {
        this.features = features;
        return this;
    }

    public NodeRuntimeHandler name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public NodeRuntimeHandler validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (features != null ? "\"features\":" + features.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
