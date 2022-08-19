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
package io.yupiik.kubernetes.bindings.v1_21_13.v1;

import io.yupiik.kubernetes.bindings.v1_21_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_13.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DownwardAPIVolumeSource implements Validable<DownwardAPIVolumeSource>, Exportable {
    private Integer defaultMode;
    private List<DownwardAPIVolumeFile> items;

    public DownwardAPIVolumeSource() {
        // no-op
    }

    public DownwardAPIVolumeSource(final Integer defaultMode,
                                   final List<DownwardAPIVolumeFile> items) {
        this.defaultMode = defaultMode;
        this.items = items;
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
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
                defaultMode,
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DownwardAPIVolumeSource)) {
            return false;
        }
        final DownwardAPIVolumeSource __otherCasted = (DownwardAPIVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }

    public DownwardAPIVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public DownwardAPIVolumeSource items(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

    @Override
    public DownwardAPIVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultMode != null ? "\"defaultMode\":" + defaultMode : ""),
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
