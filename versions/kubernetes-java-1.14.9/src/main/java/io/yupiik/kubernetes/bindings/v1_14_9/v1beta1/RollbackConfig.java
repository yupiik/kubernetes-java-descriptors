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
package io.yupiik.kubernetes.bindings.v1_14_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollbackConfig implements Validable<RollbackConfig>, Exportable {
    private Integer revision;

    public RollbackConfig() {
        // no-op
    }

    public RollbackConfig(final Integer revision) {
        this.revision = revision;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(final Integer revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                revision);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollbackConfig)) {
            return false;
        }
        final RollbackConfig __otherCasted = (RollbackConfig) __other;
        return Objects.equals(revision, __otherCasted.revision);
    }

    public RollbackConfig revision(final Integer revision) {
        this.revision = revision;
        return this;
    }

    @Override
    public RollbackConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (revision != null ? "\"revision\":" + revision : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
