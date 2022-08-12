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
package io.yupiik.kubernetes.bindings.v1_7_5.v1;

import io.yupiik.kubernetes.bindings.v1_7_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_5.Validable;
import io.yupiik.kubernetes.bindings.v1_7_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Initializers implements Validable<Initializers>, Exportable {
    private List<Initializer> pending;
    private Status result;

    public Initializers() {
        // no-op
    }

    public Initializers(final List<Initializer> pending,
                        final Status result) {
        // no-op
    }

    public List<Initializer> getPending() {
        return pending;
    }

    public void setPending(final List<Initializer> pending) {
        this.pending = pending;
    }

    public Status getResult() {
        return result;
    }

    public void setResult(final Status result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Initializers)) {
            return false;
        }
        final Initializers __otherCasted = (Initializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }

    public Initializers pending(final List<Initializer> pending) {
        this.pending = pending;
        return this;
    }

    public Initializers result(final Status result) {
        this.result = result;
        return this;
    }

    @Override
    public Initializers validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (pending == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pending", "pending",
                "Missing 'pending' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pending != null ? "\"pending\":" + pending.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (result != null ? "\"result\":" + result.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
