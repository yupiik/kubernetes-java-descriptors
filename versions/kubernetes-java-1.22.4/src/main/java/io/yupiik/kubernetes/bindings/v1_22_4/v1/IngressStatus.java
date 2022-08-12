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
package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import io.yupiik.kubernetes.bindings.v1_22_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_4.Validable;
import io.yupiik.kubernetes.bindings.v1_22_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressStatus implements Validable<IngressStatus>, Exportable {
    private LoadBalancerStatus loadBalancer;

    public IngressStatus() {
        // no-op
    }

    public IngressStatus(final LoadBalancerStatus loadBalancer) {
        // no-op
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
                loadBalancer);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressStatus)) {
            return false;
        }
        final IngressStatus __otherCasted = (IngressStatus) __other;
        return Objects.equals(loadBalancer, __otherCasted.loadBalancer);
    }

    public IngressStatus loadBalancer(final LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

    @Override
    public IngressStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (loadBalancer != null ? "\"loadBalancer\":" + loadBalancer.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
