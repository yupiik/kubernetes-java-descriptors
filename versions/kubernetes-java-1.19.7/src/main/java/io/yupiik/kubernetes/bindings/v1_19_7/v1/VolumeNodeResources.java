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
package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import io.yupiik.kubernetes.bindings.v1_19_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_7.Validable;
import io.yupiik.kubernetes.bindings.v1_19_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeNodeResources implements Validable<VolumeNodeResources>, Exportable {
    private Integer count;

    public VolumeNodeResources() {
        // no-op
    }

    public VolumeNodeResources(final Integer count) {
        // no-op
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
        if (!(__other instanceof VolumeNodeResources)) {
            return false;
        }
        final VolumeNodeResources __otherCasted = (VolumeNodeResources) __other;
        return Objects.equals(count, __otherCasted.count);
    }

    public VolumeNodeResources count(final Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public VolumeNodeResources validate() {
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
