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
package io.yupiik.kubernetes.bindings.v1_30_x.v1;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import io.yupiik.kubernetes.bindings.v1_30_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.apps.v1.ReplicaSetSpec implements Validable<io.k8s.api.apps.v1.ReplicaSetSpec>, Exportable {
    private Integer minReadySeconds;
    private Integer replicas;
    private LabelSelector selector;
    private PodTemplateSpec template;

    public io.k8s.api.apps.v1.ReplicaSetSpec() {
        // no-op
    }

    public io.k8s.api.apps.v1.ReplicaSetSpec(final Integer minReadySeconds,
                                             final Integer replicas,
                                             final LabelSelector selector,
                                             final PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = selector;
        this.template = template;
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                replicas,
                selector,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.apps.v1.ReplicaSetSpec)) {
            return false;
        }
        final io.k8s.api.apps.v1.ReplicaSetSpec __otherCasted = (io.k8s.api.apps.v1.ReplicaSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }

    public io.k8s.api.apps.v1.ReplicaSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public io.k8s.api.apps.v1.ReplicaSetSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public io.k8s.api.apps.v1.ReplicaSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public io.k8s.api.apps.v1.ReplicaSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    @Override
    public io.k8s.api.apps.v1.ReplicaSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (minReadySeconds != null ? "\"minReadySeconds\":" + minReadySeconds : ""),
                    (replicas != null ? "\"replicas\":" + replicas : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
