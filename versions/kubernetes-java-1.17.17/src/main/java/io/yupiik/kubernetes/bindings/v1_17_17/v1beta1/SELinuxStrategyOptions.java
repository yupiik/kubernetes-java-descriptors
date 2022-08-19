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
package io.yupiik.kubernetes.bindings.v1_17_17.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_17.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_17.Validable;
import io.yupiik.kubernetes.bindings.v1_17_17.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SELinuxStrategyOptions implements Validable<SELinuxStrategyOptions>, Exportable {
    private String rule;
    private SELinuxOptions seLinuxOptions;

    public SELinuxStrategyOptions() {
        // no-op
    }

    public SELinuxStrategyOptions(final String rule,
                                  final SELinuxOptions seLinuxOptions) {
        this.rule = rule;
        this.seLinuxOptions = seLinuxOptions;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rule,
                seLinuxOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SELinuxStrategyOptions)) {
            return false;
        }
        final SELinuxStrategyOptions __otherCasted = (SELinuxStrategyOptions) __other;
        return Objects.equals(rule, __otherCasted.rule) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions);
    }

    public SELinuxStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    public SELinuxStrategyOptions seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    @Override
    public SELinuxStrategyOptions validate() {
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
                    (rule != null ? "\"rule\":\"" +  JsonStrings.escapeJson(rule) + "\"" : ""),
                    (seLinuxOptions != null ? "\"seLinuxOptions\":" + seLinuxOptions.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
