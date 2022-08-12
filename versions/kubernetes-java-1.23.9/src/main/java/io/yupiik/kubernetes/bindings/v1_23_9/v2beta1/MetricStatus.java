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
package io.yupiik.kubernetes.bindings.v1_23_9.v2beta1;

import io.yupiik.kubernetes.bindings.v1_23_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_9.Validable;
import io.yupiik.kubernetes.bindings.v1_23_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MetricStatus implements Validable<MetricStatus>, Exportable {
    private ContainerResourceMetricStatus containerResource;
    private ExternalMetricStatus external;
    private ObjectMetricStatus object;
    private PodsMetricStatus pods;
    private ResourceMetricStatus resource;
    private String type;

    public MetricStatus() {
        // no-op
    }

    public MetricStatus(final ContainerResourceMetricStatus containerResource,
                        final ExternalMetricStatus external,
                        final ObjectMetricStatus object,
                        final PodsMetricStatus pods,
                        final ResourceMetricStatus resource,
                        final String type) {
        // no-op
    }

    public ContainerResourceMetricStatus getContainerResource() {
        return containerResource;
    }

    public void setContainerResource(final ContainerResourceMetricStatus containerResource) {
        this.containerResource = containerResource;
    }

    public ExternalMetricStatus getExternal() {
        return external;
    }

    public void setExternal(final ExternalMetricStatus external) {
        this.external = external;
    }

    public ObjectMetricStatus getObject() {
        return object;
    }

    public void setObject(final ObjectMetricStatus object) {
        this.object = object;
    }

    public PodsMetricStatus getPods() {
        return pods;
    }

    public void setPods(final PodsMetricStatus pods) {
        this.pods = pods;
    }

    public ResourceMetricStatus getResource() {
        return resource;
    }

    public void setResource(final ResourceMetricStatus resource) {
        this.resource = resource;
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
                containerResource,
                external,
                object,
                pods,
                resource,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MetricStatus)) {
            return false;
        }
        final MetricStatus __otherCasted = (MetricStatus) __other;
        return Objects.equals(containerResource, __otherCasted.containerResource) &&
            Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }

    public MetricStatus containerResource(final ContainerResourceMetricStatus containerResource) {
        this.containerResource = containerResource;
        return this;
    }

    public MetricStatus external(final ExternalMetricStatus external) {
        this.external = external;
        return this;
    }

    public MetricStatus object(final ObjectMetricStatus object) {
        this.object = object;
        return this;
    }

    public MetricStatus pods(final PodsMetricStatus pods) {
        this.pods = pods;
        return this;
    }

    public MetricStatus resource(final ResourceMetricStatus resource) {
        this.resource = resource;
        return this;
    }

    public MetricStatus type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public MetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (containerResource != null ? "\"containerResource\":" + containerResource.asJson() : ""),
                    (external != null ? "\"external\":" + external.asJson() : ""),
                    (object != null ? "\"object\":" + object.asJson() : ""),
                    (pods != null ? "\"pods\":" + pods.asJson() : ""),
                    (resource != null ? "\"resource\":" + resource.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
