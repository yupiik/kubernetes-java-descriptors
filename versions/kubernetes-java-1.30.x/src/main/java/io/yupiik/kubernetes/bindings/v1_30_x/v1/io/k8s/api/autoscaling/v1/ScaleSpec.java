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
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.autoscaling.v1.ScaleSpec implements Validable<io.k8s.api.autoscaling.v1.ScaleSpec>, Exportable {
    private Integer replicas;

    public io.k8s.api.autoscaling.v1.ScaleSpec() {
        // no-op
    }

    public io.k8s.api.autoscaling.v1.ScaleSpec(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                replicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.autoscaling.v1.ScaleSpec)) {
            return false;
        }
        final io.k8s.api.autoscaling.v1.ScaleSpec __otherCasted = (io.k8s.api.autoscaling.v1.ScaleSpec) __other;
        return Objects.equals(replicas, __otherCasted.replicas);
    }

    public io.k8s.api.autoscaling.v1.ScaleSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    @Override
    public io.k8s.api.autoscaling.v1.ScaleSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (replicas != null ? "\"replicas\":" + replicas : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
