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
package io.yupiik.kubernetes.bindings.v1_9_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_4.Validable;
import io.yupiik.kubernetes.bindings.v1_9_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodAffinityTerm implements Validable<PodAffinityTerm>, Exportable {
    private LabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodAffinityTerm() {
        // no-op
    }

    public PodAffinityTerm(final LabelSelector labelSelector,
                           final List<String> namespaces,
                           final String topologyKey) {
        this.labelSelector = labelSelector;
        this.namespaces = namespaces;
        this.topologyKey = topologyKey;
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                namespaces,
                topologyKey);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodAffinityTerm)) {
            return false;
        }
        final PodAffinityTerm __otherCasted = (PodAffinityTerm) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }

    public PodAffinityTerm labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public PodAffinityTerm namespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public PodAffinityTerm topologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    @Override
    public PodAffinityTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (topologyKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "topologyKey", "topologyKey",
                "Missing 'topologyKey' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (labelSelector != null ? "\"labelSelector\":" + labelSelector.asJson() : ""),
                    (namespaces != null ? "\"namespaces\":" + namespaces.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (topologyKey != null ? "\"topologyKey\":\"" +  JsonStrings.escapeJson(topologyKey) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
