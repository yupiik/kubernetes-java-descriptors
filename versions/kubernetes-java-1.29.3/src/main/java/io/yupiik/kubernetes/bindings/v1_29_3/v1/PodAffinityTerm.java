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
package io.yupiik.kubernetes.bindings.v1_29_3.v1;

import io.yupiik.kubernetes.bindings.v1_29_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_3.Validable;
import io.yupiik.kubernetes.bindings.v1_29_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodAffinityTerm implements Validable<PodAffinityTerm>, Exportable {
    private LabelSelector labelSelector;
    private List<String> matchLabelKeys;
    private List<String> mismatchLabelKeys;
    private LabelSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodAffinityTerm() {
        // no-op
    }

    public PodAffinityTerm(final LabelSelector labelSelector,
                           final List<String> matchLabelKeys,
                           final List<String> mismatchLabelKeys,
                           final LabelSelector namespaceSelector,
                           final List<String> namespaces,
                           final String topologyKey) {
        this.labelSelector = labelSelector;
        this.matchLabelKeys = matchLabelKeys;
        this.mismatchLabelKeys = mismatchLabelKeys;
        this.namespaceSelector = namespaceSelector;
        this.namespaces = namespaces;
        this.topologyKey = topologyKey;
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public List<String> getMatchLabelKeys() {
        return matchLabelKeys;
    }

    public void setMatchLabelKeys(final List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
    }

    public List<String> getMismatchLabelKeys() {
        return mismatchLabelKeys;
    }

    public void setMismatchLabelKeys(final List<String> mismatchLabelKeys) {
        this.mismatchLabelKeys = mismatchLabelKeys;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
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
                matchLabelKeys,
                mismatchLabelKeys,
                namespaceSelector,
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
            Objects.equals(matchLabelKeys, __otherCasted.matchLabelKeys) &&
            Objects.equals(mismatchLabelKeys, __otherCasted.mismatchLabelKeys) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }

    public PodAffinityTerm labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public PodAffinityTerm matchLabelKeys(final List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
        return this;
    }

    public PodAffinityTerm mismatchLabelKeys(final List<String> mismatchLabelKeys) {
        this.mismatchLabelKeys = mismatchLabelKeys;
        return this;
    }

    public PodAffinityTerm namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
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
                    (matchLabelKeys != null ? "\"matchLabelKeys\":" + matchLabelKeys.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (mismatchLabelKeys != null ? "\"mismatchLabelKeys\":" + mismatchLabelKeys.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (namespaces != null ? "\"namespaces\":" + namespaces.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (topologyKey != null ? "\"topologyKey\":\"" +  JsonStrings.escapeJson(topologyKey) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
