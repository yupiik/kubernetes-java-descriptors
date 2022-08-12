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
package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_11.Validable;
import io.yupiik.kubernetes.bindings.v1_15_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollingUpdateStatefulSetStrategy implements Validable<RollingUpdateStatefulSetStrategy>, Exportable {
    private Integer partition;

    public RollingUpdateStatefulSetStrategy() {
        // no-op
    }

    public RollingUpdateStatefulSetStrategy(final Integer partition) {
        // no-op
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                partition);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollingUpdateStatefulSetStrategy)) {
            return false;
        }
        final RollingUpdateStatefulSetStrategy __otherCasted = (RollingUpdateStatefulSetStrategy) __other;
        return Objects.equals(partition, __otherCasted.partition);
    }

    public RollingUpdateStatefulSetStrategy partition(final Integer partition) {
        this.partition = partition;
        return this;
    }

    @Override
    public RollingUpdateStatefulSetStrategy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (partition != null ? "\"partition\":" + partition : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
