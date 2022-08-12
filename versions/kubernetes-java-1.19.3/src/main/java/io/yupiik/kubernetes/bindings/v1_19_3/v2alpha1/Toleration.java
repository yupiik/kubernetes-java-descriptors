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
package io.yupiik.kubernetes.bindings.v1_19_3.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_19_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_3.Validable;
import io.yupiik.kubernetes.bindings.v1_19_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Toleration implements Validable<Toleration>, Exportable {
    private String effect;
    private String key;
    private String operator;
    private Integer tolerationSeconds;
    private String value;

    public Toleration() {
        // no-op
    }

    public Toleration(final String effect,
                      final String key,
                      final String operator,
                      final Integer tolerationSeconds,
                      final String value) {
        // no-op
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(final String effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(final Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                effect,
                key,
                operator,
                tolerationSeconds,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Toleration)) {
            return false;
        }
        final Toleration __otherCasted = (Toleration) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }

    public Toleration effect(final String effect) {
        this.effect = effect;
        return this;
    }

    public Toleration key(final String key) {
        this.key = key;
        return this;
    }

    public Toleration operator(final String operator) {
        this.operator = operator;
        return this;
    }

    public Toleration tolerationSeconds(final Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    public Toleration value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public Toleration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (effect != null ? "\"effect\":\"" +  JsonStrings.escapeJson(effect) + "\"" : ""),
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (operator != null ? "\"operator\":\"" +  JsonStrings.escapeJson(operator) + "\"" : ""),
                    (tolerationSeconds != null ? "\"tolerationSeconds\":" + tolerationSeconds : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
