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
package io.yupiik.kubernetes.bindings.v1_31_x.v1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.storage.v1.VolumeNodeResources implements Validable<io.k8s.api.storage.v1.VolumeNodeResources>, Exportable {
    private Integer count;

    public io.k8s.api.storage.v1.VolumeNodeResources() {
        // no-op
    }

    public io.k8s.api.storage.v1.VolumeNodeResources(final Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.storage.v1.VolumeNodeResources)) {
            return false;
        }
        final io.k8s.api.storage.v1.VolumeNodeResources __otherCasted = (io.k8s.api.storage.v1.VolumeNodeResources) __other;
        return Objects.equals(count, __otherCasted.count);
    }

    public io.k8s.api.storage.v1.VolumeNodeResources count(final Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public io.k8s.api.storage.v1.VolumeNodeResources validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (count != null ? "\"count\":" + count : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
