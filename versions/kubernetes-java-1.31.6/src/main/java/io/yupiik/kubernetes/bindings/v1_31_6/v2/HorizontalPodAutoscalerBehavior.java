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
package io.yupiik.kubernetes.bindings.v1_31_6.v2;

import io.yupiik.kubernetes.bindings.v1_31_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HorizontalPodAutoscalerBehavior implements Validable<HorizontalPodAutoscalerBehavior>, Exportable {
    private HPAScalingRules scaleDown;
    private HPAScalingRules scaleUp;

    public HorizontalPodAutoscalerBehavior() {
        // no-op
    }

    public HorizontalPodAutoscalerBehavior(final HPAScalingRules scaleDown,
                                           final HPAScalingRules scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    public HPAScalingRules getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(final HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
    }

    public HPAScalingRules getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(final HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scaleDown,
                scaleUp);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerBehavior)) {
            return false;
        }
        final HorizontalPodAutoscalerBehavior __otherCasted = (HorizontalPodAutoscalerBehavior) __other;
        return Objects.equals(scaleDown, __otherCasted.scaleDown) &&
            Objects.equals(scaleUp, __otherCasted.scaleUp);
    }

    public HorizontalPodAutoscalerBehavior scaleDown(final HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
        return this;
    }

    public HorizontalPodAutoscalerBehavior scaleUp(final HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
        return this;
    }

    @Override
    public HorizontalPodAutoscalerBehavior validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (scaleDown != null ? "\"scaleDown\":" + scaleDown.asJson() : ""),
                    (scaleUp != null ? "\"scaleUp\":" + scaleUp.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
