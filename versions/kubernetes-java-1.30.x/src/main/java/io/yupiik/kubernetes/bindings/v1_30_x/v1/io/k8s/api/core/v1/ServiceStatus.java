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
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ServiceStatus implements Validable<io.k8s.api.core.v1.ServiceStatus>, Exportable {
    private List<Condition> conditions;
    private LoadBalancerStatus loadBalancer;

    public io.k8s.api.core.v1.ServiceStatus() {
        // no-op
    }

    public io.k8s.api.core.v1.ServiceStatus(final List<Condition> conditions,
                                            final LoadBalancerStatus loadBalancer) {
        this.conditions = conditions;
        this.loadBalancer = loadBalancer;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public LoadBalancerStatus getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ServiceStatus)) {
            return false;
        }
        final io.k8s.api.core.v1.ServiceStatus __otherCasted = (io.k8s.api.core.v1.ServiceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }

    public io.k8s.api.core.v1.ServiceStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public io.k8s.api.core.v1.ServiceStatus loadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ServiceStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (loadBalancer != null ? "\"loadBalancer\":" + loadBalancer.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
