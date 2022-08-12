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
package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import io.yupiik.kubernetes.bindings.v1_20_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_13.Validable;
import io.yupiik.kubernetes.bindings.v1_20_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PreferredSchedulingTerm implements Validable<PreferredSchedulingTerm>, Exportable {
    private NodeSelectorTerm preference;
    private int weight;

    public PreferredSchedulingTerm() {
        // no-op
    }

    public PreferredSchedulingTerm(final NodeSelectorTerm preference,
                                   final int weight) {
        // no-op
    }

    public NodeSelectorTerm getPreference() {
        return preference;
    }

    public void setPreference(final NodeSelectorTerm preference) {
        this.preference = preference;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                preference,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PreferredSchedulingTerm)) {
            return false;
        }
        final PreferredSchedulingTerm __otherCasted = (PreferredSchedulingTerm) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }

    public PreferredSchedulingTerm preference(final NodeSelectorTerm preference) {
        this.preference = preference;
        return this;
    }

    public PreferredSchedulingTerm weight(final int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public PreferredSchedulingTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (preference == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "preference", "preference",
                "Missing 'preference' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (preference != null ? "\"preference\":" + preference.asJson() : ""),
                    "\"weight\":" + weight)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
