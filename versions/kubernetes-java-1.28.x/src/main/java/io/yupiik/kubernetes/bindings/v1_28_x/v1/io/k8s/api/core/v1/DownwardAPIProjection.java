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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.DownwardAPIProjection implements Validable<io.k8s.api.core.v1.DownwardAPIProjection>, Exportable {
    private List<DownwardAPIVolumeFile> items;

    public io.k8s.api.core.v1.DownwardAPIProjection() {
        // no-op
    }

    public io.k8s.api.core.v1.DownwardAPIProjection(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    public List<DownwardAPIVolumeFile> getItems() {
        return items;
    }

    public void setItems(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.DownwardAPIProjection)) {
            return false;
        }
        final io.k8s.api.core.v1.DownwardAPIProjection __otherCasted = (io.k8s.api.core.v1.DownwardAPIProjection) __other;
        return Objects.equals(items, __otherCasted.items);
    }

    public io.k8s.api.core.v1.DownwardAPIProjection items(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.DownwardAPIProjection validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
