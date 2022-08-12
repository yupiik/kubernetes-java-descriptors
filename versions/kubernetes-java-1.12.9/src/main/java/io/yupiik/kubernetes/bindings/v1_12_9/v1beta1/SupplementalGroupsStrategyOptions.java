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
package io.yupiik.kubernetes.bindings.v1_12_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_9.Validable;
import io.yupiik.kubernetes.bindings.v1_12_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SupplementalGroupsStrategyOptions implements Validable<SupplementalGroupsStrategyOptions>, Exportable {
    private List<IDRange> ranges;
    private String rule;

    public SupplementalGroupsStrategyOptions() {
        // no-op
    }

    public SupplementalGroupsStrategyOptions(final List<IDRange> ranges,
                                             final String rule) {
        // no-op
    }

    public List<IDRange> getRanges() {
        return ranges;
    }

    public void setRanges(final List<IDRange> ranges) {
        this.ranges = ranges;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ranges,
                rule);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SupplementalGroupsStrategyOptions)) {
            return false;
        }
        final SupplementalGroupsStrategyOptions __otherCasted = (SupplementalGroupsStrategyOptions) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public SupplementalGroupsStrategyOptions ranges(final List<IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public SupplementalGroupsStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public SupplementalGroupsStrategyOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ranges != null ? "\"ranges\":" + ranges.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (rule != null ? "\"rule\":\"" +  JsonStrings.escapeJson(rule) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
