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
package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WeightedPodAffinityTerm implements Validable<WeightedPodAffinityTerm>, Exportable {
    private PodAffinityTerm podAffinityTerm;
    private int weight;

    public WeightedPodAffinityTerm() {
        // no-op
    }

    public WeightedPodAffinityTerm(final PodAffinityTerm podAffinityTerm,
                                   final int weight) {
        this.podAffinityTerm = podAffinityTerm;
        this.weight = weight;
    }

    public PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
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
                podAffinityTerm,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WeightedPodAffinityTerm)) {
            return false;
        }
        final WeightedPodAffinityTerm __otherCasted = (WeightedPodAffinityTerm) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }

    public WeightedPodAffinityTerm podAffinityTerm(final PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    public WeightedPodAffinityTerm weight(final int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public WeightedPodAffinityTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (podAffinityTerm == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podAffinityTerm", "podAffinityTerm",
                "Missing 'podAffinityTerm' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (podAffinityTerm != null ? "\"podAffinityTerm\":" + podAffinityTerm.asJson() : ""),
                    "\"weight\":" + weight)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
