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
package io.yupiik.kubernetes.bindings.v1_9_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_1.Validable;
import io.yupiik.kubernetes.bindings.v1_9_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RunAsUserStrategyOptions implements Validable<RunAsUserStrategyOptions>, Exportable {
    private List<IDRange> ranges;
    private String rule;

    public RunAsUserStrategyOptions() {
        // no-op
    }

    public RunAsUserStrategyOptions(final List<IDRange> ranges,
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
        if (!(__other instanceof RunAsUserStrategyOptions)) {
            return false;
        }
        final RunAsUserStrategyOptions __otherCasted = (RunAsUserStrategyOptions) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public RunAsUserStrategyOptions ranges(final List<IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public RunAsUserStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public RunAsUserStrategyOptions validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rule", "rule",
                "Missing 'rule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
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
