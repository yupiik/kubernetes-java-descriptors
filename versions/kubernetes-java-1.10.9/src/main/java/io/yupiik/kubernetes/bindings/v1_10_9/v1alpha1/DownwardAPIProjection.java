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
package io.yupiik.kubernetes.bindings.v1_10_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_10_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_9.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DownwardAPIProjection implements Validable<DownwardAPIProjection>, Exportable {
    private List<DownwardAPIVolumeFile> items;

    public DownwardAPIProjection() {
        // no-op
    }

    public DownwardAPIProjection(final List<DownwardAPIVolumeFile> items) {
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
        if (!(__other instanceof DownwardAPIProjection)) {
            return false;
        }
        final DownwardAPIProjection __otherCasted = (DownwardAPIProjection) __other;
        return Objects.equals(items, __otherCasted.items);
    }

    public DownwardAPIProjection items(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

    @Override
    public DownwardAPIProjection validate() {
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
