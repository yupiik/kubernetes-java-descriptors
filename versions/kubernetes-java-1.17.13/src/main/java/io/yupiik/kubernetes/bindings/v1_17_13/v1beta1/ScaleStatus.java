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
package io.yupiik.kubernetes.bindings.v1_17_13.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_13.Validable;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScaleStatus implements Validable<ScaleStatus>, Exportable {
    private int replicas;
    private Map<String, String> selector;
    private String targetSelector;

    public ScaleStatus() {
        // no-op
    }

    public ScaleStatus(final int replicas,
                       final Map<String, String> selector,
                       final String targetSelector) {
        this.replicas = replicas;
        this.selector = selector;
        this.targetSelector = targetSelector;
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
    }

    public Map<String, String> getSelector() {
        return selector;
    }

    public void setSelector(final Map<String, String> selector) {
        this.selector = selector;
    }

    public String getTargetSelector() {
        return targetSelector;
    }

    public void setTargetSelector(final String targetSelector) {
        this.targetSelector = targetSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas,
                selector,
                targetSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleStatus)) {
            return false;
        }
        final ScaleStatus __otherCasted = (ScaleStatus) __other;
        return Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(targetSelector, __otherCasted.targetSelector);
    }

    public ScaleStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    public ScaleStatus selector(final Map<String, String> selector) {
        this.selector = selector;
        return this;
    }

    public ScaleStatus targetSelector(final String targetSelector) {
        this.targetSelector = targetSelector;
        return this;
    }

    @Override
    public ScaleStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"replicas\":" + replicas,
                    (selector != null ? "\"selector\":" + selector.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (targetSelector != null ? "\"targetSelector\":\"" +  JsonStrings.escapeJson(targetSelector) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
