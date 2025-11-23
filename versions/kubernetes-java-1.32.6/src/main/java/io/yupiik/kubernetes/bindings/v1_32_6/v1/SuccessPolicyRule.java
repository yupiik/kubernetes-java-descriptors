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
package io.yupiik.kubernetes.bindings.v1_32_6.v1;

import io.yupiik.kubernetes.bindings.v1_32_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SuccessPolicyRule implements Validable<SuccessPolicyRule>, Exportable {
    private Integer succeededCount;
    private String succeededIndexes;

    public SuccessPolicyRule() {
        // no-op
    }

    public SuccessPolicyRule(final Integer succeededCount,
                             final String succeededIndexes) {
        this.succeededCount = succeededCount;
        this.succeededIndexes = succeededIndexes;
    }

    public Integer getSucceededCount() {
        return succeededCount;
    }

    public void setSucceededCount(final Integer succeededCount) {
        this.succeededCount = succeededCount;
    }

    public String getSucceededIndexes() {
        return succeededIndexes;
    }

    public void setSucceededIndexes(final String succeededIndexes) {
        this.succeededIndexes = succeededIndexes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                succeededCount,
                succeededIndexes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SuccessPolicyRule)) {
            return false;
        }
        final SuccessPolicyRule __otherCasted = (SuccessPolicyRule) __other;
        return Objects.equals(succeededCount, __otherCasted.succeededCount) &&
            Objects.equals(succeededIndexes, __otherCasted.succeededIndexes);
    }

    public SuccessPolicyRule succeededCount(final Integer succeededCount) {
        this.succeededCount = succeededCount;
        return this;
    }

    public SuccessPolicyRule succeededIndexes(final String succeededIndexes) {
        this.succeededIndexes = succeededIndexes;
        return this;
    }

    @Override
    public SuccessPolicyRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (succeededCount != null ? "\"succeededCount\":" + succeededCount : ""),
                    (succeededIndexes != null ? "\"succeededIndexes\":\"" +  JsonStrings.escapeJson(succeededIndexes) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
