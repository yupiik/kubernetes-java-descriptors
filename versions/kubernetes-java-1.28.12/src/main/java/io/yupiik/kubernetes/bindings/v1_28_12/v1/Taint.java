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
package io.yupiik.kubernetes.bindings.v1_28_12.v1;

import io.yupiik.kubernetes.bindings.v1_28_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_12.Validable;
import io.yupiik.kubernetes.bindings.v1_28_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Taint implements Validable<Taint>, Exportable {
    private String effect;
    private String key;
    private String timeAdded;
    private String value;

    public Taint() {
        // no-op
    }

    public Taint(final String effect,
                 final String key,
                 final String timeAdded,
                 final String value) {
        this.effect = effect;
        this.key = key;
        this.timeAdded = timeAdded;
        this.value = value;
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

    public String getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(final String timeAdded) {
        this.timeAdded = timeAdded;
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
                timeAdded,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Taint)) {
            return false;
        }
        final Taint __otherCasted = (Taint) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(timeAdded, __otherCasted.timeAdded) &&
            Objects.equals(value, __otherCasted.value);
    }

    public Taint effect(final String effect) {
        this.effect = effect;
        return this;
    }

    public Taint key(final String key) {
        this.key = key;
        return this;
    }

    public Taint timeAdded(final String timeAdded) {
        this.timeAdded = timeAdded;
        return this;
    }

    public Taint value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public Taint validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (effect == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "effect", "effect",
                "Missing 'effect' attribute.", true));
        }
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (effect != null ? "\"effect\":\"" +  JsonStrings.escapeJson(effect) + "\"" : ""),
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (timeAdded != null ? "\"timeAdded\":\"" +  JsonStrings.escapeJson(timeAdded) + "\"" : ""),
                    (value != null ? "\"value\":\"" +  JsonStrings.escapeJson(value) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
