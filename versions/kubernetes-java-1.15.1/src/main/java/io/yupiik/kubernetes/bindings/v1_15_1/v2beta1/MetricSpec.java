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
package io.yupiik.kubernetes.bindings.v1_15_1.v2beta1;

import io.yupiik.kubernetes.bindings.v1_15_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_1.Validable;
import io.yupiik.kubernetes.bindings.v1_15_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MetricSpec implements Validable<MetricSpec>, Exportable {
    private ExternalMetricSource external;
    private ObjectMetricSource object;
    private PodsMetricSource pods;
    private ResourceMetricSource resource;
    private String type;

    public MetricSpec() {
        // no-op
    }

    public MetricSpec(final ExternalMetricSource external,
                      final ObjectMetricSource object,
                      final PodsMetricSource pods,
                      final ResourceMetricSource resource,
                      final String type) {
        // no-op
    }

    public ExternalMetricSource getExternal() {
        return external;
    }

    public void setExternal(final ExternalMetricSource external) {
        this.external = external;
    }

    public ObjectMetricSource getObject() {
        return object;
    }

    public void setObject(final ObjectMetricSource object) {
        this.object = object;
    }

    public PodsMetricSource getPods() {
        return pods;
    }

    public void setPods(final PodsMetricSource pods) {
        this.pods = pods;
    }

    public ResourceMetricSource getResource() {
        return resource;
    }

    public void setResource(final ResourceMetricSource resource) {
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
                external,
                object,
                pods,
                resource,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MetricSpec)) {
            return false;
        }
        final MetricSpec __otherCasted = (MetricSpec) __other;
        return Objects.equals(external, __otherCasted.external) &&
            Objects.equals(object, __otherCasted.object) &&
            Objects.equals(pods, __otherCasted.pods) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(type, __otherCasted.type);
    }

    public MetricSpec external(final ExternalMetricSource external) {
        this.external = external;
        return this;
    }

    public MetricSpec object(final ObjectMetricSource object) {
        this.object = object;
        return this;
    }

    public MetricSpec pods(final PodsMetricSource pods) {
        this.pods = pods;
        return this;
    }

    public MetricSpec resource(final ResourceMetricSource resource) {
        this.resource = resource;
        return this;
    }

    public MetricSpec type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public MetricSpec validate() {
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
                    (external != null ? "\"external\":" + external.asJson() : ""),
                    (object != null ? "\"object\":" + object.asJson() : ""),
                    (pods != null ? "\"pods\":" + pods.asJson() : ""),
                    (resource != null ? "\"resource\":" + resource.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
