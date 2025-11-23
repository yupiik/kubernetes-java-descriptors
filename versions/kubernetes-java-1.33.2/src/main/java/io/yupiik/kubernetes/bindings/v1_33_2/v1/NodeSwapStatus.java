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
package io.yupiik.kubernetes.bindings.v1_33_2.v1;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSwapStatus implements Validable<NodeSwapStatus>, Exportable {
    private Integer capacity;

    public NodeSwapStatus() {
        // no-op
    }

    public NodeSwapStatus(final Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(final Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                capacity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSwapStatus)) {
            return false;
        }
        final NodeSwapStatus __otherCasted = (NodeSwapStatus) __other;
        return Objects.equals(capacity, __otherCasted.capacity);
    }

    public NodeSwapStatus capacity(final Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public NodeSwapStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (capacity != null ? "\"capacity\":" + capacity : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
