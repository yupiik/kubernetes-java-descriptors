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
package io.yupiik.kubernetes.bindings.v1_29_6.v1;

import io.yupiik.kubernetes.bindings.v1_29_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetOrdinals implements Validable<StatefulSetOrdinals>, Exportable {
    private Integer start;

    public StatefulSetOrdinals() {
        // no-op
    }

    public StatefulSetOrdinals(final Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(final Integer start) {
        this.start = start;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                start);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetOrdinals)) {
            return false;
        }
        final StatefulSetOrdinals __otherCasted = (StatefulSetOrdinals) __other;
        return Objects.equals(start, __otherCasted.start);
    }

    public StatefulSetOrdinals start(final Integer start) {
        this.start = start;
        return this;
    }

    @Override
    public StatefulSetOrdinals validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (start != null ? "\"start\":" + start : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
