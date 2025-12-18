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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import io.yupiik.kubernetes.bindings.v1_28_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.apps.v1.DaemonSetSpec implements Validable<io.k8s.api.apps.v1.DaemonSetSpec>, Exportable {
    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private LabelSelector selector;
    private PodTemplateSpec template;
    private DaemonSetUpdateStrategy updateStrategy;

    public io.k8s.api.apps.v1.DaemonSetSpec() {
        // no-op
    }

    public io.k8s.api.apps.v1.DaemonSetSpec(final Integer minReadySeconds,
                                            final Integer revisionHistoryLimit,
                                            final LabelSelector selector,
                                            final PodTemplateSpec template,
                                            final DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.template = template;
        this.updateStrategy = updateStrategy;
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                revisionHistoryLimit,
                selector,
                template,
                updateStrategy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.apps.v1.DaemonSetSpec)) {
            return false;
        }
        final io.k8s.api.apps.v1.DaemonSetSpec __otherCasted = (io.k8s.api.apps.v1.DaemonSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy);
    }

    public io.k8s.api.apps.v1.DaemonSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public io.k8s.api.apps.v1.DaemonSetSpec revisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public io.k8s.api.apps.v1.DaemonSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public io.k8s.api.apps.v1.DaemonSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public io.k8s.api.apps.v1.DaemonSetSpec updateStrategy(final DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    @Override
    public io.k8s.api.apps.v1.DaemonSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (template == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "template", "template",
                "Missing 'template' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (minReadySeconds != null ? "\"minReadySeconds\":" + minReadySeconds : ""),
                    (revisionHistoryLimit != null ? "\"revisionHistoryLimit\":" + revisionHistoryLimit : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""),
                    (updateStrategy != null ? "\"updateStrategy\":" + updateStrategy.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
