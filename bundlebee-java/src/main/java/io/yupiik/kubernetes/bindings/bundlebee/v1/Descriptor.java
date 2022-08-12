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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import jakarta.json.bind.annotation.JsonbTransient;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Descriptor implements Validable<Descriptor>, Exportable {
    private Boolean await;
    private List<AwaitConditions> awaitConditions;
    private Conditions includeIf;
    private Boolean interpolate;
    private String location;
    private String name;
    private String type;

    public Descriptor() {
        // no-op
    }

    public Descriptor(final Boolean await,
                      final List<AwaitConditions> awaitConditions,
                      final Conditions includeIf,
                      final Boolean interpolate,
                      final String location,
                      final String name,
                      final String type) {
        // no-op
    }

    public Boolean getAwait() {
        return await;
    }

    public void setAwait(final Boolean await) {
        this.await = await;
    }

    public List<AwaitConditions> getAwaitConditions() {
        return awaitConditions;
    }

    public void setAwaitConditions(final List<AwaitConditions> awaitConditions) {
        this.awaitConditions = awaitConditions;
    }

    public Conditions getIncludeIf() {
        return includeIf;
    }

    public void setIncludeIf(final Conditions includeIf) {
        this.includeIf = includeIf;
    }

    public Boolean getInterpolate() {
        return interpolate;
    }

    public void setInterpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                await,
                awaitConditions,
                includeIf,
                interpolate,
                location,
                name,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Descriptor)) {
            return false;
        }
        final Descriptor __otherCasted = (Descriptor) __other;
        return Objects.equals(await, __otherCasted.await) &&
            Objects.equals(awaitConditions, __otherCasted.awaitConditions) &&
            Objects.equals(includeIf, __otherCasted.includeIf) &&
            Objects.equals(interpolate, __otherCasted.interpolate) &&
            Objects.equals(location, __otherCasted.location) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(type, __otherCasted.type);
    }

    public Descriptor await(final Boolean await) {
        this.await = await;
        return this;
    }

    public Descriptor awaitConditions(final List<AwaitConditions> awaitConditions) {
        this.awaitConditions = awaitConditions;
        return this;
    }

    public Descriptor includeIf(final Conditions includeIf) {
        this.includeIf = includeIf;
        return this;
    }

    public Descriptor interpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
        return this;
    }

    public Descriptor location(final String location) {
        this.location = location;
        return this;
    }

    public Descriptor name(final String name) {
        this.name = name;
        return this;
    }

    public Descriptor type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public Descriptor validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (await != null ? "\"await\":" + await : ""),
                    (awaitConditions != null ? "\"awaitConditions\":" + awaitConditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (includeIf != null ? "\"includeIf\":" + includeIf.asJson() : ""),
                    (interpolate != null ? "\"interpolate\":" + interpolate : ""),
                    (location != null ? "\"location\":\"" +  JsonStrings.escapeJson(location) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @JsonbTransient
    private transient Object underlyingDescriptor;

    public Object underlyingDescriptor() {
        return underlyingDescriptor;
    }

    public Descriptor underlyingDescriptor(final Object instance) {
        underlyingDescriptor = instance;
        return this;
    }
}
