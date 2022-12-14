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
package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import io.yupiik.kubernetes.bindings.v1_23_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_8.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerImage implements Validable<ContainerImage>, Exportable {
    private List<String> names;
    private Integer sizeBytes;

    public ContainerImage() {
        // no-op
    }

    public ContainerImage(final List<String> names,
                          final Integer sizeBytes) {
        this.names = names;
        this.sizeBytes = sizeBytes;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(final List<String> names) {
        this.names = names;
    }

    public Integer getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(final Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                names,
                sizeBytes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerImage)) {
            return false;
        }
        final ContainerImage __otherCasted = (ContainerImage) __other;
        return Objects.equals(names, __otherCasted.names) &&
            Objects.equals(sizeBytes, __otherCasted.sizeBytes);
    }

    public ContainerImage names(final List<String> names) {
        this.names = names;
        return this;
    }

    public ContainerImage sizeBytes(final Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    @Override
    public ContainerImage validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (names != null ? "\"names\":" + names.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (sizeBytes != null ? "\"sizeBytes\":" + sizeBytes : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
